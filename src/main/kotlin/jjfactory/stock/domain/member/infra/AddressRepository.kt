package jjfactory.stock.domain.member.infra

import jjfactory.stock.domain.member.domain.Address
import jjfactory.stock.member.domain.Review
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<Address, Long> {
}