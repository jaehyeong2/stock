package jjfactory.stock.admin.category.application

import jjfactory.stock.domain.category.domain.CategoryCommand
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal


@SpringBootTest
class CategoryFacadeTest(
    @Autowired val categoryFacade: CategoryFacade
) {

    @Transactional
    @Test
    fun createTest() {
        val command = CategoryCommand.Create(
            parentId = 2L,
            code = "C01",
            name = "식품/건강",
            fee = BigDecimal(0)
        )

        categoryFacade.create(command)
    }



}