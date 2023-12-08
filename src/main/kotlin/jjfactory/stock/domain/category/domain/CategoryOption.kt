package jjfactory.stock.domain.category.domain

import jakarta.persistence.*

@Table(indexes = [Index(name = "idx_category_id", columnList = "categoryId")])
@Entity
class CategoryOption(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id :Long? = null,
    val categoryId: Long,
    var name: String,
    val description: String
) {
}