
val myTrue: Boolean = true
val myFalse: Boolean = false
val boolNull: Boolean? = null // Variable 'boolNull' is never used

fun main() {
  println(myTrue || myFalse)
  println(myTrue && myFalse)
  println(!myTrue)
}