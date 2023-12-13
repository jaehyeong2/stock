package jjfactory.stock.domain.order.infra.payment

import jjfactory.stock.domain.order.domain.payment.Payment
import jjfactory.stock.domain.order.domain.payment.PaymentWriter
import org.springframework.stereotype.Component

@Component
class PaymentWriterImpl(
    private val paymentRepository: PaymentRepository
) : PaymentWriter {
    override fun write(payment: Payment): Payment {
        return paymentRepository.save(payment)
    }
}