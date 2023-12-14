package jjfactory.stock.domain.member.domain.card

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class CardServiceTest(

){
    private lateinit var cardRepository: CardRepository

    @BeforeEach
    fun setUp(){
        cardRepository = CardRepository()
    }


    @Test
    fun createTest() {
        val card = CardCommand.Create(
            memberId = 2L,
            alias = "alias",
            cardNumber = "cardNumber",
            expireDate = LocalDateTime.now(),
            cvv = "534"
        ).toEntity()

        val idx = cardRepository.save(card)

        assertThat(idx).isEqualTo(1)
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

    class CardRepository{
        private var idx: Long = 0
        private val map: MutableMap<Card, Long> = HashMap()

        fun save(card: Card): Long{
            map[card] = idx++
            return idx
        }
    }
}

