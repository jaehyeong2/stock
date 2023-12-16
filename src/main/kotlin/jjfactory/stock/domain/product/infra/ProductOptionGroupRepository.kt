package jjfactory.stock.domain.product.infra

import jjfactory.stock.domain.product.domain.ProductOptionGroup
import org.springframework.data.jpa.repository.JpaRepository

interface ProductOptionGroupRepository : JpaRepository<ProductOptionGroup, Long> {
}