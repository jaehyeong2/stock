package jjfactory.stock.client.order.application

import jjfactory.stock.domain.order.domain.Order
import jjfactory.stock.domain.order.domain.OrderState
import jjfactory.stock.domain.order.domain.OrderWriter
import org.springframework.context.ApplicationEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class OrderService(
    private val applicationEventPublisher: ApplicationEventPublisher,
    private val orderWriter: OrderWriter
) {

    @Transactional
    fun order() {
        val initOrder = Order(
            memberId = 2L,
            orderState = OrderState.PAYMENT_WAITING,
            totalPrice = 20000
        )

        val order = orderWriter.write(initOrder)

        applicationEventPublisher.publishEvent(OrderedEvent(order.id!!))
    }
}

class OrderedEvent(
    val orderId: Long
): ApplicationEvent(orderId)