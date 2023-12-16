package jjfactory.stock.domain.gift.domain

import jakarta.persistence.*
import jjfactory.stock.domain.common.BaseEntity

@Table(indexes = [
    Index(name = "idx_sender_id", columnList = "senderId"),
    Index(name = "idx_receiver_id", columnList = "receiverId")
])
@Entity
class Gift(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val senderId: Long,
    val receiverId: Long,
    @Enumerated(EnumType.STRING)
    val state: State
): BaseEntity() {
    enum class State {

    }

}