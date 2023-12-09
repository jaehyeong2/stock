package jjfactory.stock.domain.stock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StockTest {

    @Test
    @DisplayName("재고 정상 증가")
    fun increase(){
        val stock = Stock(totalCnt = 100, remainCnt = 100)

        stock.increase(100)

        assertThat(stock.remainCnt).isEqualTo(200)
        assertThat(stock.totalCnt).isEqualTo(200)
    }

    @Test
    @DisplayName("재고 정상 감소")
    fun decrease(){
        val stock = Stock(totalCnt = 100, remainCnt = 100)

        stock.decrease(50)

        assertThat(stock.remainCnt).isEqualTo(50)
        assertThat(stock.totalCnt).isEqualTo(50)
    }

    @Test
    @DisplayName("재고 정상 감소")
    fun syncValue(){
        val stock = Stock(totalCnt = 100, remainCnt = 100)

        stock.syncValue(200)

        assertThat(stock.remainCnt).isEqualTo(200)
    }

    @Test
    @DisplayName("재고 0 늘리면 익셉션")
    fun increaseThrow(){
        val stock = Stock(totalCnt = 100, remainCnt = 100)

        assertThatThrownBy {
            stock.increase(0)
        }.isInstanceOf(InvalidStockValueException::class.java)
    }

    @Test
    @DisplayName("재고 0 줄이면  익셉션")
    fun decreaseThrow(){
        val stock = Stock(totalCnt = 100, remainCnt = 100)

        assertThatThrownBy {
            stock.decrease(0)
        }.isInstanceOf(InvalidStockValueException::class.java)
    }

    @Test
    @DisplayName("재고 0으로 줄이면 익셉션")
    fun decreaseAllThrow(){
        val stock = Stock(totalCnt = 100, remainCnt = 100)

        assertThatThrownBy {
            stock.decrease(100)
        }.isInstanceOf(InvalidStockValueException::class.java)
    }
}