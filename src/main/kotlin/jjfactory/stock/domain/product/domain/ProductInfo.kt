package jjfactory.stock.domain.product.domain

data class ProductInfo(
    val id :Long,
    val categoryId: Long,
    val exposeName:  String,
    val enrollName: String,
    val code: String
)
