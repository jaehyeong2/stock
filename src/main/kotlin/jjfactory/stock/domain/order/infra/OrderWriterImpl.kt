package jjfactory.stock.domain.order.infra

import jjfactory.stock.domain.order.domain.Order
import jjfactory.stock.domain.order.domain.OrderWriter
import org.springframework.stereotype.Component

@Component
class OrderWriterImpl(
    private val orderRepository: OrderRepository
) : OrderWriter {
    override fun write(order: Order): Order {
        return orderRepository.save(order)
    }
}