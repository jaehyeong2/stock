package jjfactory.stock.seller.category.application

import jjfactory.stock.domain.category.domain.CategoryReader
import jjfactory.stock.domain.product.domain.ProductCommand
import jjfactory.stock.domain.product.domain.ProductInfo
import jjfactory.stock.domain.product.domain.ProductReader
import jjfactory.stock.domain.product.domain.ProductWriter
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProductFacade(
    private val productService: ProductService
) {
    fun findById(id: Long): ProductInfo {
        return productService.findById(id)
    }

    fun save(sellerId: Long, command: ProductCommand.Create, categoryId: Long): Long {
        return productService.save(sellerId, command, categoryId)
    }


}