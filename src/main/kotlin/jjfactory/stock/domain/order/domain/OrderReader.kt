package jjfactory.stock.domain.order.domain

interface OrderReader {
    fun findById(id: Long)
}