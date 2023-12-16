package jjfactory.stock.seller.category.application

import jjfactory.stock.domain.product.domain.ProductCommand
import jjfactory.stock.domain.product.domain.ProductInfo

interface ProductService {
    fun findById(id: Long): ProductInfo.Main
    fun save(sellerId: Long, command: ProductCommand.Create, categoryId: Long): Long
}
