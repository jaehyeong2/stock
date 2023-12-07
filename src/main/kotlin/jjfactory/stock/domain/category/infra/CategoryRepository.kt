package jjfactory.stock.domain.category.infra

import jjfactory.stock.domain.category.domain.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long> {
}