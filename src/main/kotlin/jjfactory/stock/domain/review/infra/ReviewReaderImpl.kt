package jjfactory.stock.domain.review.infra

import jjfactory.stock.domain.review.domain.ReviewInfo
import jjfactory.stock.domain.review.domain.ReviewReader
import jjfactory.stock.member.infra.ReviewRepository
import org.springframework.data.domain.Page
import org.springframework.stereotype.Component

@Component
class ReviewReaderImpl(
    private val reviewRepository: ReviewRepository
) : ReviewReader {
    override fun findById(id: Long): ReviewInfo {
        TODO("Not yet implemented")
    }

    override fun findByMemberId(memberId: Long): Page<ReviewInfo> {
        TODO("Not yet implemented")
    }

    override fun findByProductId(memberId: Long): Page<ReviewInfo> {
        TODO("Not yet implemented")
    }
}