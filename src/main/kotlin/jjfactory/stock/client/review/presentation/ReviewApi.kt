package jjfactory.stock.client.review.presentation

import jjfactory.stock.client.review.application.ReviewFacade
import jjfactory.stock.client.review.presentation.dto.ReviewDto
import jjfactory.stock.client.review.presentation.dto.ReviewDtoMapper
import jjfactory.stock.domain.common.CommonPagingResponse
import jjfactory.stock.domain.review.domain.ReviewInfo
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.*

@RequestMapping("/reviews")
@RestController
class ReviewApi(
    private val reviewFacade: ReviewFacade,
    private val reviewDtoMapper: ReviewDtoMapper
) {

    @GetMapping
    fun getMyReviews(@PageableDefault pageable: Pageable): CommonPagingResponse<ReviewInfo?> {
        val loginUserId = 2L
        return CommonPagingResponse(reviewFacade.getMyReviews(loginUserId, pageable))
    }

    @PostMapping
    fun post(@RequestBody request: ReviewDto.CreateRequest) {
        val loginUserId = 2L

        val command = reviewDtoMapper.toCommand(request)
        reviewFacade.create(command, loginUserId)
    }

    @PatchMapping("/{id}")
    fun modify(@RequestBody request: ReviewDto.UpdateRequest, @PathVariable id: Long) {
        val loginUserId = 2L
        val command = reviewDtoMapper.toCommand(request)
        reviewFacade.modify(id, command, loginUserId)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        val loginUserId = 2L
        reviewFacade.delete(id, loginUserId)
    }
}