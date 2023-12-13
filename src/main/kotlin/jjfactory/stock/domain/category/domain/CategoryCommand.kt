package jjfactory.stock.domain.category.domain

import java.math.BigDecimal

class CategoryCommand {
    data class Create(
        val parentId: Long?,
        val code: String,
        val name: String,
        val fee: BigDecimal
    ){
        fun toEntity(sortSeq: String): Category{
            return Category(
                code = code,
                sortSeq = sortSeq,
                name = name,
                fee = fee
            )
        }
    }

    data class Update(
        val code: String,
        val sortSeq: String,
        val name: String,
        val fee: BigDecimal
    )
}