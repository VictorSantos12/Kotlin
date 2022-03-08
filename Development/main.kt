
fun main() {
  loop()
}

val myArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

fun loop() {
  for((index, value) in myArray.withIndex()) {
    var type = value / 2;
     when(type !is Int) {
       true -> println("$value - impar")
       false -> println("$value - par")
     } 
   }
 }