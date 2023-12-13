package jjfactory.stock.domain.member.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemberTest {

    @Test
    fun withdraw() {
        val member = Member(
            username = "kim",
            password = "1234",
            phone = "01011112222"
        )

        member.withdraw()
        assertThat(member.disabled).isTrue
    }

    @Test
    fun update() {
        val member = Member(
            username = "kim",
            password = "1234",
            phone = "01011112222"
        )

        member.update("lee", "01012341234")
        assertThat(member.username).isEqualTo("lee")
        assertThat(member.phone).isEqualTo("01012341234")
    }
}