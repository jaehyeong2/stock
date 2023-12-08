package jjfactory.stock.domain.product.infra

import jjfactory.stock.domain.product.domain.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductCategoryRepository : JpaRepository<Product, Long> {
}