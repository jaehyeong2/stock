package jjfactory.stock.domain.member.infra.address

import jjfactory.stock.domain.member.domain.address.Address
import jjfactory.stock.domain.member.domain.address.AddressWriter
import org.springframework.stereotype.Component

@Component
class AddressWriterImpl(
    private val addressRepository: AddressRepository
) : AddressWriter {
    override fun write(address: Address): Address {
        return addressRepository.save(address)
    }
}