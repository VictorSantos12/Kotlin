
val myCollection = listOf(1, "2", true, null)

fun main() {
  
  println(myCollection.filter { it is Int })
  println(myCollection.filter { it is String })
  println(myCollection.filter { it is Boolean })
//   println(myCollection.filter { it is null })

}