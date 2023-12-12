package jjfactory.stock.domain.billing.infra

import jjfactory.stock.domain.billing.Billing
import org.springframework.data.jpa.repository.JpaRepository

interface BillingRepository : JpaRepository<Billing, Long> {
}