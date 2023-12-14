package jjfactory.stock.domain.member.domain.card

import jjfactory.stock.domain.member.infra.card.CardRepository
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime

@SpringBootTest
class CardServiceTest(

){
    @Autowired
    private lateinit var cardWriter: CardWriter
    @Autowired
    private lateinit var cardRepository: CardRepository

    @BeforeEach
    fun setUp(){
        cardRepository.deleteAll()
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

        val idx = cardWriter.write(card).id

        assertThat(idx).isEqualTo(1)
    }
}

