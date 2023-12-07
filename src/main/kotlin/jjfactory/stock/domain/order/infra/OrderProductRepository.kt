package jjfactory.stock.domain.order.infra

import jjfactory.stock.domain.order.domain.Order
import jjfactory.stock.domain.order.domain.OrderProduct
import org.springframework.data.jpa.repository.JpaRepository

interface OrderProductRepository : JpaRepository<OrderProduct, Long>{
}