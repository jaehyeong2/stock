package jjfactory.stock.seller.category.presentation

import jjfactory.stock.domain.common.CommonPagingResponse
import jjfactory.stock.domain.common.CommonResponse
import jjfactory.stock.domain.product.domain.ProductInfo
import jjfactory.stock.domain.review.domain.ReviewInfo
import jjfactory.stock.seller.category.application.ProductFacade
import jjfactory.stock.seller.product.presentation.dto.ProductDto
import jjfactory.stock.seller.product.presentation.dto.ProductDtoMapper
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/products")
@RestController
class ProductApi(
    private val productFacade: ProductFacade,
    private val productDtoMapper: ProductDtoMapper
) {
    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long): CommonResponse<ProductDto.Response> {
        return CommonResponse(productDtoMapper.toDto(productFacade.findById(id)))
    }

    @GetMapping("/{id}/reviews")
    fun getReviewsByProductId(@PathVariable id: Long, @PageableDefault pageable: Pageable): CommonPagingResponse<ReviewInfo?> {
        return CommonPagingResponse(productFacade.getReviewsByProductId(id, pageable))
    }

//    @PostMapping
//    fun saveOne(@RequestBody request: ProductDto.Create): CommonResponse<Long> {
//        val loginSellerId = 1L
//        val command = productDtoMapper.of(request)
//
//        return CommonResponse(productService.save(1L, command, request.categoryId))
//    }
}