package jjfactory.stock.domain.seller.infra.shipping_center

import com.linecorp.kotlinjdsl.support.spring.data.jpa.repository.KotlinJdslJpqlExecutor
import jjfactory.stock.domain.seller.domain.shipping_center.ShippingCenter
import org.springframework.data.jpa.repository.JpaRepository

interface ShippingCenterRepository: JpaRepository<ShippingCenter, Long>, KotlinJdslJpqlExecutor {
}