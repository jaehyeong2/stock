package jjfactory.stock.member.domain

import jakarta.persistence.*
import jjfactory.stock.domain.common.BaseEntity

@Table(
    indexes = [Index(name = "idx_member_id", columnList = "memberId"),
        Index(name = "idx_product_id", columnList = "productId")]
)
@Entity
class Review(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,

    val memberId: Long,
    val productId: Long,
    var rate: Int,
    var content: String
): BaseEntity() {

    fun modify(rate: Int, content: String){
        this.rate = rate
        this.content= content
    }
}