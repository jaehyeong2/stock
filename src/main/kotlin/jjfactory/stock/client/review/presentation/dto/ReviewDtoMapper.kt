package jjfactory.stock.client.review.presentation.dto

import jjfactory.stock.domain.review.domain.ReviewCommand
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ReviewDtoMapper {
    fun toCommand(request: ReviewDto.CreateRequest): ReviewCommand.Create
    fun toCommand(request: ReviewDto.UpdateRequest): ReviewCommand.Update
}