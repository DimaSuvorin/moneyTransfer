fun main() {
    println("Hello Kotlin!")
    val amount = 100_000_00 //сумма перевода
    val commission = 0.0075 //комиссия 0,75% от суммы перевода
    val commissionMin = 35_00 //минимальная сумма комиссии 35 рублей

    val totalCommission = amount * commission
    val result = if (totalCommission <= commissionMin) commissionMin else totalCommission

    println("Total commission: $result")
}