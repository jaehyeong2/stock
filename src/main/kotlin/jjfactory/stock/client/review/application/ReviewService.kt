package jjfactory.stock.client.review.application

import jjfactory.stock.domain.review.domain.ReviewReader
import jjfactory.stock.domain.review.domain.ReviewWriter
import org.springframework.stereotype.Service

@Service
class ReviewService(
    private val reviewReader: ReviewReader,
    private val reviewWriter: ReviewWriter
) {

    fun create(){

    }

    fun delete(){

    }

    fun modify(){

    }

    // my, product
    fun getPage(){

    }
}