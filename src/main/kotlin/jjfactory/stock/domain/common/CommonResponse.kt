package jjfactory.stock.domain.common

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.time.LocalDateTime

data class CommonResponse<T>(
    var status: Int = HttpStatus.OK.value(),
    var data: T?,
    val responseTime: LocalDateTime = LocalDateTime.now(),
) {
    constructor(data: T) : this(HttpStatus.OK.value(), data, LocalDateTime.now())
    companion object {
        fun ok(): CommonResponse<Nothing?> {
            return CommonResponse(null)
        }

        @ResponseStatus(HttpStatus.CREATED)
        fun created (id: Long): CommonResponse<Long> {
            return CommonResponse(HttpStatus.CREATED.value(), id, LocalDateTime.now())
        }
    }
}
