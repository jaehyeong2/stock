package jjfactory.stock.domain.common

import org.springframework.http.HttpStatus
import java.time.LocalDateTime

data class CommonResponse<T>(
    var status: Int = HttpStatus.OK.value(),
    var data: T?,
    val responseTime: LocalDateTime = LocalDateTime.now(),
) {
    constructor(data: T, message: String) : this(HttpStatus.OK.value(), data, LocalDateTime.now())
    constructor(data: T) : this(HttpStatus.OK.value(), data, LocalDateTime.now())

    companion object {
        fun Ok(): CommonResponse<Nothing?> {
            return CommonResponse(null)
        }
    }
}
