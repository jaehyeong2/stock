package jjfactory.stock.domain.product.infra

import jjfactory.stock.domain.product.domain.Product
import jjfactory.stock.domain.product.domain.ProductReader
import org.springframework.stereotype.Component

@Component
class ProductReaderImpl : ProductReader {
    override fun findById(id: Long): Product {
        TODO("Not yet implemented")
    }
}