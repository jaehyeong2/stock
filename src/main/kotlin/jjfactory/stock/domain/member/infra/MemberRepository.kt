package jjfactory.stock.domain.member.infra

import jjfactory.stock.domain.member.domain.Member
import jjfactory.stock.member.domain.Review
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
}