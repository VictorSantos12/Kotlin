
// * Visibility Modifiers

// Classes, objects, interfaces, constructors, e funções, bem como propriedes e seus
// setters, podem ter modificadores de visibilidade. 

// No Kotlin há quantro modificadores de visibilidade: private, protected, internal e
// public, e cada um deles possui diferentes funções em diferentes entidades. A visibilidade 
// padrão é public.


// * Packages


// Funções, propriedades, classes, objetos e interfaces podem ser declaradas no "top-level"
// de um arquivo, diretamente dentro de um package:

// file name: example.kt
package foo

fun baz() { ... }
class Bar { ... }

// Nesse caso, as regras são:

// - Caso um modificador de visibilidade não seja utilizando, a declaração estará visível em
// qualquer parte do sistema.

// - Caso a declaração receba o marcador private, ela apenas será  visível dentro do arquivo
// que a contém.

// - Caso a declaração receba o marcador internal, ela será visível em qualquer parte do memso 
// módulo.

// - O modificador protected não é utilizado em declarações top-level.

// Exemplo:

// file name: example.kt
package foo

private fun foo() { ... } // visible inside example.kt

public var bar: Int = 5 // property is visible everywhere
    private set         // setter is visible only in example.kt

internal val baz = 6    // visible inside the same module


// * Membros de uma Classe


// Para membros declarados em uma classe:

// - private define que o membro é visível dentro da classe e apensas nela(incluindo todos os seus 
// membros).

// - protected define que o membro possui o memso nível de acesso que um private, mas também poderá
// ser acessado em subclasses.

// - internal define que qualquer client dentro do módulo que tenha acesso a classe, possa ter acesso
// ao seus internal members.

// - public define que qualquer client que tenha acesso a classe tenha acesso a seus public members.

// * no kotlin, classes não possuem acesso a membros privados de suas classes internas.

// Caso um membro protected ou internal de uma classe sofra um override e não tenha a visibilidade especificada
// explicitamente, o membro que sofreu o override terá o mesmo nível de acesso que o original.

// Exemplo:

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}


// * Constructor


// Para especificar o nível de acesso a um primary constructor, utilizamos a seguinte sintaxe:

class C private constructor(a: Int) { ... }

// Obs: é preciso adicionar a palavra-chave constructor explicitamente.