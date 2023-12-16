package jjfactory.stock.domain.product.infra

import jjfactory.stock.domain.product.domain.ProductOption
import org.springframework.data.jpa.repository.JpaRepository

interface ProductOptionRepository : JpaRepository<ProductOption, Long> {
}