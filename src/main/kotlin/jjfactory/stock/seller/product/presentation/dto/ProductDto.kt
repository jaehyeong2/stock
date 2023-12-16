package jjfactory.stock.seller.product.presentation.dto

class ProductDto {
    data class Create(
        val categoryId: Long,
        val exposeName:  String,
        val enrollName: String,
    )

    data class Update(
        val categoryId: Long,
        val exposeName:  String,
        val enrollName: String,
    )

    data class Response(
        val id: Long,
        val categoryId: Long,
        val sellerId: Long,
        val exposeName: String,
        val enrollName: String,
        val code: String
    )
}