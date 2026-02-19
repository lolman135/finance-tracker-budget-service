package tracker.budgetservice.domain.budget

import tracker.budgetservice.domain.BaseDomainRepository
import java.util.UUID

interface BudgetRepository : BaseDomainRepository<UUID, Budget> {
    fun findAllByUserId(userId: UUID): List<Budget>
}