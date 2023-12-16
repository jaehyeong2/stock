package jjfactory.stock.domain.seller.domain.shipping_center

import jjfactory.stock.domain.common.PagingResponse
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class ShippingCenterServiceImpl(
    private val shippingCenterReader: ShippingCenterReader,
    private val shippingCenterWriter: ShippingCenterWriter
) : ShippingCenterService {

    @Transactional(readOnly = true)
    override fun getPage(sellerId: Long, pageable: Pageable): PagingResponse<ShippingCenterInfo.Main?> {
        return PagingResponse(shippingCenterReader.findBySellerId(sellerId, pageable))
    }

    @Transactional
    override fun create(command: ShippingCenterCommand.Create, sellerId: Long): Long {
        val initCenter = command.toEntity(sellerId)
        val center = shippingCenterWriter.write(initCenter)

        return center.id!!
    }

    @Transactional
    override fun update(id:Long, command: ShippingCenterCommand.Update): Long {
        val center = shippingCenterReader.findById(id)
        center.update(command)

        return center.id!!
    }
}