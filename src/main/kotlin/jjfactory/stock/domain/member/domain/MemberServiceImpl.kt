package jjfactory.stock.domain.member.domain

import jjfactory.stock.domain.member.domain.address.AddressReader
import jjfactory.stock.domain.member.domain.address.AddressWriter
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class MemberServiceImpl(
    private val memberReader: MemberReader,
    private val memberWriter: MemberWriter,
    private val addressWriter: AddressWriter,
    private val addressReader: AddressReader,
    private val memberInfoMapper: MemberInfoMapper
) : MemberService {
    @Transactional
    override fun join(command: MemberCommand.Create): Long {
        val initMember = command.toEntity()
        val member = memberWriter.write(initMember)

        //todo address save
        //todo notification

        return member.id!!
    }

    @Transactional(readOnly = true)
    override fun getMyInfo(id: Long): MemberInfo.Main {
        val member = memberReader.findById(id)
        return memberInfoMapper.toInfo(member)
    }

    @Transactional(readOnly = true)
    override fun withdraw(id: Long): Long {
        val member = memberReader.findById(id)
        member.withdraw()
        return member.id!!
    }

    @Transactional
    override fun update(id: Long, command: MemberCommand.Update): Long {
        val member = memberReader.findById(id)
        member.update(command.username, command.phone)
        return member.id!!
    }

    @Transactional
    override fun updateAddress(id: Long){
        val address = addressReader.findById(id)

        //todo
//        address.updateAddress()
    }

    @Transactional
    override fun deleteAddress(id: Long) {
        addressWriter.deleteById(id)
    }
}