package jjfactory.stock.admin.category.presentation.dto

import java.math.BigDecimal

class CategoryDto {
    data class CreateRequest(
        val parentId: Long?,
        val code: String,
        val sortSeq: String,
        val name: String,
        val fee: BigDecimal
    )

    data class Update(
        val code: String,
        val sortSeq: String,
        val name: String,
        val fee: BigDecimal
    )
}