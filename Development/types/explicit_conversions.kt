val a: Byte = 1 // OK, literais são verificados estaticamente
// val b: Int = b // ERROR
val c: Int = b.toInt()

fun main() { println("$a, $c") } // 1 1