package jjfactory.stock.domain.member.domain.address

interface AddressReader {
    fun findById(id: Long): Address
    fun findByMemberId(memberId: Long): List<Address>
    fun findMainAddressByMemberId(memberId: Long): Address
}