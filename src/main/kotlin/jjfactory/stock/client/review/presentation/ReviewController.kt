package jjfactory.stock.client.review.presentation

import jjfactory.stock.client.review.application.ReviewFacade
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/reviews")
@RestController
class ReviewController(
    private val reviewFacade: ReviewFacade
) {
}