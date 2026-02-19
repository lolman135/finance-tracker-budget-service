package tracker.budgetservice.config.securiry.domain.budget

import java.util.UUID

data class Budget(
    val id: UUID,
    val userId: UUID,
    val limit: Long
) {
    fun changeLimit(newLimit: Long): Budget{
        require(newLimit >= 0){"Limit cannot be less than zero"}
        return copy(limit = newLimit)
    }
}