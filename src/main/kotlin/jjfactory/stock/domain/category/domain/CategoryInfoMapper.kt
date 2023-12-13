package jjfactory.stock.domain.category.domain

import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CategoryInfoMapper {
    fun toInfo(category: Category): CategoryInfo
}