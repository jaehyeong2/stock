package jjfactory.stock.domain.seller.domain.shipping_center

import jjfactory.stock.domain.common.PagingResponse
import org.springframework.data.domain.Pageable

interface ShippingCenterService {
    fun update(id: Long, command: ShippingCenterCommand.Update, sellerId: Long): Long
    fun create(command: ShippingCenterCommand.Create, sellerId: Long): Long
    fun getPage(sellerId: Long, pageable: Pageable): PagingResponse<ShippingCenterInfo.Main?>
}