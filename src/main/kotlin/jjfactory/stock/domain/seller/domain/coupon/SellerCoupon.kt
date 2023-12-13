package jjfactory.stock.domain.seller.domain.coupon

import jakarta.persistence.*
import jjfactory.stock.domain.stock.Stock
import jjfactory.stock.domain.stock.StockNotExistException


//쿠폰 업데이트 되도 이이전 발행된 쿠폰은 스냅샷 형태로..
@Table(indexes = [Index(name = "idx_seller_id", columnList = "sellerId")])
@Entity
class SellerCoupon(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    val sellerId: Long,
    @OneToOne(fetch = FetchType.LAZY)
    val stock: Stock? = null,
    var name:  String,
    var minPrice: Int

) {
    fun hasStock(): Boolean {
        return stock != null
    }

    fun increaseStock(value: Long){
        checkStockExist()
        stock!!.increase(value)
    }

    fun decreaseStock(value: Long){
        checkStockExist()
        stock!!.decrease(value)
    }

    fun syncStock(value: Long){
        checkStockExist()
        stock!!.syncValue(value)
    }

    private fun checkStockExist(){
        if (!hasStock()) throw StockNotExistException()
    }
}