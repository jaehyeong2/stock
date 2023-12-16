package jjfactory.stock.domain.seller.domain.shipping_center

interface ShippingCenterWriter {
    fun write(shippingCenter: ShippingCenter): ShippingCenter
}