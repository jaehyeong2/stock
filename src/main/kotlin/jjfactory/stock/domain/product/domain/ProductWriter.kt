package jjfactory.stock.domain.product.domain

interface ProductWriter {
    fun write(product: Product): Product
}