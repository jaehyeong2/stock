package jjfactory.stock.domain.member.domain

interface AddressReader {
    fun findByMemberId(memberId: Long): List<Address>
    fun findMainAddressByMemberId(memberId: Long): Address
}