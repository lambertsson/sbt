package recfun

object Main {

  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    // Ex 2
    println("------")
    println("This (is) a string (that) is weighted.")
    println(balance("This (is) a string (that) is weighted.".toList))
    println("this (is) not)")
    println(balance("this (is) not)".toList))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    {
      if(r == 0 && c == 0){ // Reached the top of the triangle.
        return 1
      }
      if(c == 0){ // Reached the left hand side of a row, get sum from right hand side of row above.
        return pascal(r-1, r-1)
      }
      if(c == r){ // Reached the right hand side of the triangle.
        return 1
      }
      return pascal(c-1, r-1) + pascal(c, r-1) // The value is the sum of the two nearest numbers in the row above.
    }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean =
    {
      if(balanceAdd(chars, 0) == 0){
        return true
      }
      else{
        return false
      }
    }

  def balanceAdd(chars: List[Char], weight: Int): Int =
    {
      if(chars.isEmpty){
        return weight
      }
      if(chars.head == '('){
        return balanceAdd(chars.tail, weight + 1)
      }
      if(chars.head == ')'){
        return balanceAdd(chars.tail, weight - 1)
      }
      else{
        return balanceAdd(chars.tail, weight)
      }
    }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    {
      if(money == 0){
        return 0
      }
      if(coins.isEmpty){
        return 0
      }
      else{
        // Do stuff
        countChangeAdd(money, coins, 0)
      }
    }

  def countChangeAdd(money: Int, coins: List[Int], counter: Int): Int =
    {
      // Om man skickar in första elementet i listan och ser om du kan få en summa som är money
      // Sedan skickar du in andra elementet och ser om du kan fylla på med första och få summan
      // Sedan skickar du in andra två gånger...
      // Skicka in andra tills det blir större än money
      // Sedan skicka in tredje följt av första
      // Sedan en av andra och massor av första
      // Sedan två av andra och massor av första... osv. [Rekursivt!]
    }
}
