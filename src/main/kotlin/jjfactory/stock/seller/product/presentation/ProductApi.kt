package jjfactory.stock.seller.category.presentation

import jjfactory.stock.domain.common.CommonResponse
import jjfactory.stock.domain.product.domain.ProductInfo
import jjfactory.stock.seller.category.application.ProductService
import jjfactory.stock.seller.product.presentation.dto.ProductDto
import jjfactory.stock.seller.product.presentation.dto.ProductDtoMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/products")
@RestController
class ProductApi(
    private val productService: ProductService,
    private val productDtoMapper: ProductDtoMapper
) {
    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long): CommonResponse<ProductInfo> {
        return CommonResponse(productService.findById(id))
    }

    @PostMapping
    fun saveOne(@RequestBody request: ProductDto.Create): CommonResponse<Long> {
        val loginSellerId = 1L
        val command = productDtoMapper.of(request)

        return CommonResponse(productService.save(1L, command, request.categoryId))
    }
}