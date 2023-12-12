package jjfactory.stock.domain.order.domain

interface OrderWriter {
    fun write(order: Order): Order
}