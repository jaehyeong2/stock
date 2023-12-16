package jjfactory.stock.domain.member.domain.address

import jakarta.persistence.*
import jjfactory.stock.domain.common.BaseEntity


@Table(indexes = [Index(name = "idx_member_id", columnList = "memberId")])
@Entity
class Address(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val memberId: Long,
    var zipCode: String,
    var street: String,
    var city: String,
    var alias: String,
    var main: Boolean
): BaseEntity() {

    fun updateMainAddress() {
        this.main = true
    }

    fun updateAddress(zipCode: String, street: String, city: String, alias: String) {
        this.zipCode = zipCode
        this.street = street
        this.city = city
        this.alias = alias
    }
}