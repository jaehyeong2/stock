package jjfactory.stock.order.infra

import jjfactory.stock.order.domain.Order
import jjfactory.stock.order.domain.OrderProduct
import org.springframework.data.jpa.repository.JpaRepository

interface OrderProductRepository : JpaRepository<OrderProduct, Long>{
}