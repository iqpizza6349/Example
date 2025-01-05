package iqpizza.composite

import iqpizza.composite.department.DevelopBillingAccount
import iqpizza.composite.department.HRBillingAccount
import iqpizza.composite.department.MarketingBillingAccount

fun main() {
    // 원래는 데이터베이스에서 각각 가져와야하지만, 예제를 위해 단순화
    val devDepartment = DevelopBillingAccount(8.0, 20.0)
    val hrDepartment = HRBillingAccount(7.0, 0.0, 15, 0.0)
    val marketingDepartment = MarketingBillingAccount(6.0, 15.0)

    val departmentBillingAccount = DepartmentBillingAccount(devDepartment, hrDepartment, marketingDepartment)

    println("이번 년도 총 지출: ${departmentBillingAccount.getExpense()}")
    println("이번 년도 총 수익: ${departmentBillingAccount.getRevenue()}")
}
