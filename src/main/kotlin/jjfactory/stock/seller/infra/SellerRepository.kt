package jjfactory.stock.seller.infra

import jjfactory.stock.seller.domain.Seller
import org.springframework.data.jpa.repository.JpaRepository

interface SellerRepository : JpaRepository<Seller, Long> {
}