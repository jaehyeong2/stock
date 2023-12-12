package jjfactory.stock.domain.review.infra

import jjfactory.stock.domain.review.domain.ReviewWriter
import jjfactory.stock.member.domain.Review
import jjfactory.stock.member.infra.ReviewRepository
import org.springframework.stereotype.Component

@Component
class ReviewWriterImpl(
    private val reviewRepository: ReviewRepository
) : ReviewWriter {
    override fun write(review: Review): Review {
        return reviewRepository.save(review)
    }
}