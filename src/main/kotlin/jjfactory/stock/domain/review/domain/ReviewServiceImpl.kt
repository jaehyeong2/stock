package jjfactory.stock.domain.review.domain

import jjfactory.stock.domain.common.PagingResponse
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class ReviewServiceImpl(
    private val reviewReader: ReviewReader,
    private val reviewWriter: ReviewWriter
): ReviewService{

    @Transactional
    override fun create(command: ReviewCommand.Create, memberId: Long, productId: Long): Long {
        val review = reviewWriter.write(command.toEntity(memberId, productId))

        return review.id!!
    }

    @Transactional
    override fun delete(id: Long) {
        reviewWriter.deleteById(id)
    }

    @Transactional
    override fun modify(id:Long, command: ReviewCommand.Update) {
        val review = reviewReader.findById(id)
        review.modify(command.rate, command.content)
    }

    @Transactional(readOnly = true)
    override fun findByMemberId(memberId: Long, pageable: Pageable): PagingResponse<ReviewInfo?> {
        return PagingResponse(reviewReader.findByMemberId(memberId, pageable))
    }

    @Transactional(readOnly = true)
    override fun findByProductId(productId: Long, pageable: Pageable): PagingResponse<ReviewInfo?> {
        return PagingResponse(reviewReader.findByProductId(productId, pageable))
    }
}