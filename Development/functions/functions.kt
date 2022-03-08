
// Normal Function
fun sum(a: Int, b: Int): Int { 
 return a + b
}

// fun sum(a: Int, b: Int) = a + b

// Lambda Expression
val lambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

fun main() {
  println(sum(2, 5));
  println(lambda(2, 5));
}

