package jjfactory.stock.domain.product.domain

class ProductInfo {
    data class Main(
        val id: Long,
        val categoryId: Long,
        val sellerId: Long,
        val exposeName: String,
        val enrollName: String,
        val code: String
    )
}




