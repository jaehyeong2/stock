package jjfactory.stock.domain.billing

interface BillingWriter {
    fun write(billing: Billing): Billing
}