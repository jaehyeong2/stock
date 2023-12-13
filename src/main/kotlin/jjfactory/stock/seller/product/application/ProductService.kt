package jjfactory.stock.seller.category.application

import jjfactory.stock.domain.category.domain.CategoryReader
import jjfactory.stock.domain.product.domain.ProductCommand
import jjfactory.stock.domain.product.domain.ProductInfo
import jjfactory.stock.domain.product.domain.ProductReader
import jjfactory.stock.domain.product.domain.ProductWriter
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProductService(
    private val productReader: ProductReader,
    private val productWriter: ProductWriter,
    private val categoryReader: CategoryReader
) {
    @Transactional(readOnly = true)
    fun findById(id: Long): ProductInfo {
        return productReader.findById(id)
    }

    @Transactional
    fun save(sellerId: Long, command: ProductCommand.Create, categoryId: Long): Long {
        val category = categoryReader.findById(categoryId)
        val product = productWriter.write(command.toEntity(category.id!!))
        return product.id!!
    }


}