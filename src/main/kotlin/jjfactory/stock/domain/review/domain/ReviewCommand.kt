package jjfactory.stock.domain.review.domain

import jjfactory.stock.member.domain.Review

class ReviewCommand {
    data class Create(
        val memberId: Long,
        val productId: Long,
        val rate: Int,
        val content: String
    ) {
        fun toEntity(): Review {
            return Review(
                memberId = memberId,
                productId = productId,
                rate = rate,
                content = content
            )
        }
    }

    data class Update(
        val memberId: Long,
        val productId: Long,
        val rate: Int,
        val content: String
    )
}