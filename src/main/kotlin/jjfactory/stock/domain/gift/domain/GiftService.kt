package jjfactory.stock.domain.gift.domain

interface GiftService {
    fun create(command: GiftCommand.Create): Long
}