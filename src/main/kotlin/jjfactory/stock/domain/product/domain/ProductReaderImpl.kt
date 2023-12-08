package jjfactory.stock.domain.product.domain

import org.springframework.stereotype.Component

@Component
class ProductReaderImpl : ProductReader {
    override fun findById(id: Long): ProductInfo {
        TODO("Not yet implemented")
    }
}