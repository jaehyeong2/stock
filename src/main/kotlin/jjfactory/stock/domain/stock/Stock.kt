package jjfactory.stock.domain.stock

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jjfactory.stock.domain.common.BaseEntity

@Entity
class Stock(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    var totalCnt: Long,
    var remainCnt: Long
): BaseEntity() {
    fun increase(value: Long){
        valid(value)

        this.totalCnt += value
        this.remainCnt += value
    }

    fun decrease(value: Long){
        valid(value)

        val decreasedTotal = this.totalCnt - value
        valid(decreasedTotal)

        this.totalCnt = decreasedTotal
        this.remainCnt -= value
    }

    fun syncValue(value: Long){
        this.remainCnt = value
    }

    private fun valid(value : Long){
        if(value < 1L) throw InvalidStockValueException()
    }
}