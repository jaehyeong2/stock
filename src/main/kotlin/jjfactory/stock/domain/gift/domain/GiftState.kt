package jjfactory.stock.domain.gift.domain

enum class GiftState(description: String? = null) {
    INIT("선물 주문 생성"),
    IN_PAYMENT("결제 중"),
    ORDER_COMPLETE("주문 완료"),
    PUSH_COMPLETE("선물 링크 발송 완료"),
    ACCEPT("선물 수락"),
    DELIVERY_PREPARE("상품준비"),
    IN_DELIVERY("배송중"),
    DELIVERY_COMPLETE("배송완료"),
    EXPIRATION("선물 수락 만료");
}