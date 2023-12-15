package jjfactory.stock.domain.review.domain

import jjfactory.stock.domain.common.PagingResponse
import org.springframework.data.domain.Pageable

interface ReviewService {

    fun create(command: ReviewCommand.Create, memberId: Long, productId: Long): Long
    fun delete(id: Long)
    fun modify(id: Long, command: ReviewCommand.Update)
    fun findByMemberId(memberId: Long, pageable: Pageable): PagingResponse<ReviewInfo?>
    fun findByProductId(productId: Long, pageable: Pageable): PagingResponse<ReviewInfo?>
}
