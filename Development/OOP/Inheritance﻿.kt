
// * INHERITANCE

All classes in Kotlin have a common superclass, Any, which is the 
default superclass for a class with no supertypes declared:

// Todas as classes no Kotlin têm uma superclasse comum, Any, que é a
// superclasse padrão para uma classe que não possui qualquer supertype 
// declarado:

class Example {} // Implicitly inherits from Any

// Any tem três métodos: equals(), hashCode() e toString(). Assim, esses
// métodos são definidos para todas as classes Kotlin.

By default, Kotlin classes are final – they can’t be inherited. To make a 
class inheritable, mark it with the open keyword:

// Por padrão, as classes Kotlin são final – elas não podem ser herdadas. Para tornar uma
// classe herdável, é preciso declará-la com o modificador open:

open class Base {}

// To declare an explicit supertype, place the type after a colon in the class header:
// Para declarar um supertipo explícito, é preciso definí-lo após dois pontos no cabeçalho da classe:

open class Base(p: Int)

class Derived(p: Int) : Base(p)

// Se uma classe derivada possuir um primary constructor, a classe base pode (e deve) ser inicializada
// nesse primary constructor de acordo com seus parâmetros.

// Se uma classe derivada não possuir um primary constructor, cada construtor secundário deverá inicializar
// o tipo base usando a palavra-chave super ou deve delegar esta função para que outro construtor que o faça.

// Observer que neste caso diferentes construtores secundários podem chamar diferentes construtores do tipo base:

class MyView : View {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}


// * OVERRIDING METHODS


// O Kotlin requer modificadores explícitos para membros substituíveis e substituições:

open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}

The override modifier is required for Circle.draw(). If it were missing, the compiler would complain. 
If there is no open modifier on a function, like Shape.fill(), declaring a method with the same signature 
in a subclass is not allowed, either with override or without it. The open modifier has no effect when added 
to members of a final class – a class without an open modifier.

// O modificador override é necessário na declaração do método Circle.draw(). Casp não fosse declarado, o compilador reclamaria.
// Se não houver um modificador open em uma função, como Shape.fill(), declarar um método com a mesma assinatura em uma subclasse
//  não é permitido, seja com override ou sem ele. O modificador open não tem efeito quando adicionado a membros de uma classe final
// – uma classe sem um modificador open.

// Um membro marcado com um override é explicitamente um open, portanto, pode ser substituído em subclasses. Caso seja necessário impedir
// seu override em subclasses que o herdem, usa-se o marcador final:

open class Rectangle() : Shape() {
    final override fun draw() { /*...*/ }
}


// * OVERRIDING PROPERTIES


// O mecanismo de substituição funciona nas propriedades da mesma maneira que nos métodos. Propriedades declaradas em uma superclasse que
// são posteriormente redeclarados em uma classe derivada devem ser precedidos de do marcador override e devem ter um tipo compatível. Cada 
// propriedade declarada pode ser substituído por uma propriedade com um inicializador ou por uma propriedade com um método get:

open class Shape {
    open val vertexCount: Int = 0
}

class Rectangle : Shape() {
    override val vertexCount = 4
}

You can also override a val property with a var property, but not vice versa. This is allowed because a val property essentially declares 
a get method, and overriding it as a var additionally declares a set method in the derived class.

// Também é possível substituir uma propriedade val por uma propriedade var, mas não vice-versa. Isso se dá pois uma propriedade val declara
// essencialmente um método get, e substituí-lo por um var declara um método set na classe derivada.

// Observe que é possível usar a palavra-chave override como parte da declaração de propriedade em um primary construtor:

interface Shape {
    val vertexCount: Int
}

class Rectangle(override val vertexCount: Int = 4) : Shape // Always has 4 vertices

class Polygon : Shape {
    override var vertexCount: Int = 0  // Can be set to any number later
}


// * Ordem de inicialização da classe derivada


// Durante a construção de uma nova instância de uma classe derivada, a inicialização da classe base é feita como o primeiro passo (precedido
// apenas pela avaliação dos argumentos para o construtor da classe base), o que significa que isso acontece antes da lógica de inicialização 
// da classe derivada ser executada.

open class Base(val name: String) {

    init { println("Initializing a base class") }

    open val size: Int = 
        name.length.also { println("Initializing size in the base class: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {

    init { println("Initializing a derived class") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}

// Output:

// Constructing the derived class("hello", "world")
// Argument for the base class: Hello
// Initializing a base class
// Initializing size in the base class: 5
// Initializing a derived class
// Initializing size in the derived class: 10

// Isso significa que quando o construtor da classe base é executado, as propriedades declaradas ou substituídas no classe ainda não 
// foram inicializados. Usando qualquer uma dessas propriedades na lógica de inicialização da classe base (seja direta ou indiretamente 
// por meio de outra implementação de um override de um membro definido como open) pode levar a um comportamento incorreto ou a um falha em 
// tempo de execução. Ao projetar uma classe base, você deve evitar usar membros com o marcador open nos construtors, inicializadores de
// propriedade ou blocos  de inicialização.


// * CHAMADO A IMPLEMENTAÇÃO DA SUPERCLASSE Calling the superclass implementation


// O código em uma classe derivada pode chamar suas funções de superclasse e implementações de acesso de propriedades usando 
// a palavra-chave super:

open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}


// * Regras de substituição


// Em Kotlin, a herança de implementação é regulada pela seguinte regra: se uma classe herdar várias implementações do mesmo membro de
// suas superclasses imediatas, ele deve substituir esse membro e fornecer sua própria implementação (talvez, usando um dos herdados).

To denote the supertype from which the inherited implementation is taken, use super qualified by the supertype name in angle brackets,
such as super<Base>:

// Para denotar o supertype do qual a implementação herdada é obtida, usa-se a palavra-chave super seguida so supertipo entre colchetes,
// como por exemplo super<Base>.

open class Rectangle {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}

It's fine to inherit from both Rectangle and Polygon, but both of them have their implementations of draw(), so you need to override draw() 
in Square and provide a separate implementation for it to eliminate the ambiguity.

// Não há problema em herdar de Rectangle e Polygon ao memso tempo, mas ambos têm suas implementações de draw(), então é necessário substituir 
// draw() na classe Square e fornecer uma implementação separada para eliminar a ambiguidade.