package jjfactory.stock.domain.product.domain

import jakarta.persistence.*
import jjfactory.stock.domain.common.BaseEntity

@Entity
class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val categoryId: Long,
    val sellerId: Long,
    var exposeName: String,
    var enrollName: String,
    val code: String,
    @Enumerated(EnumType.STRING)
    var state: ProductState
) : BaseEntity() {

    fun changePreParing(){
        state = ProductState.PREPARING
    }

    fun changeOnSales(){
        state = ProductState.ON_SALES
    }

    fun endOfSales(){
        state = ProductState.END_OF_SALE
    }
}