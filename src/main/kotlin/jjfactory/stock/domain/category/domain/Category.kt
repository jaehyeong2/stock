package jjfactory.stock.domain.category.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Category(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    //유니크 - 셀러 + 코드
    val sellerId: Long,
    var code: String,
    var name: String
) {
}