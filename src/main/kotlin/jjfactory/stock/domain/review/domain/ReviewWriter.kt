package jjfactory.stock.domain.review.domain

import jjfactory.stock.member.domain.Review

interface ReviewWriter {
    fun write(review: Review): Review
}