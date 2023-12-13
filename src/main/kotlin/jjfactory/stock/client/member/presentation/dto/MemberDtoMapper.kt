package jjfactory.stock.client.member.presentation.dto

import jjfactory.stock.domain.member.domain.MemberCommand
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface MemberDtoMapper {
    fun toCommand(request: MemberDto.CreateRequest): MemberCommand.Create
    fun toCommand(request: MemberDto.UpdateRequest): MemberCommand.Update
}