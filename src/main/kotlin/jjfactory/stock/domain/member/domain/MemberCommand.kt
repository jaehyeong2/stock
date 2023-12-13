package jjfactory.stock.domain.member.domain

class MemberCommand {
    data class Create(
        val id: Long,
        val username: String,
        val password: String,
        val phone: String,
    ){
        fun toEntity(): Member {
            return Member(
                username = username,
                phone = phone,
                password = password
            )
        }
    }

    data class Update(
        val username: String,
        val phone: String,
    )
}