package jjfactory.stock.domain.category.domain

interface CategoryReader {
    fun findById(id: Long): Category
}