package tracker.budgetservice.domain.budget_period

import tracker.budgetservice.domain.BaseDomainRepository
import java.util.UUID

interface BudgetPeriodRepository : BaseDomainRepository<UUID, BudgetPeriod> {
    fun findAllByBudgetId(budgetId: UUID): List<BudgetPeriod>
    fun findAllClosedByBudgetId(budgetId: UUID): List<BudgetPeriod>
    fun findActiveByBudgetId(budgetId: UUID): BudgetPeriod?
}