package jjfactory.stock.domain.member.domain.card

import java.time.LocalDateTime

class CardCommand {
        data class Create(
            val memberId: Long,
            val alias: String,
            val cardNumber: String,
            val expireDate: LocalDateTime,
            val cvv: String
        ){
            fun toEntity(): Card{
                return Card(
                    memberId = memberId,
                    alias = alias,
                    cardNumber = cardNumber,
                    expireDate = expireDate,
                    cvv = cvv
                )
            }
        }
    }