package jjfactory.stock.client.review.presentation.dto

class ReviewDto {
    data class CreateRequest(
        val rate: Int,
        val content: String
    )

    data class UpdateRequest(
        val rate: Int,
        val content: String
    )
}