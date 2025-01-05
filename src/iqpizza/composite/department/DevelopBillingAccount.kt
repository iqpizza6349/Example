package iqpizza.composite.department

import iqpizza.composite.BillingAccount

/**
 * 소프트웨어 라이센스 비용, 클라우드(AWS) 비용, R&D 비용 등 고정 비용 및 투자 비용이 많음
 */
data class DevelopBillingAccount(
    private var expense: Double,
    private val revenue: Double,
    private val projectExpenses: MutableMap<String, Double> = mutableMapOf()  // 프로젝트별 비용
) : BillingAccount {
    override fun getExpense(): Double = expense

    override fun getRevenue(): Double = revenue

    fun addProjectExpense(project: String, cost: Double) {
        projectExpenses[project] = projectExpenses.getOrDefault(project, 0.0) + cost
        this.expense += cost
    }

    fun getProjectExpense(project: String): Double {
        return projectExpenses.getOrDefault(project, 0.0)
    }
}
