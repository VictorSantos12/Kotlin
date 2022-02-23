// Divisão de inteiros

val x = 5 / 2 
// val x = 5 / 2.5 // ERROR: O operador '==' não pode ser aplicado entre valores 'Int' e 'Double'
val y = 5 / 2.toDouble()  // Floating-point result

fun main() {
  println(1 + 2)
  println(2_500_000_000L - 1L)
  println(3.14 * 2.71)
  println(10.0 / 3)
  // Divisão de inteiros
  println(x == 2) // Divisão de inteiros
  println(y == 2.5) // Floating-point result
}