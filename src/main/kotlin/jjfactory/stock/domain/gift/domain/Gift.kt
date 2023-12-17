package jjfactory.stock.domain.gift.domain

import jakarta.persistence.*
import jjfactory.stock.domain.common.BaseEntity
import java.time.LocalDateTime




@Table(indexes = [
    Index(name = "idx_sender_id", columnList = "senderId"),
])
@Entity
class Gift(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val senderId: Long,
    var receiverName: String,
    var receiverPhone: String,
    var receiverZipcode: String,
    var receiverAddress: String,
    var receiverAddressDetail: String,
    var etcMessage: String,

    @Enumerated(EnumType.STRING)
    var state: GiftState = GiftState.INIT,
    @Enumerated(EnumType.STRING)
    val pushType: PushType,
    var paidAt: LocalDateTime,
    var pushedAt: LocalDateTime,
    var acceptedAt: LocalDateTime,
    var expiredAt: LocalDateTime

): BaseEntity() {
    enum class PushType {
        KAKAO, LMS
    }

    fun inPayment(){
        if (this.state !== GiftState.INIT)throw IllegalStateException("Gift inPayment")
        this.state = GiftState.IN_PAYMENT
    }

    fun completePayment(){
        if (this.state !== GiftState.IN_PAYMENT) throw IllegalStateException("Gift paymentComplete")
        this.state = GiftState.ORDER_COMPLETE
        this.paidAt = LocalDateTime.now()
    }

    fun pushLink(){
        if (this.state !== GiftState.ORDER_COMPLETE) throw IllegalStateException("Gift pushLink")
        this.state = GiftState.PUSH_COMPLETE
        this.pushedAt = LocalDateTime.now()
    }

    fun expired() {
        this.state = GiftState.EXPIRATION
        this.expiredAt = LocalDateTime.now()
    }

    fun availableAccept(): Boolean {
        if (this.expiredAt.isBefore(LocalDateTime.now())) return false
        return this.state === GiftState.ORDER_COMPLETE || this.state === GiftState.PUSH_COMPLETE
    }

}