package jjfactory.stock.domain.seller.domain.shipping_center

class ShippingCenterCommand {
    data class Create(
        val sellerId: Long,
        val name: String,
        val contactNumber: String,
        val zipCode: String,
        val address: String,
        val addressDetail: String
    ){
        fun toEntity(sellerId: Long): ShippingCenter {
            return ShippingCenter(
                sellerId = sellerId,
                name = name,
                contactNumber = contactNumber,
                zipCode = zipCode,
                address = address,
                addressDetail = addressDetail
            )
        }
    }

    data class Update(
        val sellerId: Long,
        val name: String,
        val usable: Boolean,
        val contactNumber: String,
        val zipCode: String,
        val address: String,
        val addressDetail: String
    )
}