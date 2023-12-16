package jjfactory.stock.domain.seller.domain.shipping_center

import jjfactory.stock.domain.seller.infra.shipping_center.ShippingCenterRepository
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import org.springframework.transaction.annotation.Transactional
import java.lang.RuntimeException

@SpringBootTest
class ShippingCenterServiceImplTest {
    @Autowired
    private lateinit var shippingCenterService: ShippingCenterServiceImpl
    @Autowired
    private lateinit var shippingCenterRepository: ShippingCenterRepository

    @BeforeEach
    fun setUp() {
        shippingCenterRepository.deleteAll()
    }

    @Test
    fun getPage() {
        //given
        val shippingCenter = ShippingCenter(
            sellerId = 2L,
            name = "출고지 a",
            contactNumber = "0212341234",
            zipCode = "10516",
            address = "서울 광진구 군자로",
            addressDetail = "x길 201번지"
        )
        shippingCenterRepository.save(shippingCenter)

        val request = PageRequest.of(0, 10)


        //when
        val result = shippingCenterService.getPage(2L, request)

        //then
        assertThat(result.totalPage).isEqualTo(1)
        assertThat(result.dataList!!.size).isEqualTo(1)
    }

    @Test
    fun create() {
        //given
        val command = ShippingCenterCommand.Create(
            name = "출고지 a",
            contactNumber = "0212341234",
            zipCode = "10516",
            address = "서울 광진구 군자로",
            addressDetail = "x길 201번지"
        )

        //when
        val id = shippingCenterService.create(command, sellerId = 2L)

        //then
        assertThat(id).isEqualTo(1L)
    }

    @Transactional
    @Test
    fun `update 성공`() {
        //given
        val shippingCenter = ShippingCenter(
            sellerId = 2L,
            name = "출고지 a",
            contactNumber = "0212341234",
            zipCode = "10516",
            address = "서울 광진구 군자로",
            addressDetail = "x길 201번지"
        )

        val entity = shippingCenterRepository.save(shippingCenter)

        val command = ShippingCenterCommand.Update(
            name = "출고지 b",
            contactNumber = "0212341234",
            zipCode = "10516",
            address = "서울 광진구 군자로",
            addressDetail = "x길 201번지",
            usable = true
        )

        //when
        val result = shippingCenterService.update(entity.id!!, command, 2L)

        //then
        assertThat(result).isEqualTo(1L)
        assertThat(entity.name).isEqualTo("출고지 b")
    }

    @Transactional
    @Test
    fun `다른 seller면 Update 실패`() {
        //given
        val shippingCenter = ShippingCenter(
            sellerId = 2L,
            name = "출고지 a",
            contactNumber = "0212341234",
            zipCode = "10516",
            address = "서울 광진구 군자로",
            addressDetail = "x길 201번지"
        )

        val entity = shippingCenterRepository.save(shippingCenter)

        val command = ShippingCenterCommand.Update(
            name = "출고지 b",
            contactNumber = "0212341234",
            zipCode = "10516",
            address = "서울 광진구 군자로",
            addressDetail = "x길 201번지",
            usable = true
        )

        //expected
        assertThatThrownBy {
            shippingCenterService.update(entity.id!!, command, 3L)
        }.isInstanceOf(RuntimeException::class.java)

    }
}