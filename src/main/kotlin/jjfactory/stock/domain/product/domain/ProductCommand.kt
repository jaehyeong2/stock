package jjfactory.stock.domain.product.domain

class ProductCommand {
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
}