package jjfactory.stock.client.member.presentation

import jjfactory.stock.client.member.application.MemberFacade
import jjfactory.stock.client.member.presentation.dto.MemberDto
import jjfactory.stock.client.member.presentation.dto.MemberDtoMapper
import jjfactory.stock.domain.common.CommonResponse
import jjfactory.stock.domain.member.domain.MemberInfo
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/members")
@RestController
class MemberApi(
    private val memberFacade: MemberFacade,
    private val memberDtoMapper: MemberDtoMapper
) {
    @PostMapping
    fun join(@RequestBody request: MemberDto.CreateRequest): CommonResponse<Long> {
        val command = memberDtoMapper.toCommand(request)
        return CommonResponse.created(memberFacade.join(command))
    }

    @GetMapping
    fun getMyInfo(): CommonResponse<MemberInfo.Main> {
        val loginMemberId = 2L
        return CommonResponse(memberFacade.getMyInfo(loginMemberId))
    }

    @PatchMapping
    fun update(@RequestBody request: MemberDto.UpdateRequest): CommonResponse<Long> {
        val loginMemberId = 2L
        val command = memberDtoMapper.toCommand(request)
        return CommonResponse(memberFacade.update(loginMemberId, command))
    }

    @DeleteMapping
    fun withdraw(): CommonResponse<Long> {
        val loginMemberId = 2L
        return CommonResponse(memberFacade.withdraw(loginMemberId))
    }

    @DeleteMapping("/address/{id}")
    fun deleteAddress(@PathVariable id: Long){
        val loginMemberId = 2L
        memberFacade.deleteAddress(id)
    }
}