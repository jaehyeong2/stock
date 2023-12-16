package jjfactory.stock.domain.order.domain.payment

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jjfactory.stock.domain.common.BaseEntity

@Entity
class Payment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    val orderId: Long
): BaseEntity() {


}