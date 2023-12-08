package jjfactory.stock.domain.order.domain

import jakarta.persistence.*

@Table(name = "orders")
@Entity
class Order(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    val memberId: Long,

    @Enumerated(EnumType.STRING)
    val orderState: OrderState,
    val totalPrice: Long

) {
}