package jjfactory.stock.domain.product.domain

import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ProductInfoMapper {
    fun toInfo(product: Product): ProductInfo.Main
}