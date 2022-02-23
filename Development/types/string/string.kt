val str1 = "abcd 1234"

// escapes string
val str2 = "Hello, world!\n"

// raw string
val text = """
    for (c in "foo")
        print(c)
"""

// string templates
val i = 10
val str3 = "abc"

fun main() {
 println(str1.uppercase()) // Cria e printa um no objeto String
 println(str1) // A Strig original permanece a mesma
 println(str2)
 println(text)
 println("i = $i") // print "i = 10"
 println("$str3.length is ${str3.length}") // prints "abc.length is 3"
}