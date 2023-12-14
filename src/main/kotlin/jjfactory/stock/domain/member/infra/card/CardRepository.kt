package jjfactory.stock.domain.member.infra.card

import jjfactory.stock.domain.member.domain.card.Card
import org.springframework.data.jpa.repository.JpaRepository

interface CardRepository: JpaRepository<Card, Long> {
}