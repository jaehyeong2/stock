package jjfactory.stock.domain.category.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity
class Category(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var code: String,
    var sortSeq: String,
    var name: String,
    var fee: BigDecimal
) {
}