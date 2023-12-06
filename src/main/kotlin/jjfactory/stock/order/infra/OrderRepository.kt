package jjfactory.stock.order.infra

import jjfactory.stock.order.domain.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long>{
}