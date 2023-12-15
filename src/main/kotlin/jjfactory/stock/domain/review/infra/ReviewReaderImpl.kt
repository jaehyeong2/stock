package jjfactory.stock.domain.review.infra

import jjfactory.stock.domain.review.domain.ReviewInfo
import jjfactory.stock.domain.review.domain.ReviewReader
import jjfactory.stock.member.domain.Review
import jjfactory.stock.member.infra.ReviewRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class ReviewReaderImpl(
    private val reviewRepository: ReviewRepository,
) : ReviewReader {
    override fun findById(id: Long): Review {
        return reviewRepository.findByIdOrNull(id) ?: throw NotFoundException()
    }

    override fun findByMemberId(memberId: Long, pageable: Pageable): Page<ReviewInfo?> {
        return reviewRepository.findPage(pageable){
            selectNew<ReviewInfo>(
                path(Review::id),
                path(Review::memberId),
                path(Review::productId),
                path(Review::rate),
                path(Review::content),
            ).from(
                entity(Review::class)
            ).where(
                path(Review::memberId).eq(memberId)
            )
        }
    }

    override fun findByProductId(productId: Long, pageable: Pageable): Page<ReviewInfo?> {
        return reviewRepository.findPage(pageable){
            selectNew<ReviewInfo>(
                path(Review::id),
                path(Review::memberId),
                path(Review::productId),
                path(Review::rate),
                path(Review::content),
            ).from(
                entity(Review::class)
            ).where(
                path(Review::productId).eq(productId)
            )
        }
    }
}