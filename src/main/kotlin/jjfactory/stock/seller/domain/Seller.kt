package jjfactory.stock.seller.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Seller(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    var name:  String,
    var bizNumber: String

) {
}