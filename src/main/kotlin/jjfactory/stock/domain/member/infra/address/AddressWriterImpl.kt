package jjfactory.stock.domain.member.infra.address

import jjfactory.stock.domain.member.domain.address.Address
import jjfactory.stock.domain.member.domain.address.AddressWriter
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class AddressWriterImpl(
    private val addressRepository: AddressRepository
) : AddressWriter {
    override fun write(address: Address): Address {
        return addressRepository.save(address)
    }

    override fun deleteById(id: Long) {
        val address = addressRepository.findByIdOrNull(id) ?: throw NotFoundException()
        addressRepository.delete(address)
    }
}