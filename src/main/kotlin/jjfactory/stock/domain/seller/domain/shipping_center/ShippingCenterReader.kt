package jjfactory.stock.domain.seller.domain.shipping_center

interface ShippingCenterReader {
    fun findById(id: Long): ShippingCenter
}