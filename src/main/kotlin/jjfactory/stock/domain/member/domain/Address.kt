package jjfactory.stock.domain.member.domain

import jakarta.persistence.*


//회원은 여러 주소를 가질 수 있다.
@Table(indexes = [Index(name = "idx_member_id", columnList = "memberId")])
@Entity
class Address(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    val memberId: Long,
    var zipCode:  String,
    var street: String,
    var city: Boolean,
    var alias: String,
    var main: Boolean
) {
}