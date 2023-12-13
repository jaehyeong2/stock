package jjfactory.stock.admin.category.presentation.dto

import jjfactory.stock.domain.category.domain.CategoryCommand
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CategoryDtoMapper {
    fun toCommand(categoryDto: CategoryDto.CreateRequest): CategoryCommand.Create
}