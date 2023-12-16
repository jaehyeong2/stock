package jjfactory.stock.domain.seller.domain.shipping_center

class ShippingCenterInfo {
    data class Main(
        val id: Long,
        val name: String,
        val contactNumber: String,
        val zipCode: String,
        val address: String,
        val addressDetail: String
    )
}