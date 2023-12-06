package jjfactory.stock.member.infra

import jjfactory.stock.member.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
}