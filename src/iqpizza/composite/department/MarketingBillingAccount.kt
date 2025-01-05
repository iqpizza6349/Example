package iqpizza.composite.department

import iqpizza.composite.BillingAccount

data class MarketingBillingAccount(
    private val expense: Double,
    private val revenue: Double
) : BillingAccount {
    override fun getExpense(): Double = expense

    override fun getRevenue(): Double = revenue
}
