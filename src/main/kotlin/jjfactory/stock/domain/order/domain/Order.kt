package jjfactory.stock.domain.order.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "orders")
@Entity
class Order(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    val userId: Long,

    val totalPrice: Long

) {
}