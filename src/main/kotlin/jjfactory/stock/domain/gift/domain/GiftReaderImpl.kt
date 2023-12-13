package jjfactory.stock.domain.gift.domain

import jjfactory.stock.domain.gift.infra.GiftRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class GiftReaderImpl(
    private val giftRepository: GiftRepository
) : GiftReader {
    override fun findById(id: Long): Gift {
        return giftRepository.findByIdOrNull(id) ?: throw NotFoundException()
    }

    override fun findBySenderId(senderId: Long): List<Gift> {
        return giftRepository.findAllBySenderId(senderId)
    }

    override fun findByReceiverId(receiverId: Long): List<Gift> {
        return giftRepository.findAllByReceiverId(receiverId)
    }
}