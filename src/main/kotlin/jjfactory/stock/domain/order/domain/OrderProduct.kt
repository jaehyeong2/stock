package jjfactory.stock.domain.order.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class OrderProduct(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,

    val orderId: Long,
    val productId: Long,
    val qty: Int,
    val totalPrice: Int
) {

}