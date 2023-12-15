package jjfactory.stock.domain.review.domain

import jjfactory.stock.domain.common.PagingResponse
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class ReviewService(
    private val reviewReader: ReviewReader,
    private val reviewWriter: ReviewWriter
) {

    fun create() {

    }

    fun delete() {

    }

    fun modify() {

    }

    @Transactional(readOnly = true)
    fun findByMemberId(memberId: Long, pageable: Pageable): PagingResponse<ReviewInfo?> {
        return PagingResponse(reviewReader.findByMemberId(memberId, pageable))
    }

    @Transactional(readOnly = true)
    fun findByProductId(productId: Long, pageable: Pageable): PagingResponse<ReviewInfo?> {
        return PagingResponse(reviewReader.findByProductId(productId, pageable))
    }
}