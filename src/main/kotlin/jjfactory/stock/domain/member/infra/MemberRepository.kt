package jjfactory.stock.domain.member.infra

import jjfactory.stock.member.domain.Review
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Review, Long> {
}