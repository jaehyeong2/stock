package jjfactory.stock.domain.seller.infra

import jjfactory.stock.domain.seller.domain.Seller
import org.springframework.data.jpa.repository.JpaRepository

interface SellerRepository : JpaRepository<Seller, Long> {
}