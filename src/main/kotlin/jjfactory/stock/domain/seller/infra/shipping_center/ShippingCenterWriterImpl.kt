package jjfactory.stock.domain.seller.infra.shipping_center

import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenter
import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenterWriter
import org.springframework.stereotype.Component

@Component
class ShippingCenterWriterImpl(
    private val shippingCenterRepository: ShippingCenterRepository
) : ShippingCenterWriter {
    override fun write(shippingCenter: ShippingCenter): ShippingCenter {
        return shippingCenterRepository.save(shippingCenter)
    }
}