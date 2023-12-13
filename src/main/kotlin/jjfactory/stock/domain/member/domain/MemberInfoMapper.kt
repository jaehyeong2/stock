package jjfactory.stock.domain.member.domain

import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface MemberInfoMapper {
    fun toInfo(member: Member): MemberInfo.Main
}