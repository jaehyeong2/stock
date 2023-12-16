package jjfactory.stock.domain.seller.domain.shipping_center

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface ShippingCenterReader {
    fun findById(id: Long): ShippingCenter
    fun findBySellerId(sellerId: Long, pageable: Pageable): Page<ShippingCenterInfo.Main?>
}