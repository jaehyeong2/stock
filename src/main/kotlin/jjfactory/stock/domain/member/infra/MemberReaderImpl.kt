package jjfactory.stock.domain.member.infra

import jjfactory.stock.domain.member.domain.Member
import jjfactory.stock.domain.member.domain.MemberReader
import org.springframework.stereotype.Component

@Component
class MemberReaderImpl : MemberReader {
    override fun findById(id: Long): Member {
        TODO("Not yet implemented")
    }
}