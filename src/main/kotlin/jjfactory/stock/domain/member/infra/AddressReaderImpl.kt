package jjfactory.stock.domain.member.infra

import jjfactory.stock.domain.member.domain.Address
import jjfactory.stock.domain.member.domain.AddressReader
import org.springframework.stereotype.Component

@Component
class AddressReaderImpl(
    private val addressRepository: AddressRepository
) : AddressReader {
    override fun findByMemberId(memberId: Long): List<Address> {
        TODO("Not yet implemented")
    }

    override fun findMainAddressByMemberId(memberId: Long): Address {
        TODO("Not yet implemented")
    }
}