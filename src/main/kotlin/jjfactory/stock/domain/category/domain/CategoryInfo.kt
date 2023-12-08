package jjfactory.stock.domain.category.domain

import java.math.BigDecimal

class CategoryInfo(
    val id: Long,
    var code: String,
    var sortSeq: String,
    var name: String,
    var fee: BigDecimal
) {
}