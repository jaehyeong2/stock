package jjfactory.stock.seller.shipping_center.application

import jjfactory.stock.domain.common.PagingResponse
import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenterCommand
import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenterInfo
import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenterService
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ShippingCenterFacade(
    private val shippingCenterService: ShippingCenterService
) {
    fun create(command: ShippingCenterCommand.Create, sellerId: Long): Long {
        return shippingCenterService.create(command, sellerId)
    }

    fun update(id: Long, command: ShippingCenterCommand.Update, loginSellerId: Long): Long {
        return shippingCenterService.update(id, command, loginSellerId)
    }

    fun getPage(sellerId: Long, pageable: Pageable): PagingResponse<ShippingCenterInfo.Main?> {
        return shippingCenterService.getPage(sellerId, pageable)
    }
}