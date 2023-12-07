package jjfactory.stock.domain.seller.domain.product

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    val categoryId: Long,
    var name:  String,
    var code: String
) {
}