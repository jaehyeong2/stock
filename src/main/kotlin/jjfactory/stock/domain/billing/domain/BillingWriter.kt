package jjfactory.stock.domain.billing.domain

interface BillingWriter {
    fun write(billing: Billing): Billing
}