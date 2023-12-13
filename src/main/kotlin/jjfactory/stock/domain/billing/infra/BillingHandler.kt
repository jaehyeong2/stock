package jjfactory.stock.domain.billing.infra

import jjfactory.stock.client.order.application.OrderedEvent
import jjfactory.stock.domain.billing.domain.Billing
import jjfactory.stock.domain.billing.domain.BillingWriter
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import org.springframework.transaction.event.TransactionalEventListener

@Component
class BillingHandler(
    private val billingWriter: BillingWriter,
) {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @TransactionalEventListener
    fun orderCreatedListener(event: OrderedEvent){
        val initBilling = Billing(
            orderId = event.orderId
        )

        billingWriter.write(initBilling)
    }
}