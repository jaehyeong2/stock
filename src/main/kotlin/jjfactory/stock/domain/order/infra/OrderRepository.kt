package jjfactory.stock.domain.order.infra

import jjfactory.stock.domain.order.domain.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long>{
}