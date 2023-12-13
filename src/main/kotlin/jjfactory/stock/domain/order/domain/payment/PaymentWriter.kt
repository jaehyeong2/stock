package jjfactory.stock.domain.order.domain.payment

interface PaymentWriter {
    fun write(payment: Payment): Payment
}