package tracker.budgetservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BudgetServiceApplication

fun main(args: Array<String>) {
    runApplication<BudgetServiceApplication>(*args)
}
