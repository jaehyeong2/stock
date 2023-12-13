package jjfactory.stock.domain.member.domain.address

interface AddressWriter {
    fun write(address: Address): Address
    fun deleteById(addressId: Long)
}