package jjfactory.stock.domain.member.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jjfactory.stock.domain.common.BaseEntity

@Entity
class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    var username:  String,
    var password: String,
    var disabled: Boolean = false,
    @Column(unique = true)
    var phone: String,
): BaseEntity() {
    fun withdraw(){
        this.disabled = true
    }

    fun update(username: String, phone: String){
        this.username = username
        this.phone = phone
    }
}