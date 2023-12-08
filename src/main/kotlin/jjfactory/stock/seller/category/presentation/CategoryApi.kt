package jjfactory.stock.seller.category.presentation

import jjfactory.stock.domain.category.domain.CategoryInfo
import jjfactory.stock.domain.common.CommonResponse
import jjfactory.stock.seller.category.application.CategoryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController("/categories")
class CategoryApi(
    private val categoryService: CategoryService
) {
    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long): CommonResponse<CategoryInfo> {
        return CommonResponse(categoryService.findById(id))
    }
}