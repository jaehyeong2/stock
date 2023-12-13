package jjfactory.stock.admin.category.application

import jjfactory.stock.domain.category.domain.CategoryCommand
import jjfactory.stock.domain.category.domain.CategoryReader
import jjfactory.stock.domain.category.domain.CategoryService
import jjfactory.stock.domain.category.domain.CategoryWriter
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service("adminCategoryFacade")
class CategoryFacade(
    private val categoryWriter: CategoryWriter,
    private val categoryReader: CategoryReader,
    private val categoryService: CategoryService
) {
    fun create(command: CategoryCommand.Create): Long {
        return categoryService.create(command)
    }
}