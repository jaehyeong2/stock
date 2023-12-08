package jjfactory.stock.domain.product.infra

import jjfactory.stock.domain.product.domain.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
}