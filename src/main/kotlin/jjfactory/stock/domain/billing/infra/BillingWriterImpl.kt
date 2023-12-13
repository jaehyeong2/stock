package jjfactory.stock.domain.billing.infra

import jjfactory.stock.domain.billing.domain.Billing
import jjfactory.stock.domain.billing.domain.BillingWriter
import org.springframework.stereotype.Component

@Component
class BillingWriterImpl(
    private val billingRepository: BillingRepository
) : BillingWriter {
    override fun write(billing: Billing): Billing {
        return billingRepository.save(billing)
    }
}