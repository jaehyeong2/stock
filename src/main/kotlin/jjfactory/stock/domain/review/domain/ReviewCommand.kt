package jjfactory.stock.domain.review.domain

import jjfactory.stock.member.domain.Review

class ReviewCommand {
    data class Create(
        val rate: Int,
        val content: String
    ) {
        fun toEntity(memberId:Long, productId: Long): Review {
            return Review(
                memberId = memberId,
                productId = productId,
                rate = rate,
                content = content
            )
        }
    }

    data class Update(
        val rate: Int,
        val content: String
    )
}