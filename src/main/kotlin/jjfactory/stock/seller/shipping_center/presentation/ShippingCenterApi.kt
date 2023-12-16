package jjfactory.stock.seller.shipping_center.presentation

import jjfactory.stock.domain.common.CommonPagingResponse
import jjfactory.stock.domain.common.CommonResponse
import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenterInfo
import jjfactory.stock.seller.shipping_center.application.ShippingCenterFacade
import jjfactory.stock.seller.shipping_center.presentation.dto.ShippingCenterDto
import jjfactory.stock.seller.shipping_center.presentation.dto.ShippingCenterDtoMapper
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/sellers/shipping_center")
@RestController
class ShippingCenterApi(
    private val shippingCenterFacade: ShippingCenterFacade,
    private val shippingCenterDtoMapper: ShippingCenterDtoMapper
) {

    @PostMapping
    fun create(@RequestBody request: ShippingCenterDto.Create): CommonResponse<Long> {
        val loginSellerId = 2L
        val command = shippingCenterDtoMapper.toCommand(request)
        return CommonResponse(shippingCenterFacade.create(command, loginSellerId))
    }

    @PatchMapping("/{id}")
    fun update(@PathVariable id: Long,
               @RequestBody request: ShippingCenterDto.Update): CommonResponse<Long> {
        val loginSellerId = 2L
        val command = shippingCenterDtoMapper.toCommand(request)
        return CommonResponse(shippingCenterFacade.update(id, command, loginSellerId))
    }

    @GetMapping
    fun getPage(@PageableDefault pageable: Pageable): CommonPagingResponse<ShippingCenterInfo.Main?> {
        val loginSellerId = 2L
        return CommonPagingResponse(shippingCenterFacade.getPage(loginSellerId, pageable))
    }
}