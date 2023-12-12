package jjfactory.stock.domain.review.domain

import org.springframework.data.domain.Page

interface ReviewReader {
    fun findById(id: Long): ReviewInfo
    fun findByMemberId(memberId: Long): Page<ReviewInfo>
    fun findByProductId(memberId: Long): Page<ReviewInfo>
}