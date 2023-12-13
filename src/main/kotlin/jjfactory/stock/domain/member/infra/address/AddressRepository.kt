package jjfactory.stock.domain.member.infra.address

import jjfactory.stock.domain.member.domain.address.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<Address, Long> {
    fun findAllByMemberId(memberId: Long): List<Address>?
    fun findByMemberIdAndMainTrue(memberId: Long): Address
}