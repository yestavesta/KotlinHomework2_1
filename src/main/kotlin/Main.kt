fun main() {
    val amount = 1200
    val minFee = 35
    val feePercent = 0.075f

    val preFee = (amount * feePercent).toInt()
    val totalFee = if (preFee > 35) preFee else minFee

    println(totalFee)
}