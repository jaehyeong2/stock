package jjfactory.stock.domain.seller.infra.shipping_center

import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenter
import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenterReader
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class ShippingCenterReaderImpl(
    private val shippingCenterRepository: ShippingCenterRepository
) : ShippingCenterReader {
    override fun findById(id: Long): ShippingCenter {
        return shippingCenterRepository.findByIdOrNull(id) ?: throw NotFoundException()
    }
}