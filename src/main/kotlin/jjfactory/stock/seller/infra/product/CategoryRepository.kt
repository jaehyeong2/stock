package jjfactory.stock.seller.infra.product

import jjfactory.stock.seller.domain.product.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long> {
}