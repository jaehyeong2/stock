package jjfactory.stock.domain.member.domain

import jakarta.persistence.*


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

    fun updateMainAddress(){
        this.main = true
    }
}