package jjfactory.stock.seller.shipping_center.presentation.dto

class ShippingCenterDto {
    data class Create(
        val name: String,
        val contactNumber: String,
        val zipCode: String,
        val address: String,
        val addressDetail: String
    )

    data class Update(
        val name: String,
        val usable: Boolean,
        val contactNumber: String,
        val zipCode: String,
        val address: String,
        val addressDetail: String
    )
}