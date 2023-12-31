package jjfactory.stock.seller.category.presentation

import jjfactory.stock.domain.category.domain.CategoryInfo
import jjfactory.stock.domain.common.CommonResponse
import jjfactory.stock.seller.category.application.CategoryFacade
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoryApi(
    private val categoryFacade: CategoryFacade
) {
    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long): CommonResponse<CategoryInfo> {
        return CommonResponse(categoryFacade.findById(id))
    }
}