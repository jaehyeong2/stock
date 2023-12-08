package jjfactory.stock.domain.product.infra

import jjfactory.stock.domain.product.domain.Product
import jjfactory.stock.domain.product.domain.ProductWriter
import org.springframework.stereotype.Component

@Component
class ProductWriterImpl(
    private val productRepository: ProductRepository
) : ProductWriter {
    override fun write(product: Product): Product {
        return productRepository.save(product)
    }
}