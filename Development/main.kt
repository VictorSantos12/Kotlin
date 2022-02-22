
var myArray = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

fun main() {

 arrayOf(1, 2, 3, 4, 5).forEach lit@ {
   if (it == 3) return@lit 
   print(it)
 }
 println(" feito com um lable explicito")

//  for(i in myArray) {
//    println(myArray[i])    
//    if(i >= 8) {
//      break
//    } 
//  }

//  arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach lit@ {
//    if(it > 8) return@lit
//    println(it)
//  }

}