package jjfactory.stock.client.member.presentation.dto

class MemberDto {
    data class CreateRequest(
        val id: Long,
        val username: String,
        val password: String,
        val phone: String,
    )

    data class UpdateRequest(
        val username: String,
        val phone: String,
    )
}