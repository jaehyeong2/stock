package jjfactory.stock.domain.member.domain.address

interface AddressReader {
    fun findByMemberId(memberId: Long): List<Address>
    fun findMainAddressByMemberId(memberId: Long): Address
}