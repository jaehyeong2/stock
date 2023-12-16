package jjfactory.stock.domain.seller.domain.shipping_center

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ShippingCenter(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val sellerId: Long,
    var name: String,
    var usable: Boolean = true,
    var contactNumber: String,

    var zipCode: String,
    var address: String,
    var addressDetail: String
) {

    fun update(command: ShippingCenterCommand.Update){
        name = command.name
        usable = command.usable
        contactNumber = command.contactNumber
        zipCode = command.zipCode
        address = command.address
        addressDetail = command.addressDetail
    }
}