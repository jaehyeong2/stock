package jjfactory.stock.client.review.application

import jjfactory.stock.domain.common.PagingResponse
import jjfactory.stock.domain.review.domain.ReviewCommand
import jjfactory.stock.domain.review.domain.ReviewInfo
import jjfactory.stock.domain.review.domain.ReviewService
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ReviewFacade(
    private val reviewService: ReviewService
) {

    fun create(command: ReviewCommand.Create, loginUserId: Long) {

    }

    fun delete(id: Long, loginUserId: Long) {

    }

    fun modify(id: Long, command: ReviewCommand.Update, loginUserId: Long) {

    }

    // my, product
    fun getPage() {

    }

    fun getMyReviews(loginUserId: Long, pageable: Pageable): PagingResponse<ReviewInfo?> {
        return reviewService.findByMemberId(loginUserId, pageable)
    }
}