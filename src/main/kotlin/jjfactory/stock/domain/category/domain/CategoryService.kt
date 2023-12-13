package jjfactory.stock.domain.category.domain

import jjfactory.stock.domain.category.domain.CategoryCommand
import jjfactory.stock.domain.category.domain.CategoryReader
import jjfactory.stock.domain.category.domain.CategoryWriter
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Component
class CategoryService(
    private val categoryWriter: CategoryWriter,
    private val categoryReader: CategoryReader,
    private val categoryInfoMapper: CategoryInfoMapper
) {
    @Transactional(readOnly = true)
    fun findById(id: Long): CategoryInfo {
        return categoryInfoMapper.toInfo(categoryReader.findById(id))
    }

    @Transactional
    fun create(command: CategoryCommand.Create): Long {
        val parentCategorySortSeq =
            if (command.parentId != null) {
                categoryReader.findById(command.parentId).sortSeq + "-" + command.code
            } else {
                command.code
            }

        val initCategory = command.toEntity(parentCategorySortSeq)
        val category = categoryWriter.writeCategory(initCategory)

        return category.id!!
    }
}