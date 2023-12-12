package jjfactory.stock.client.order.presentation

import jjfactory.stock.client.order.application.OrderService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orders")
class OrderApi(
    private val orderService: OrderService
) {

    @PostMapping
    fun createOrder(){
        orderService.order()
    }
}