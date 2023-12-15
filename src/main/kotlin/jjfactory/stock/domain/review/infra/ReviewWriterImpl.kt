package jjfactory.stock.domain.review.infra

import jjfactory.stock.domain.review.domain.ReviewWriter
import jjfactory.stock.member.domain.Review
import jjfactory.stock.member.infra.ReviewRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class ReviewWriterImpl(
    private val reviewRepository: ReviewRepository
) : ReviewWriter {
    override fun write(review: Review): Review {
        return reviewRepository.save(review)
    }

    override fun deleteById(id: Long) {
        val review = reviewRepository.findByIdOrNull(id) ?: throw NotFoundException()
        reviewRepository.delete(review)
    }
}