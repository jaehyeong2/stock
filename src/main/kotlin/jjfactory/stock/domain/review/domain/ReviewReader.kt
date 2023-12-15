package jjfactory.stock.domain.review.domain

import jjfactory.stock.member.domain.Review
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface ReviewReader {
    fun findById(id: Long): Review
    fun findByMemberId(memberId: Long, pageable: Pageable): Page<ReviewInfo?>
    fun findByProductId(productId: Long, pageable: Pageable): Page<ReviewInfo?>
}