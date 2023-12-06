package jjfactory.stock.member.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Review(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,

    val userId: Long,
    val productId: Long,
    var rate: Int,
    var content: String
) {

    fun modify(rate: Int, content: String){
        this.rate = rate
        this.content= content
    }
}