package jjfactory.stock.domain.member.domain

interface MemberReader {
    fun findById(id: Long): Member
}