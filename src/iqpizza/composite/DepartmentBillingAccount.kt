package iqpizza.composite

data class DepartmentBillingAccount(
    private val billingAccount: List<BillingAccount>
) : BillingAccount {

    constructor(vararg billingAccount: BillingAccount) : this(billingAccount.toList())

    override fun getExpense(): Double = billingAccount.stream().mapToDouble { it.getExpense() }.sum()

    override fun getRevenue(): Double = billingAccount.stream().mapToDouble { it.getRevenue() }.sum()
}