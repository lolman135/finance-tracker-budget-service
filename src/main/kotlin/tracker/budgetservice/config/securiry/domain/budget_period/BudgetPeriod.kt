package tracker.budgetservice.config.securiry.domain.budget_period

import com.rabbitmq.client.AMQP
import java.time.LocalDate
import java.util.UUID

data class BudgetPeriod(
    val id: UUID,
    val budgetId: UUID,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val status: Status,
    val spentAmount: Long
) {
    fun addExpense(amount: Long): BudgetPeriod{
        check(status == Status.ACTIVE)
        require(amount >= 0){"Expense cannot be less than zero"}
        return copy(spentAmount = spentAmount + amount)
    }

    fun close(): BudgetPeriod{
        check(status == Status.ACTIVE){"Period already closed"}
        return copy(status = Status.CLOSED)
    }
}