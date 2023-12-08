package jjfactory.stock.domain.product.domain

class ProductCommand {
    data class Create(
        val sellerId: Long,
        val exposeName:  String,
        val enrollName: String,
        val code: String
    ){
        fun toEntity(categoryId: Long): Product {
            return Product(
                categoryId = categoryId,
                sellerId = sellerId,
                exposeName = exposeName,
                enrollName = enrollName,
                code = code
            )
        }
    }

    data class Update(
        val categoryId: Long,
        val sellerId: Long,
        val exposeName:  String,
        val enrollName: String,
    )
}