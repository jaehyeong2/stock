package jjfactory.stock.seller.infra.product

import jjfactory.stock.seller.domain.product.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
}