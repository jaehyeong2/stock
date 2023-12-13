package jjfactory.stock.domain.order.infra.payment

import jjfactory.stock.domain.order.domain.payment.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment, Long> {
}