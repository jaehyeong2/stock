package jjfactory.stock.domain.common

import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus


class CommonPagingResponse<T>(
    var status: Int = HttpStatus.OK.value(),
    var data: PagingResponse<T>,
) {
    constructor(data: PagingResponse<T>) : this(
        status = HttpStatus.OK.value(),
        data = data,
    )
}

data class PagingResponse<T>(
    val currentPage: Int = 0,
    val totalPage: Int = 0,
    val totalCount: Long = 0L,
    val dataList: List<T>?
) {
    constructor(list: Page<T>) : this(
        dataList = list.content,
        currentPage = list.pageable.pageNumber + 1,
        totalCount = list.totalElements,
        totalPage = list.totalPages
    )
}