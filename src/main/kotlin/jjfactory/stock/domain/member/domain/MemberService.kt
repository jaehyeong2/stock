package jjfactory.stock.domain.member.domain

interface MemberService {
    fun join(command: MemberCommand.Create): Long
    fun getMyInfo(id: Long): MemberInfo.Main
    fun update(id: Long, command: MemberCommand.Update): Long
    fun deleteAddress(id: Long)
    fun updateAddress(id: Long)
    fun withdraw(id: Long): Long
}