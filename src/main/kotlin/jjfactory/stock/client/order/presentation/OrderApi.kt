package jjfactory.stock.client.order.presentation

import jjfactory.stock.client.order.application.OrderFacade
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orders")
class OrderApi(
    private val orderFacade: OrderFacade
) {

    @PostMapping
    fun createOrder(){
        orderFacade.order()
    }
}