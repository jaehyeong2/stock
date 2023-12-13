package jjfactory.stock.seller.category.application

import jjfactory.stock.domain.category.domain.CategoryInfo
import jjfactory.stock.domain.category.domain.CategoryInfoMapper
import jjfactory.stock.domain.category.domain.CategoryReader
import jjfactory.stock.domain.category.domain.CategoryService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CategoryFacade(
    private val categoryService: CategoryService
) {
    @Transactional(readOnly = true)
    fun findById(id: Long): CategoryInfo {
        return categoryService.findById(id)
    }
}