package jjfactory.stock.domain.member.infra

import jjfactory.stock.domain.member.domain.Member
import jjfactory.stock.domain.member.domain.MemberWriter
import org.springframework.stereotype.Component

@Component
class MemberWriterImpl(
    private val memberRepository: MemberRepository
) : MemberWriter {
    override fun write(member: Member): Member {
        return memberRepository.save(member)
    }
}