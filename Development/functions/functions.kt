
// Normal Function
fun sum(a: Int, b: Int): Int { 
 return a + b
}

// fun sum(a: Int, b: Int) = a + b

// Lambda Expression
val lambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

var generic = ::func

fun main() {
  println(generic(x: 1, y: 2) -> x * y)
  // println(sum(2, 5));
  // println(lambda(2, 5));
}

