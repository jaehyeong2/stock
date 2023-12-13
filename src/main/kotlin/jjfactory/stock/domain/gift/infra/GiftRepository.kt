package jjfactory.stock.domain.gift.infra

import jjfactory.stock.domain.gift.domain.Gift
import org.springframework.data.jpa.repository.JpaRepository

interface GiftRepository : JpaRepository<Gift, Long>{
    fun findAllByReceiverId(receiverId: Long): List<Gift>
    fun findAllBySenderId(senderId: Long): List<Gift>
}