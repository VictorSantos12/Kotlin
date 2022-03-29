
val myCollection = listOf(1, "2", true, null)
 val myList: MutableList<Int> = mutableListOf()

fun main() {
  
  println(myCollection.filter { it is Int })
  println(myCollection.filter { it is String })
  println(myCollection.filter { it is Boolean })
//   println(myCollection.filter { it is null })
  myList.add(1)
  myList.add(2)
  myList.add(3)

  println(myList)

}