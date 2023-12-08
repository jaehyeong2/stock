package jjfactory.stock.seller.product.presentation.dto

import jjfactory.stock.domain.product.domain.ProductCommand
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ProductDtoMapper {
    fun of(dto: ProductDto.Create): ProductCommand.Create
}