
// * Interfaces


// Interfaces no Kotlin podem conter declarações de abstract methods, bem como implementações de 
// métodos. O que as tornam diferentes de classes abstratas é que as interfaces não podem armazenar
// um state. Elas podem ter propriedades, porém, precisam ser abstratas ou precisam fornecer 
// implementações de acesso.

// Uma interface é definida utilizando a palavra-chave interface:

interface MyInterface {
    fun bar()
    fun foo() {
      // optional body
    }
}


// * Implementando Interfaces


// Uma classe ou objeto podem implementar uma ou mais interfaces:

class Child : MyInterface {
    override fun bar() {
        // body
    }
}


// * Propriedades em Interfaces


// É possível declarar propriedades em interfaces. Uma propriedade declarada em um interface pode 
// ser abstrata ou pode prover uma implementação de acesso. Tais propriedades não podem ter campos 
// de apoio e, portanto, accessors declarados em interfaces não podem referenciá-los:

interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 29
}


// * Herdando Interfaces


// Uma interface pode derivar de outra interface, o que significa que ambas podem prover implementações
// para seus membros e declarar novas funções e propriedades. Muito naturalmente, as classes que 
// implementam essa interface são necessárias apenas para definir as implementações ausentes:

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: Position
) : Person


// * Resolvendo Conflitos de Override

// Quando multiplos tipo são declarados em um supertype list, é posssível herdar mais de uma 
// implementação do mesmo método:

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}


// Ambas as interfaces A e B declaram as funções foo() e bar(), porem, só a B implementa a função
// bar() (bar() não está marcado como abstract em A porque este é o padrão para interfaces se a 
// função não tiver corpo). Agora, caso uma classe concreta chamada de C, derive de A, é preciso
// fazer um override da função bar() e prover sua implementação.

// No entanto, caso uma classe chamada de D derive tanto de A quanto de B, será preciso implementar
// todos os métodos que a classe herda das multiplas interfaces. A regra se aplica tanto para 
// métodos os quais foram implementados apenas uma vez (bar()) quanto dos quais a classe D herdar
// multiplas implementações (foo()).