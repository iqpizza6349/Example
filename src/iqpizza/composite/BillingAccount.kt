package iqpizza.composite

/**
 * 지출과 수익을 관리하는 인터페이스입니다.
 */
interface BillingAccount {
    /**
     * 지출한 총 금액입니다.
     */
    fun getExpense(): Double

    /**
     * 총 수익입니다.
     */
    fun getRevenue(): Double
}