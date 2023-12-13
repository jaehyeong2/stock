package jjfactory.stock.domain.order.infra.payment

import jjfactory.stock.client.order.application.OrderedEvent
import jjfactory.stock.domain.order.domain.payment.Payment
import jjfactory.stock.domain.order.domain.payment.PaymentWriter
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import org.springframework.transaction.event.TransactionalEventListener

@Component
class PaymentHandler(
    private val paymentWriter: PaymentWriter,
) {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @TransactionalEventListener
    fun orderCreatedListener(event: OrderedEvent){
        val initPayment = Payment(
            orderId = event.orderId
        )

        paymentWriter.write(initPayment)
    }
}