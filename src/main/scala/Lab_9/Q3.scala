//package Lab_9
//
//class Account(a_c_num: Int, initialBalance: Double) {
//   var balance: Double = initialBalance
//  def getBalance: Double = balance
//  def deposit(amount: Double): Unit = {
//    balance += amount
//  }
//  def withdraw(amount: Double): Unit = {
//    require(amount <= balance, "Insufficient balance for withdraw")
//    balance -= amount
//  }
//  def transfer(amount: Double, targetAccount: Account): Unit = {
//    require(amount <= balance, "Insufficient balance for transfer")
//    balance -= amount
//    targetAccount.balance += amount
//  }
//}
//
//object Q3{
//  def main(args: Array[String]): Unit = {
//    val a1001 = new Account(1001,100000.0)
//    val a1002 = new Account(1002,75000.0)
//
//    println("A001 balance: " + a1001.getBalance)
//    println("A002 balance: " + a1002.getBalance)
//
//    a1001.deposit(10000)
//    println("A001 balance after deposit: " + a1001.getBalance)
//
//    a1002.withdraw(2000)
//    println("A002 balance after withdrawal: " + a1002.getBalance)
//
//    a1001.transfer(5000, a1002)
//    println("A001 balance after transfer: " + a1001.getBalance)
//    println("A002 balance after transfer: " + a1002.getBalance)
//  }
//}
//
