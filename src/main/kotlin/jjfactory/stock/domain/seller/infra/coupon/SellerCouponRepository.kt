package jjfactory.stock.domain.seller.infra.coupon

import jjfactory.stock.domain.seller.domain.coupon.SellerCoupon
import org.springframework.data.jpa.repository.JpaRepository

interface SellerCouponRepository : JpaRepository<SellerCoupon, Long> {
}