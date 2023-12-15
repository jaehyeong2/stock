package jjfactory.stock.seller.category.application

import jjfactory.stock.domain.common.PagingResponse
import jjfactory.stock.domain.product.domain.ProductCommand
import jjfactory.stock.domain.product.domain.ProductInfo
import jjfactory.stock.domain.review.domain.ReviewInfo
import jjfactory.stock.domain.review.domain.ReviewService
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ProductFacade(
    private val productService: ProductService,
    private val reviewService: ReviewService
) {
    fun findById(id: Long): ProductInfo {
        return productService.findById(id)
    }

    fun save(sellerId: Long, command: ProductCommand.Create, categoryId: Long): Long {
        return productService.save(sellerId, command, categoryId)
    }

    fun getReviewsByProductId(id: Long, pageable: Pageable): PagingResponse<ReviewInfo?> {
        return reviewService.findByProductId(id, pageable)
    }


}