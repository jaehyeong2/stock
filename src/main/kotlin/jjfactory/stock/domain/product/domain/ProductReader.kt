package jjfactory.stock.domain.product.domain

interface ProductReader {
    fun findById(id: Long): ProductInfo
}