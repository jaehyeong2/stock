package jjfactory.stock.domain.seller.infra.shipping_center

import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenter
import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenterInfo
import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenterReader
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class ShippingCenterReaderImpl(
    private val shippingCenterRepository: ShippingCenterRepository
) : ShippingCenterReader {
    override fun findById(id: Long): ShippingCenter {
        return shippingCenterRepository.findByIdOrNull(id) ?: throw NotFoundException()
    }

    override fun findBySellerId(sellerId: Long, pageable: Pageable): Page<ShippingCenterInfo.Main?> {
        return shippingCenterRepository.findPage(pageable) {
            selectNew<ShippingCenterInfo.Main>(
                path(ShippingCenter::id),
                path(ShippingCenter::name),
                path(ShippingCenter::contactNumber),
                path(ShippingCenter::zipCode),
                path(ShippingCenter::address),
                path(ShippingCenter::addressDetail),
            ).from(
                entity(ShippingCenter::class)
            ).where(
                path(ShippingCenter::sellerId).eq(sellerId)
            )
        }
    }
}