package jjfactory.stock.domain.gift.domain

class GiftCommand {
    data class Create(
        var receiverName: String,
        var receiverPhone: String,
        var receiverZipcode: String,
        var receiverAddress: String,
        var receiverAddressDetail: String,
        var etcMessage: String,
        val pushType: String,
    )
}