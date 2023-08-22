package Lab_9
class Acc(accountNumber: Int, initialBalance: Double) {
  private var balance: Double = initialBalance
  def getBalance: Double = balance
  def deposit(amount: Double): Unit = {
    balance += amount
  }
  def withdraw(amount: Double): Unit = {
    require(amount <= balance, "Insufficient balance")
    balance -= amount
  }
  def applyInterest(): Unit = {
    if (balance > 0)
      balance += 0.05 * balance;
     else
      balance += 0.1 * balance
  }
}
object Q4 {
  def main(args: Array[String]): Unit = {
    val account1 = new Acc(1, 1000.0)
    val account2 = new Acc(2, -500.0)
    val account3 = new Acc(3, 200.0)

    val bankAccounts: List[Acc] = List(account1, account2, account3)

    // Q 4.1 List of Accounts with negative balances
    val NegativeBalance = bankAccounts.filter(account => account.getBalance < 0)
    println("Accounts with negative balances: " + NegativeBalance)

    // Q 4.2 Calculate the sum of all account balances
    val total = bankAccounts.map(_.getBalance).sum
    println("Sum of all accounts: " + total)

    // Q 4.3 Calculate the final balances of all accounts after applying interest
    bankAccounts.foreach(_.applyInterest())
    println("Final balances after applying interest function:")
    bankAccounts.foreach(account => println(s"Account${account.getBalance}"))
  }
}
