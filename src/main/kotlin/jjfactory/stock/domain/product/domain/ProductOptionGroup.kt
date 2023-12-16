package jjfactory.stock.domain.product.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jjfactory.stock.domain.common.BaseEntity

@Entity
class ProductOptionGroup(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    val productId: Long,
    var name: String,
    var seq: Int
):BaseEntity() {
}