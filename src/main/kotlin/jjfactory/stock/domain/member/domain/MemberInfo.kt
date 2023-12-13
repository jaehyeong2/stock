package jjfactory.stock.domain.member.domain

class MemberInfo {
    data class Main(
        val id: Long,
        val username: String,
        val password: String,
        val disabled: Boolean,
        val phone: String,
        val addresses: List<AddressInfo>
    )

    data class AddressInfo(
        val zipCode:  String,
        val street: String,
        val city: Boolean,
        val alias: String,
        val main: Boolean
    )
}