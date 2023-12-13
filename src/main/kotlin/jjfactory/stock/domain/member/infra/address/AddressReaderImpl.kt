package jjfactory.stock.domain.member.infra.address

import jjfactory.stock.domain.member.domain.address.Address
import jjfactory.stock.domain.member.domain.address.AddressReader
import org.springframework.stereotype.Component

@Component
class AddressReaderImpl(
    private val addressRepository: AddressRepository
) : AddressReader {
    override fun findById(id: Long): Address {
        TODO("Not yet implemented")
    }

    override fun findByMemberId(memberId: Long): List<Address> {
        TODO("Not yet implemented")
    }

    override fun findMainAddressByMemberId(memberId: Long): Address {
        TODO("Not yet implemented")
    }
}