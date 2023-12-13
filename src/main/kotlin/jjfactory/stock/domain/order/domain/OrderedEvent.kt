package jjfactory.stock.domain.order.domain

import org.springframework.context.ApplicationEvent

class OrderedEvent(
    orderId: Long
) : ApplicationEvent(orderId)