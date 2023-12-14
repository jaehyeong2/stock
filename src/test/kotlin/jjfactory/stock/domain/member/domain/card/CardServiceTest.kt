package jjfactory.stock.domain.member.domain.card

import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class CardServiceTest {

    @Test
    fun createTest() {
        CardCommand.Create(
            memberId = 2L,
            alias = "alias",
            cardNumber = "cardNumber",
            expireDate = LocalDateTime.now(),
            cvv = "534"
        )
    }

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

    class Card(
        val memberId: Long,
        val alias: String,
        val cardNumber: String,
        val expireDate: LocalDateTime,
        val cvv: String
    )
}

