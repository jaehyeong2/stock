package jjfactory.stock.domain.gift.infra

import jjfactory.stock.domain.gift.domain.Gift
import jjfactory.stock.domain.gift.domain.GiftWriter
import org.springframework.stereotype.Component

@Component
class GiftWriterImpl(
    private val giftRepository: GiftRepository
) : GiftWriter {
    override fun write(gift: Gift): Gift {
        return giftRepository.save(gift)
    }
}