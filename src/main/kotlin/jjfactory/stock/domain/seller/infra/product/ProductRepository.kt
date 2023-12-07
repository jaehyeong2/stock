package jjfactory.stock.domain.seller.infra.product

import jjfactory.stock.domain.seller.domain.product.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
}