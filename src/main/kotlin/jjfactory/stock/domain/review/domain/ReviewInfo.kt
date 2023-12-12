package jjfactory.stock.domain.review.domain

data class ReviewInfo(
    val id :Long,
    val memberId: Long,
    val productId: Long,
    val rate: Int,
    val content: String
)
