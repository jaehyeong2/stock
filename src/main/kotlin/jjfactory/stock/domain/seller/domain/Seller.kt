package jjfactory.stock.domain.seller.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jjfactory.stock.domain.common.BaseEntity

@Entity
class Seller(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    var name:  String,
    var bizNumber: String

): BaseEntity() {
}