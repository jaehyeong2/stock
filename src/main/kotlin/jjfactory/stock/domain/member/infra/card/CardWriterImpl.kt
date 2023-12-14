package jjfactory.stock.domain.member.infra.card

import jjfactory.stock.domain.member.domain.card.Card
import jjfactory.stock.domain.member.domain.card.CardWriter
import org.springframework.stereotype.Component

@Component
class CardWriterImpl(
    private val cardRepository: CardRepository
) : CardWriter {
    override fun write(card: Card): Card {
        return cardRepository.save(card)
    }
}