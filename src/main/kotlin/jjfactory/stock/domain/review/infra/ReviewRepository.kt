package jjfactory.stock.member.infra

import jjfactory.stock.member.domain.Review
import org.springframework.data.jpa.repository.JpaRepository

interface ReviewRepository : JpaRepository<Review, Long> {
}