package jjfactory.stock.domain.category.infra

import jjfactory.stock.domain.category.domain.Category
import jjfactory.stock.domain.category.domain.CategoryReader
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class CategoryReaderImpl(
    private val categoryRepository: CategoryRepository
) : CategoryReader {
    override fun findById(id: Long): Category {
        return categoryRepository.findByIdOrNull(id) ?: throw RuntimeException()
    }
}