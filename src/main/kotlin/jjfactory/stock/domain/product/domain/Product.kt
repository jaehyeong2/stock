package jjfactory.stock.domain.product.domain

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
    val sellerId: Long,
    var exposeName:  String,
    var enrollName: String,
    var code: String
) {
}