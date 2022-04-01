
// * CLASSES

class Person { }

class Empty

// Caso uma classe não possuia um body, as chaves que o definem podem ser omitidas

// * CLASS MEMBERS

// Classes Kotlin podem conter:

// * CONSTRUCTOR 

// Uma classe no Kotlin pode ter um primary constructor e um ou mais secondary constructors.
// O primary constructor é uma parte do class header, sendo declarado após o identificador
// da classe

class Person constructor(firstName: String) { /*...*/ }


// Caso o primary constructor não possua qualquer modificador de visibilidade, a keyword constructor pode ser omitida:

class Person(firstName: String) { /*...*/ }

// * INITIALIZATION BLOCKS

// O primary constructor não pode conter qualquer código. Códigos de inicialização podem ser
// alocados em blocos de inicialização, que recebem a palavra-chave init como prefixo:

init { /*...*/  }

// Durante a inicialização de uma instância, os blocos inicializadores são executados na ordem em que forem declarads no 
// corpo da classe, intercaladas com a inicialização das propriedade:

class InitOrderDemo(name: String) {
  val firstProperty = "First property: $name".also(::println)
  
  init {
      println("First initializer block that prints $name")
  }
  
  val secondProperty = "Second property: ${name.length}".also(::println)
  
  init {
      println("Second initializer block that prints ${name.length}")
  }
}

// Os parâmetros do primary constructor podem ser utilizados ​​nos blocos inicializadores. Eles também podem ser
// usado com na inicialização das propriedade declarados no corpo da classe:

class Customer(name: String) {
    val customerKey = name.uppercase()
}

// * SECOND CONSTRUCTOR

// Uma classe também pode declarar construtores secundários, que são prefixados com palavra-chave construtor:

class Person(val pets: MutableList<Pet> = mutableListOf())

class Pet {
    constructor(owner: Person) {
        owner.pets.add(this) // adicionar um objeto pet a lista de pets da classe Person 
    }
}

// Se a classe tiver um primary constructor, cada construtor secundário precisará delegar ao construtor primário,
// direta ou indiretamente por meio de outro(s) construtor(es) secundário(s). A delegação para outro construtor da mesma 
// classe é feita usando a palavra-chave this:


class Person(val name: String) {
    val children: MutableList<Person> = mutableListOf()
    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}

// * FUNCTIONS

fun double(x: Int): Int { 
    return 2 * x
}

// * PROPERTIES

class Address {
  var name: String = "Holmes, Sherlock" 
  var street: String = "Baker"
  // ...
}

// * NESTED CLASSES

class Outer {
    private val bar: Int = 1
    class Nested { 
        fun foo() = 2
    }
}

val demo = Outer.Nested().foo() // == 2

// * INNER CLASSES

class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

val demo = Outer().Inner().foo() // == 1


// * CREATING ISNTANCES OF CLASSES


// Para criar uma instância de uma classe, chame o construtor como se fosse uma função regular:

val invoice = Invoice()

// Kotlin não tem uma nova palavra-chave

val customer = Customer("Joe Smith")


// * ABSTRACT CLASSSES


// Uma classe pode ser declarada abstrata, juntamente com alguns ou todos os seus membros. Um membro abstrato de uma classe
// não é implementado na mesma, não sendo necessário declará-lo, nem a classe a qual ele pertence com o modificador open:

abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw() {
        // draw the rectangle
    }
}

// É possível fazer um override de um membro definido como open por um abstrato quando este é herdado:

open class Polygon {
    open fun draw() {
        // some default polygon drawing method
    }
}

abstract class WildShape : Polygon() {
    // As classes que herdarem da classe WildShape devem
    // fornecer seu próprio método draw em vez de usar o 
    // herdado da classe Polygon 
    abstract override fun draw()
}
