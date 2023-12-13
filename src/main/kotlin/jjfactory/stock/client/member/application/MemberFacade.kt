package jjfactory.stock.client.member.application

import jjfactory.stock.domain.member.domain.MemberCommand
import jjfactory.stock.domain.member.domain.MemberInfo
import jjfactory.stock.domain.member.domain.MemberService
import org.springframework.stereotype.Service

@Service
class MemberFacade(
    private val memberService: MemberService
) {
    fun join(command: MemberCommand.Create): Long {
        return memberService.join(command)
    }

    fun getMyInfo(id: Long): MemberInfo.Main {
        return memberService.getMyInfo(id)
    }

    fun update(id: Long, command: MemberCommand.Update): Long {
        return memberService.update(id, command)
    }

    fun deleteAddress(id: Long) {
        memberService.deleteAddress(id)
    }

    fun withdraw(id: Long): Long {
        return memberService.withdraw(id)
    }
}