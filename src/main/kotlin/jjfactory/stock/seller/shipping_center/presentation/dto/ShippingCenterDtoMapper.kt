package jjfactory.stock.seller.shipping_center.presentation.dto

import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenterCommand
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ShippingCenterDtoMapper {
    fun toCommand(request: ShippingCenterDto.Create): ShippingCenterCommand.Create
    fun toCommand(request: ShippingCenterDto.Update): ShippingCenterCommand.Update
}