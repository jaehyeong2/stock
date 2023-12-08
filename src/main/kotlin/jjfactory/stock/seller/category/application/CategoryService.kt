package jjfactory.stock.seller.category.application

import jjfactory.stock.domain.category.domain.CategoryInfo
import jjfactory.stock.domain.category.domain.CategoryReader
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CategoryService(
    private val categoryReader: CategoryReader
) {
    @Transactional(readOnly = true)
    fun findById(id: Long): CategoryInfo{
        return categoryReader.findById(id)
    }
}