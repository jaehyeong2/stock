package jjfactory.stock.seller.category.application

import jjfactory.stock.domain.category.domain.CategoryInfo
import jjfactory.stock.domain.category.domain.CategoryReader
import jjfactory.stock.domain.product.domain.ProductInfo
import jjfactory.stock.domain.product.domain.ProductReader
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProductService(
    private val productReader: ProductReader
) {
    @Transactional(readOnly = true)
    fun findById(id: Long): ProductInfo {
        return productReader.findById(id)
    }
}