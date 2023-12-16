package jjfactory.stock.domain.member.domain.card

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jjfactory.stock.domain.common.BaseEntity
import java.time.LocalDateTime

@Entity
class Card(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val memberId: Long,
    var alias: String,
    val cardNumber: String,
    val expireDate: LocalDateTime,
    val cvv: String
) : BaseEntity() {

}
