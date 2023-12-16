package jjfactory.stock.seller.category.application

import jjfactory.stock.domain.category.domain.CategoryReader
import jjfactory.stock.domain.product.domain.*
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProductServiceImpl(
    private val productReader: ProductReader,
    private val productWriter: ProductWriter,
    private val categoryReader: CategoryReader,
    private val productInfoMapper: ProductInfoMapper
): ProductService {
    @Transactional(readOnly = true)
    override fun findById(id: Long): ProductInfo.Main {
        val product = productReader.findById(id)
        return productInfoMapper.toInfo(product)
    }

    @Transactional
    override fun save(sellerId: Long, command: ProductCommand.Create, categoryId: Long): Long {
        val category = categoryReader.findById(categoryId)
        val product = productWriter.write(command.toEntity(category.id!!))
        return product.id!!
    }


}