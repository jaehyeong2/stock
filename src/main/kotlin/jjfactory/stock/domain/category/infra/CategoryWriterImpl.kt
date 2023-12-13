package jjfactory.stock.domain.category.infra

import jjfactory.stock.domain.category.domain.Category
import jjfactory.stock.domain.category.domain.CategoryWriter
import org.springframework.stereotype.Component

@Component
class CategoryWriterImpl(
    private val categoryRepository: CategoryRepository
) : CategoryWriter {
    override fun writeCategory(category: Category): Category {
        return categoryRepository.save(category)
    }
}