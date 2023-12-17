package jjfactory.stock.domain.gift.domain

interface GiftReader {
    fun findById(id: Long): Gift
    fun findBySenderId(senderId: Long): List<Gift>
}