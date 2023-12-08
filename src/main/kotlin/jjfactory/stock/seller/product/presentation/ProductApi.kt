package jjfactory.stock.seller.category.presentation

import jjfactory.stock.domain.category.domain.CategoryInfo
import jjfactory.stock.domain.common.CommonResponse
import jjfactory.stock.domain.product.domain.ProductInfo
import jjfactory.stock.seller.category.application.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController("/products")
class ProductApi(
    private val productService: ProductService
) {
    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long): CommonResponse<ProductInfo> {
        return CommonResponse(productService.findById(id))
    }
}