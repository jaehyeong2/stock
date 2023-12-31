package jjfactory.stock.admin.category.presentation

import jjfactory.stock.admin.category.application.CategoryFacade
import jjfactory.stock.admin.category.presentation.dto.CategoryDto
import jjfactory.stock.admin.category.presentation.dto.CategoryDtoMapper
import jjfactory.stock.domain.common.CommonResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/admin/categories")
@RestController("adminCategoryApi")
class CategoryApi(
    private val categoryDtoMapper: CategoryDtoMapper,
    private val categoryFacade: CategoryFacade
) {

    @PostMapping
    fun create(request: CategoryDto.CreateRequest): CommonResponse<Long> {
        val command = categoryDtoMapper.toCommand(request)
        return CommonResponse.created(categoryFacade.create(command))
    }
}