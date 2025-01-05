package iqpizza.composite.department

import iqpizza.composite.BillingAccount

/**
 * 직원 급여, 복지 비용, 교육 비용
 */
data class HRBillingAccount(
    private val expense: Double,
    private val revenue: Double,
    private val employees: Int,         // 직원 수
    private val welfareExpense: Double  // 복지 비용
) : BillingAccount {
    override fun getExpense(): Double = expense

    override fun getRevenue(): Double = revenue

    fun getPerEmployeeExpense(): Double {
        return expense / employees
    }

    fun getWelfareExpense(): Double {
        return welfareExpense
    }
}
