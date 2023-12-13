package jjfactory.stock.seller.category.presentation

import jjfactory.stock.domain.common.CommonResponse
import jjfactory.stock.domain.product.domain.ProductInfo
import jjfactory.stock.seller.category.application.ProductFacade
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/products")
@RestController
class ProductApi(
    private val productFacade: ProductFacade,
//    private val productDtoMapper: ProductDtoMapper
) {
    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long): CommonResponse<ProductInfo> {
        return CommonResponse(productFacade.findById(id))
    }

//    @PostMapping
//    fun saveOne(@RequestBody request: ProductDto.Create): CommonResponse<Long> {
//        val loginSellerId = 1L
//        val command = productDtoMapper.of(request)
//
//        return CommonResponse(productService.save(1L, command, request.categoryId))
//    }
}