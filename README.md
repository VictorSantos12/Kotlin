<div align="center">
  <img src="https://user-images.githubusercontent.com/61476935/154181283-f96bc557-81ba-45ee-8eae-4896d5656111.png">
</div>
<br>
<img src="https://img.shields.io/static/v1?label=Kotlin&message=Language&color=purple&style=for-the-badge&logo=Kotlin"/>


O Kotlin é uma linguagem de programação multiparadigma criada pela [JetBrains](https://www.jetbrains.com/pt-br/) no ano de 2011 com o intuito de atualizar ou mesmo substituir o Java. Sendo multiplataforma, o Kotlin é especialmente famoso por estar presente em aplicações sever-side, web e principalmente mobile. Isso se dá pois a linguagem foi criada para ser compilada e executada na JVM(Java Virtual Machine), tornando possível utilizá-la em códigos baseados em Java e vice-versa, o que permite tê-la presente em basicamente qualquer ambiente em que o Java é executado.

Indo além da JVM, o Kotlin se tornou mais notório do que sua função inicial permitiria. Oriunda da parceria entre a Google e a JetBrains, foi criada a Kotlin Foundation, que é a atual responsável pela linguagem. Da mesma parceria surgiu em 2017 a inclusão e o suporte do Kotlin em ferramentas como o Android Studio e aplicações Android em geral, passando a ser sua preferred language em 2019. Além disso, o Kotlin também sofre constantes contribuições da comunidade por ser um projeto open-source.


<!-- <h1>Kotlin Multiplataform</h1> -->


<!-- <h2>Kotlin for Android</h2>


Como já foi mencionado o desenvolvimento de aplicações android é atualmente <i>Kotlin-first</i>, sendo assim desde que a parceria foi anunciada na Google I/O de 2019. -->


<h1>Ambiente de Desenvolvimento</h1>


O Kotlin pode ser utilizado de diversas maneiras e em ambientes distintos, os quais disponibilizam diferentes recursos úteis ao desenvolvimento de aplicações multiplataforma de formas diversas. Elas são:


<h2>IntelliJ IDEA</h2>


O IntelliJ IDEA é uma IDE criada pela JetBrains voltada para maximizar a produtividade dos desenvolvedores. Danto total supote ao Java, Kotlin, Scala e Groovy, o IntelliJ possui inúmeros recursos que potencializam o desenvolvimento. O link a seguir indica como obter e instalar as versões da ferramenta:

- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)


<h2>Android Studio</h2>


O Android Studio é o ambiente oficial de desenvolvimento integrado para o desenvolvedores de aplicações Andorid. Baseado no IntelliJ IDEA e indo além, o Android Studio oferece ainda mais ferramentas com o intuito de melhorar a produtividade ao criar uma aplicação android, como:

- Um sistema de compilação flexível baseado no gerenciador Gradle
- Uma vasta lista de emuladores ricos em recursos
- Ambiente que permite desenvolver para todos os dispositivos Android
- Facilita o fluxo de desenvolvimento aplicando automaticamente alterações sem a necessidade de reinicializar a aplicação
- Integração com o GitHub
- Uma série de ferramentas e frameworks de teste
- Ferramentas Lint para capturar desempenho, usabilidade, compatibilidade de versão e outros problemas
- Suporte integrado para o [Google Cloud Platform](https://cloud.google.com/tools/android-studio/docs/), facilitando a integração do Google Cloud Messaging e do App Engine

O link a seguir indica como obter e instalar o Android Studio:

- [Android Studio](https://developer.android.com/studio)


<h2>VSCode</h2>


O VSCode é um editor de código bastante popular, que não possui os recursos de IDE's como o Android Studio ou o IntelliJ IDEA, mas fornece o suficiente para que seja possível aprender a sintaxe do Kotlin de forma prática. Sendo assim, com o intuito de criar o ambiente mínimo para executar o Kotlin, optaremos por usa-la em detrimento das demais. Para iniciar, faremos algumas instalações:

O VSCode é imprescindível para escrever e compilar o código Kotlin de forma simples e rápida.

- [VSCode](https://code.visualstudio.com/)

Além do próprio editor, iremos incluir duas extensões essenciais, sendo elas:

<div align="center">
  <img src="https://user-images.githubusercontent.com/61476935/154381629-75b90545-4b7d-4836-a517-950cb7e3510d.png">
</div>

A extensão Kotlin dá suporte a sintaxe dá linguagem, além de adicionar features básicas que irão auxiliar na aua escrita e uso no VSCode.

<div align="center">
  <img src="https://user-images.githubusercontent.com/61476935/154381781-c6bb6927-37dd-4841-83aa-a2fd27f6f473.png">
</div>

A extensão Code Runner é bastante utilizada para compilar snippets ou arquivos escritos em diversas linguagens. Ela será a responsável por compilar os arquivos .kt criados.


<h2>Kotlinc</h2>


O Kotlin Compiler, ou Kotlinc, é necessário no processo de compilação pois o Kotlin em si não é interpretado pelo sistema operacional. A ferramenta pode ser obtida seguindo os passos descritos no link abaixo:

- [Kotlin Compiler](https://kotlinlang.org/docs/native-command-line-compiler.html)

Após o fim da instalação do arquivo zip ```kotlin-compiler-0.0.0.zip```, extraia o documento e o anexe a um diretório de sua preferência. Exemplo: 

>C:\Kotlin. 

No arquivo Kotlinc há um diretório bin, o qual contém a ferramenta, e, para que seja possível executar o compiler globalmente, adicione uma nova variável de ambiente a variável Path contendo o caminho até a pasta bin. Exemplo:

>C:\Kotlin\kotlinc\bin.

Após a criação da nova variável de ambiente, reinicie o computador para que a mesma seja lida, já sendo possível, em seguida, utilizar o Kotlin Compiler. Para atestar sua instalação, acessa o terminal de comando e execute:

    kotlinc -version 

O resultado deve ser semelhante ao seguinte:

>info: kotlinc-jvm 1.6.10 (JRE 1.8.0_211-b12)

Obs.: Para que esse processo seja possível, é preciso ter uma versão igual ou superior a <i> 1.8</i> do <i>jdk</i>, do contrário não será possível fazer uso do Kotlin.

Tendo concluído o processo de criação do ambiente de desenvolvimento, iremos abordar os aspectos que definem o Kotlin, como sua sintaxe, tipagem e paradigmas que a linguagem abrange.


<h2>Hello World</h2>


Uma forma prática de entender a estrutura mais básica de uma linguagem de programação é o popular Hello World. Sendo assim, em uma file main.kt, execute as seguintes linhas de código:

    fun main() {
        println("Hello, world!")
    }


Com a execução, um arquivo .jar será gerado, este sendo executado e tendo o seguinte output como resultado:

>[Running] cd "c:\..\..\..\..\" && kotlinc main.kt -include-runtime -d main.jar && java -jar main.jar<br>
>Hello, world!<br>
>[Done] exited with code=0 in 3.62 seconds

<!-- Outra forma de obter o resultado é gerando um arquivo em java a partir da file .Kt. Para isso, no terminal, acesse o diretório em que o arquivo deve ser gerado e execute o comando a seguir:

    kotlinc main.kt -include-runtime -d main.jar

Um arquivo main.jar será gerado. Para executá-lo use o comando a seguir:

    java -jar main.jar

Como resultado temos:

>Hello, world! -->

Além disso, também é possível acessar o Kotlin interactive e executar algumas operações fazendo run da palavra-chave ```kotlin``` no terminal. Como resultado temos um compiler que faz uso da JVM:

>Welcome to Kotlin version 1.6.10 (JRE 1.8.0_211-b12)<br>
>Type :help for help, :quit for quit<br>

Experimente executar alguma operações ou printar algumas mensagens em string:
     
>var a = 16 * 15<br>
>a<br>
>res4: kotlin.Int = 240

<br>

    println("Welcome to the Kotlin interactive")

Output:

>Welcome to the Kotlin interactive


<h1>Características Básicas</h1>


Sendo multiparadigma, o Kotlin é uma linguagem totalmente orientada a objetos que conta com features da programação funcional. Como foi feita para ser compatível com o JVM, muitas características do Java podem ser encontradas nela e a comparação entre ambas é constante. Partindo dessa comparação, uma característica que  acentua a qualidade do Kotlin é que ele consegue ser mais produtivo e reduz em 40% o código que o Java necessitaria para criar determinada rotina.

O Kotlin é uma linguagem estaticamente tipada, ou seja, a definição de tipos só pode ser inferida uma vez, fazendo com que o elemento tipado se restrinja ao tipo inferido. Tal característica a torna mais rígida e segura em termos de processamento. Outras características destacaveis são:


<h2>Interoperabilidade</h2>


Como citado anteriormente, Kotlin e Java podem fazer parte do mesmo código sem qualquer impedimento. Outra vantegem que a interoperabilidade permite é utilizar as bibliotecas Java em um código Kotlin, já que ambas as linguagens são executadas pelas mesmas APIs.


<h2>Concisão</h2>


A sintaxe do Java é muitas vezes criticada pois exige uma grande quantidade de linhas de código, o que torna seu uso monótono devido a constante repetição. O Kotlin por sua vez, com o intuito de evitar a repetição desnecessária de código, possui uma sintaxe bastante concisa. Um exemplo disso é a declaração de um simples Hello World:

    // Java                                          // Kotlin
                                                                 
    class HelloWrold {                               fun main(args : Array<String>) {
        public static void main(String[] args) {         println("Hello, World!")
            System.out.println("Hello, World!");     }
        }
    }

<h2>Null Safety</h2>

Presente em linguagens modernas como o Dart, o Null Safety é um recurso de segurança void bastante usual. O Null Safety permite declarar a nulidade do código com base em seu tipo, sendo utilizado para evitar erros ao valorar elementos com tipos restritos através do marcador ```?```. Exemplos:

    var stringValue: String = “Hello World!”
    stringValue= null; // error
    
    var stringValue: String? = “Hello World!”
    stringValue = null // ok

O nullsafety será mais bem abordado posteriormente.


<h2>Coroutines</h2>


As coroutines são um design pattern utilizado para simplificar a execução de código assíncrono no Kotlin. Diferente de outras linguagens que definem ```async``` e ```await``` como palavras-chave da execução assíncrona de promises, o Kotlin faz uso do conceito de <i>suspending function</i>, que provê um meio mais seguro e menos propenso a erros de executar operações não síncronas. Tal assunto será mais bem abordado posteriormente.


<h1>Sintaxe Básica</h1>


A seguir iremos abordar a base do que compõe a sintaxe e a estrutura do Kotlin, como declarar e utilizar seus componentes utilizando exemplos práticos:


<h2>Packages e Importações</h2>


Uma file kotlin normalmente inicia com a importação ou declaração de uso dos recursos nela utilizados, sendo package uma das formas de definição:

    package org.example
    
    fun printMessage() { /*...*/ }
    class Message { /*...*/ }
    
    // ...

Todo o conteúdo de uma um arquivo fonte, sejam classes ou funções, está incluído na declaração do package. Por exemplo, a chamada completa da função <i>printMessage()</i> é ```org.example.printMessage```, já a instância completa da classe <i>Message</i> seria ```org.example.Message```.

Se o package não for especificado, o conteúdo desse arquivo pertencerá ao pacote padrão sem nome.


<h2>Imports Padrão</h2>


Em qualquer arquivo Kotlin há uma série de packages importados por padão, eles são:

- [kotlin.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/): Principais funções e tipos disponíveis em todas a plataformas cujo Kotlin está presente.
- [kotlin.annotation.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/): Suporte de biblioteca para o recurso de anotação Kotlin.
- [kotlin.collections.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/): Collection types, como Iterable, Collection, List, Set, Map e funções de extensão e nível superior relacionadas.
- [kotlin.comparisons.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.comparisons/): Funções auxiliares para criar instâncias do Comparator, cuja função é definir igualdade ou distinção entre elementos.
- [kotlin.io.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.io/): IO API para trabalhar com arquivos e streams.
- [kotlin.ranges.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/): Funções de progressão e extensão de alto-nível. Normalmente utilizadas em operações executadas uma determina quantidade de vezes.
- [kotlin.sequences.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/): Definição de tipo de avaliação aplicada a collections que serão avaliadas lentamente.
- [kotlin.text.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/): Funções utilizadas para trabalhar com textos e expressões regulares.

Alguns packages adicionais são importados de acordo com a plataforma em questão:

JVM:

- java.lang.*

- [kotlin.jvm.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/)

JS:

- [kotlin.js.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.js/)


<h2>Imports</h2>


Além das importações padrão, cada arquivo pode conter suas próprias diretivas de importação. Com isso é possível ser específico ao fazer o import de determinado recurso. Por exemplo:

    import org.example.Model // Model agora está acessível

Também é possível ser mais abrangente:

    import org.example.* // Todos os recursos diponíveis em 'org.example' passam a ser acessíveis

Além disso, se determinado recurso importado ocasiona um conflito de identificador nominal, é possível definir seu acesso através da palavra-chave ```as``` seguida de um nome que represente localmente a entidade importada:

    import org.example.Model // Model está acessível
    import org.test.Model as testModel // testModel disponibiliza 'org.test.Model'


<h2>Entry Point</h2>


A execução de uma aplicação em Kotlin sempre será iniciada a partir da ```main``` function.

    fun main() {
        println("Hello world!")
    }


<h2>Print & Println</h2>


A função ```print``` retorna o argumento nela passado como output:

    print("Hello ")
    print("world!")

Output:

>Hello world!

Já a função ```println``` tem a mesma função com o adicional de incluir uma quebra de linha em seu output:

    println("Hello world!")
    println(42)

Output:

>Hello world!
>
>42


<h1>Tipos Básicos</h1>


No Kotlin basicamente tudo é um objeto, de modo que é possível chamar qualquer membro que componha o core da linguagem em qualquer variável, seja uma função ou propriedade. Com isso, alguns tipos possuem uma representação distinta, por exemplo, <i>numbers</i>, <i>characteres</i> e <i>booleans</i> podem ser chamados de primitivos, mas, para o Kotlin, eles são apenas instâncias de classes internas. Na seção a seguir iremos descrever quais são os tipos básicos utilizados no Kotlin e suas características:


<h2>Numbers</h2>


O Kotlin provê uma série de built-in types para representar valores numéricos, sendo estes divididos em dois tipos distintos:


<h2>Intenger</h2>


Intengers são valores inteiros, que no Kotlin podem ser representados de quatro formas distintas com base em seu tamanho:

Type    | Size(bits) |  Min value                                     |  Max value
------- | ---------- | ---------------------------------------------- | -----------------------------------------------
 Byte   |   8        |  -128                                          |  127
 Short  |   16       |  -32768                                        |  32767
 Int    |   32       |  -2,147,483,648 (-2<sup>31</sup>)              |  2,147,483,647 (2<sup>31</sup> - 1)
 Long   |   64       |  -9,223,372,036,854,775,808 (-2<sup>63</sup>)  |  9,223,372,036,854,775,807 (2<sup>63</sup> - 1)

Todas as variáveis inicializadas com valores inteiros que não excedam o valor máximo definido para o identificador ```Int``` são inicializados como int. Caso o valor inicial exceda o valor mínimo, a variável é definida como ```Long```. Para especificar um valor Long explicitamente, é preciso adicionar o sufixo <i>L</i> ao valor atribuído:

    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1


<h2>Floating-point</h2>


Para números decimais, o Kotlin provê os floating-point types <i>Float</i> e <i>Double</i>. De acordo com o padrão [IEEE 754 standard](https://en.wikipedia.org/wiki/IEEE_754), valores decimais se diferenciam por sua posição decimal, que é a quantidade de dígitos que os mesmos podem conter. Float reflete o IEEE 754 <i>single precision</i>, enquanto Double provê <i>double precision</i>:

Type    | Size(bits) | Bits significativos | Bits de expoente | Digitos decimais 
------- | ---------- | ------------------- | ---------------- | -----------------
 Float  |  32        |  24                 |  8               |  6-7
 Double |  64        |  53                 |  11              |  15-16

É possível inicializar variáveis Double e Float com números fracionados, sendo separados por ponto. Para variáveis com inferência de tipo definida por um número decimal, por padrão lhe será atribuída o tipo <i>Double</i>:

    val pi = 3.14 // Double
    // val one: Double = 1 // Error: type mismatch
    val oneDouble = 1.0 // Double

Para especificar explicitamente o tipo <i>Float</i> em uma variável, é preciso adicionar o sufixo <i>f</i> ou <i>F</i> ao valor atribuído. Se um valor contém mais de 6-7 dígitos, ele é arredondado:

    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

Note que diferente de algumas linguagens, no Kotlin, não há conversões de ampliação implícitas para números. Por exemplo, uma função com um parâmetro do tipo <i>Double</i> não pode receber valores do tipo <i>Float</i>, <i>Int</i>, ou qualquer outro tipo numérico, apenas <i>Double</i>:

    fun main() {

        fun printDouble(d: Double) { println(d) }
    
        val i = 1
        val d = 1.0
        val f = 1.0f
    
        printDouble(d)
        printDouble(i) // Error: Type mismatch
        printDouble(f) // Error: Type mismatch

    }

Para converter tais valores, o Kotlin disponibiliza as Explicit conversions, as quais serão abordadas a seguir.


<h2>Explicit Conversions</h2>


Devido a diferentes representações, os tipos numéricos menores não são subtipos dos maiores, como Int é diferente de Long. Tal diferenciação permite manter a identidade de cada tipo restrita a si, e destacar essa característica evita possíveis confusões futuras. Uma consequência dessa diferença é que não é possível converter tipos menores em maiores de forma implícita. O que define a necessidade de utilizar uma conversão explicita. Exemplo:

    val b: Byte = 1 // OK, literais são verificados estaticamente
    // val i: Int = b // ERROR
    val i1: Int = b.toInt()

Todos os tipos numéricos possuem suporte para serem convertidos em outros tipos numéricos:

- toByte(): Byte

- toShort(): Short

- toInt(): Int

- toLong(): Long

- toFloat(): Float

- toDouble(): Double

- toChar(): Char

Em muitos casos, não é necessário utilizar explicit conversion porque o tipo é inferido pelo contexto. Em operações aritméticas por exemplo, as conversões são apropriadas automaticamente: 

    val l = 1L + 3 // Long + Int => Long


<h2>Characters</h2>


Os caracteres no Kotlin são representados pelo tipo <i>Char</i>, sendo definido por um elemento entre aspas simples ```'1'```. Caracteres especiais iniciam com uma barra invertida ```\```, este podendo ser um dos seguintes elementos suportados: \t, \b, \n, \r, \', \", \\ e \$. Para codificar qualquer outro caractere, usa-se a sintaxe de sequência de escape Unicode: '\uFF00'.

    val aChar: Char = 'a'
    
    println(aChar)
    println('\n') //printa um caractere que representa uma linha extra
    println('\uFF00')

Output:

>a
>
>＀


<h2>String</h2>


No Kotlin as Strings são representadas pelo tipo <i>String</i>, geralmente sendo uma sequência de caracteres entre aspas duplas (```" "```):

    val str = "abcd 1234"

Os elementos de uma string são caracteres que podem ser acessados via operador de indexação: ```s[i]```, sendo possível obter qualquer um dos caracteres através de uma interação com a string em questão em um loop for, sobre o qual falaremos mais adiante.

Outro detalhe importante sobre as strings no Kotlin é que tais elementos são imutáveis. Uma vez que uma string é inicializada, não é possível alterar seu valor. Todos os elementos que operam strings retornam seu resultado em um novo objeto string, mantendo a string original inalterada:

    val str = "abcd"
    println(str.uppercase()) // Cria e printa um no objeto String
    println(str) // A Strig original permanece a mesma

Output:

>ABCD<br>
>abcd

Para concatenar uma string usa-se o operador ```+```. Com a concatenação também é possível unir string a valores de diferentes tipos, desde que o primeiro elemento seja uma string:

    val s = "abc" + 1
    println(s + "def")

Output:

>abc1def


<h2>String literals</h2>


O Kotlin possui dois tipos de string literals:

- <i>escaped</i> strings que podem conter caracteres de escape
- <i>raw</i> strings brutas que podem conter novas linhas e texto arbitrário

A seguir temos um exemplo de escapes string:

    val s = "Hello, world!\n"

O escape é feito da maneira convencional, com uma barra invertida (```\```). Consulte Caracteres acima para obter a lista de sequências de escape com suporte.

Uma raw string é delimitada por uma sequência de aspas duplas(```"""```) e pode conter novas linhas e qualquer outro caractere:

    val text = """
        for (c in "foo")
            println(c)
    """

<h2>String templates</h2>


String literals podem conter um <i>template</i> expression que consiste em partes do código que são avaliadas e cujo resultado é concatenado dentro da string. Uma template expression inicia com um cifrão (```$```) seguido do identificador do elemento a ser concatenado:

    val i = 10
    println("i = $i") // printa "i = 10"

Output:

>i = 10

Uma template expression também pode ser declarada entre chaves da seguinte forma:

    val s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"

Output:

>abc.length is 3


<h2>Booleans</h2>


O tipo <i>Boolean</i> representa um objeto booleano que pode vir a ter valor lógico positivo:```true```; ou negativo:```false```. Um boolean possui a contraparte nullable ```Boolean?```, que além dos valores convencionais, também pode receber null.

Os operadores internos do Kotlin para entidades booleanas incluem:

- ```||``` - Dijunção ou OR lógico
- ```&&``` - Conjunção ou AND lógico
- ```!``` - Negação ou NOT lógico

Uma operação utilizando algum dos operadores acima sempre irá resultar em um boolean. Além disso, tanto o operador de dijunção quanto o de conjunção trabalham de forma lenta. Os exemplos a seguir mostram como utilizar tais recursos:


    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null // Variable 'boolNull' is never used
    
    fun main() {
     
      println(myTrue || myFalse)
      println(myTrue && myFalse)
      println(!myTrue)
    
    }

Output:

>true<br>
>false<br>
>false


<h2>Any</h2>


O tipo <i>Any</i> é um tipo genêrico que permite a inserção de qualquer tipo de valor na entidade na qual é inferido. Sendo definido pela classe ```Any```, o tipo pode ser utilizado da seguinte forma:

    var anything: Any = 10
    
    fun main() {
     
     anything = "some text"
     println(anything)
    
    }

Também é possível utilizá-lo como tipo retornado por uma função:

    fun any(): Any { /*...*/ }


<h1>Operadores</h1>


O Kotlin provê os seguintes operadores em sua sintaxe:


<h2>Aritméticos</h2>


O Kotlin dá suporte ao conjunto de operações aritméticas padrão: ```+```, ```-```, ```*```, ```%```:

    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)

Output:

>3<br>
>2499999999<br>
>8.5094<br>
>3.3333333333333335


<h2>Divisão de Inteiros</h2>


A divisão entre números inteiros sempre resultará em um número inteiro, ou seja, qualquer parte fracionada do resultado será descartada:

    val x = 5 / 2
    //println(x == 2.5) // ERROR: O operador '==' não pode ser aplicado entre valores 'Int' e 'Double'
    println(x == 2)

Output:

>true

Para retornar um floating-point type, é preciso converter explicitamente um dos operandos para um dos floating-point types:

    val x = 5 / 2.toDouble()
    println(x == 2.5)

Output:

>true


<h2>Verificação de igualdade</h2>


O Kotlin dá suporte ao conjunto dos seguintes verificadores de igualdade: ```a == b``` e  ```a != b```, ambos tendo um boolean como resultado:

    println(1 == 2)
    println(2_500_000_000L != 1L)
    println(3.14 == 2.71)
    println(10.0.toInt() != 3)

Output:

>false<br>
>true<br>
>false<br>
>true


<h2>Operadores de Comparação</h2>


O Kotlin dá suporte ao conjunto dos seguintes operadores de comparação: ```a < b```, ```a > b```, ```a <= b```, ```a >= b```, todos tendo um boolean como resultado:

    println(1 < 2)
    println(2_500_000_000L > 1L)
    println(3.14 <= 2.71)
    println(10.0.toInt() >= 3)

Output:

>true<br>
>true<br>
>false<br>
>true


<h2>Operadores de incremento e decremento</h2>


O Kotlin dá suporte ao conjunto de operadores de incremento pré e pós fixados: ```++a```, ```a++```, ```--a```, ```a--```, possuindo diferentes resultados:

    var a = 1;
    var b = 1;
    var c = 1;
    var d = 1;
    
    fun main() {
    
      println(++a)
      println(b++)
      println(--c)
      println(d--)
       
    }

Output:

>2<br>
>1<br>
>0<br>
>1

Operadores pré fixados retornam o valor do operando após a operação, já operados pós fixados retornam o valor do operando antes da operação.


<h2>Operadores de Auto Atribuição</h2>


Operações que relacionam dois operandos de forma que o primeiro operando recebe o valor da operação entre seu valor e o de um segundo operando:

    x  =   y // O operando x recebe o operando y
    x  -=  y // O operando x recebe a subtração entre os operandos x e y
    x  /=  y // O operando x recebe a divisão entre os operandos x e y
    x  %=  y // O operando x recebe o resto da divisão entre os operandos x e y
    x  +=  y // O operando x recebe a soma entre os operandos x e y
    x  *=  y // O operando x recebe a multiplicação entre os operandos x e y


<h1>Variáveis</h1>


Variáveis locais são declaradas precedidas da palavra-chave ```val```. Sendo chamadas de ```const``` ou ```final``` em outras linguagens já que podem ser valoradas apenas uma vez:

    val a: Int = 1  // atribuição imediata
    val b = 2   // tipo `Int` inferido pelo valor atribuído
    val c: Int  // Tipo necessário quando nenhum inicializador é fornecido
    c = 3       // atribuição adiada

Caso uma val receba um outro valor durante o runtime, como no exemplo a seguir, uma exception será lançada:

    val a = 1;
    
    fun main() {
       a = 2;
       println(a);
    }

Output:

>main.kt:4:4: error: val cannot be reassigned<br>
>   a = 2;<br>
>   ^

Variáveis cujo valor pode ser redefinido durante o runtime são definidas com a palavra-chave ```var```:

    var a = 1; 

    fun main() {
       a = 2;
       println(a);
    }

Como resultado da execução teriamos:

>2


<h1>Conjuntos</h1>


No Kotlin é possível manipular múltiplos conjuntos de dados através de uma única referência. Normalmente essa função é suprida por um vetor(assunto que será abordado a seguir), mas, no Kotlin é possível associar valores distintos a uma única variável. Uma referência de uso de funcionalidade seria ao trabalhar com coordenadas geográfias, recurso bastante comum em apps:

    val coordinates = Pair(2, 3)

Com a função <i>Pair</i> também pe possível utilizar elementos de tipos distintos, como por exemplo:

    val coordinates = Pair(2.3, 3)

Assim como em um array, é possível acessar cada elemento de um conjuntos:

    coordinates.first // 2.3
    coordinates.second // 3


<h2>Expressão to</h2>


Ao criar um conjunto, é possível definir os elemeentos que o compõe através da expressão <i>to</i>, o to ganha funcionalidade ao permitir encurtar a expressão:

    val coordinates = 2 to 3


<h2>Destruindo um conjunto</h2>


Para destruir um conjunto, ou melhor dizendo, acessar seus elementos individualmente, utiliza-se um destructor:

    val coordinates = Pair(2.3, 3)
    val (x, y) = coordinates
    println(x) // 2.3
    println(y) // 3

Sua função é basicamente anular a conjunção e dar acesso a cada um dos elementos nela contidos individualmente. Para descartar um dos valores, utilizamos a expressão da seguinte forma:

    val coordinates = Pair(2.3, 3)
    val (x, _) = coordinates
    println(x) // 2.3
    println(y) // error: unresolved reference: y


<h1>Range</h1>


A forma mais simples de criar uma sequência de elementos no Kotlin é criando um range. Um range define um intervalo entre dois elementos de um conjunto numérico. No Kotlin, um range comum é criado por meio da declaração de seus dois endpoints, separados por dois pontos: 

>1..10

Também é possível acessar o range inverso ao declarado acima. Para isso usamos a expressão ```downTo```:

>10 downTo 1

O principal operador quando se trata de sequências numéricas em range é o ```contains```, que normalmente é utilizados na forma dos operadores ```in``` e ```!in```:

    for (i in 1..10) {
        println(i)
    }

Output:

>1<br>
>2<br>
>3<br>
>4<br>
>5<br>
>6<br>
>7<br>
>8<br>
>9<br>
>10

Para não percorrer determinado elemento em um range, usa-se a expressão ```until``` no lugar de ```..```:

    for (i in 1 until 10) {  // i in 1 until 10, excluding 10
        println(i)
    }

Output:

>1<br>
>2<br>
>3<br>
>4<br>
>5<br>
>6<br>
>7<br>
>8<br>
>9

Além disso, é possível declarar que um determinado elemento será evitado na interação. Para isso usa-se a expressão ```step``` logo após a declaração do range:

    for (i in 1..10 step 2) println(i)

Output:

>1<br>
>3<br>
>4<br>
>5<br>
>6<br>
>7<br>
>8<br>
>9<br>
>10

O conceito de range é muito utilizado quando se trata de vetores e a interação com os mesmos. A seguir, iremos entender como utilizar vetores no Koltin.


<h1>Collections</h1>


Collections são grupos compostos por um variado número de itens(possivelmente zero), sendo normalmente do mesmo tipo, estes sendo definidos como elements ou items. Há dois grupos que distinguem as collections no Kotlin, sendo elas:

- <i>Read-only</i> ou <I>Ummutable</I>, são collections cujos elementos são constantes, contando com uma interface que permite acessar seus elementos.
- <i>Mutable</i>, são collections cujos elementos são variáveis, contando com uma interface que possui os mesmos recursos das read-only collections mais operadores de controle: adding, removing e updating.

Todas as collections do Kotlin são, por padrão, read-only. Para que seja possível manipular collections, o Kotlin provê interfaces mutáveis para cada uma das collections, estas sendo chamadas de <i>Mutable Collections</i>. As mutable collections possuem as mesmas caracteríticas das suas versões imutáveis, porém, acompanham uma série de funções e propriedades(chamadas de iterators) voltadas para a manipulação e refatoração de seus elementos. 

Os principais tipos de collections presentes no Kotlin são:


<h2>List</h2>


Uma <i>List</i> é uma collection de elementos ordenados que provê acesso a estes por indexação, cuja contagem inicia no número zero e se prolonga até o último elemento da lista, que seria o equivalente a: ```list.size - 1```.

    val numbers = listOf("one", "two", "three", "four")

Uma List pode conter qualquer número de objetos do mesmo tipo ou acorrências de um único objeto, ou seja, uma list permite a duplicidade de elementos. O uso das Lists é recomendado em situações em que o número de elementos agrupados varia dinamicamente durante a execução, podendo ter elementos adicionados, removidos ou editados.


<h2>MutableList</h2>


Como mencionado cada collection no Kotlin possui uma versão mutável acompanhada de interators que permitem a manipulação e refatoração de seus elementos, como a remoção e a adição. Para declarar uma Mutable List usamos o seguinte método:

    val numbers = mutableListOf(1, 2, 3, 4)

O link a seguir lista todos os interatos aplicáveis a MutableLists: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/)


<h2>Set</h2>


Um <i>Set</i> é uma collection que registra elementos únicos, ou seja, é um grupo de objetos que não permite a duplicidade e cuja ordenação não é relevante. Elementos do tipo ```null``` também são considerados em sets, podendo haver um único null em seu escopo.

    val numbers = setOf(1, 2, 3, 4)

O uso de uma Set collection é muito mais matemático que prátrico dentro da sintaxe do Kotlin, e raramente será utilizado.


<h2>MutableSet</h2>


Da mesma forma que as Lists possuiem a interface MutableList, a collection Set conta com uma interface mutável: a MutableSet; que possui os memso interators que uma MutableList, sendo possível manipular os elementos que a compõe. O link a seguir lista todos os interatos aplicáveis a MutableSets: [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/)


<h2>Map</h2>


Mesmo não sendo herdeiros da ```Collection Inteface``` como os demais, Maps também fazem parte do mesmo grupo. Um <i>Map</i> armazena pares de key-value únicos, cuja tipo não é explícito, ou seja, uma key pode receber tanto valores semelhantes quanto distintos das demais. 

Uma key é associada a seu respectivo valor pelo marcador ```to```, já a key é declarada entre aspas:

>"Key" to value

Um Map no Kotlin é declarado da seguinte forma;

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)


<h2>MutableMap</h2>

    
A interface que o Kotlin provê para os Maps conta com funções voltadas para ações específicas, como acessar valores através da sua key, procurar por valores em um key específicos e mais. O link a seguir lista todos os interatos aplicáveis a MutableMaps: [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/)


<h2>Array</h2>


No Kotlin um array é representado pela classe <i>Array</i>, que possui funções comuns a classes Java como ```get``` e ```set```, as quais são acessadas por convenção pelo marcador ```[]```. A classe <i>Array</i> também possui a propriedade size, cuja função clara é definir o tamanho do vetor, além de outros recursos que serão citados a seguir. 

    class Array<T> private constructor() {
        val size: Int
        operator fun get(index: Int): T
        operator fun set(index: Int, value: T): Unit
    
        operator fun iterator(): Iterator<T>
        // ...
    }

Uma forma simples de criar um array é através da função ```arrayOf()```, a qual compõe a classe <i>Array</i> e recebe como argumento os membros do array a ser criado, logo ```arrayOf(1, 2, 3)``` cria o array ```[1, 2, 3]```. Também é possível criar um array através do constructor Array, que recebe seu tamanho e retorna seus elementos por meio de uma função que opera com a indexação dos mesmos e um dado valor: 

    fun main() {
        val asc = Array(5) { "string" }
        asc.forEach { println(it) }
    }

Output:

>string<br>
>string<br>
>string<br>
>string<br>
>string

Para cada index, o valor definido será retornado. Caso um valor não seja dado aos elementos, é possível definir o index como valor:

    fun main() {
        val asc = Array(5) { i -> i }
        asc.forEach { println(it) }
    }

Output: 

>0<br>
>1<br>
>2<br>
>3<br>
>4

No exmplo acima, a função de interação equivale a chamada dos métodos get e set da seguinte forma:

        i -> i 
    get *    * set

Sendo possível omitir o getter visto que a classe já tem acesso ao valor de retorno, que seria o próprio index:

    val asc = Array(5) { _ -> i }

Como dito anteriormente, todas as collections compartilham uma série de iterators padrão, sendo alguns dos principais:


- [MutableCollection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/)


<h1>Funções</h1>


As funções em Kotlin são definidas a partir do identificador <i>fun</i> seguido de um namespace. As funções Kotlin recebem parâmetros nomeados os quais usam Pascal notation(<i>name: type</i>). Por último há a inferência de tipo retornado pela função: 

    fun sum(a: Int, b: Int): Int { /*...*/ }

Uma função ainda pode ter seu escopo omitido, tendo a expressão que a função executa atribuída a si, estas sendo chamadas de ```single-expression``` functions:

    fun sum(a: Int, b: Int) = a + b

Funções Kotlin também podem ter um type genérico, este sendo chamado de ```Unit```:

    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

Por padrão, todas as funções em Kotlin possuem um tipo Unit. Em alternativa, também é possível omitir o tipo inferido a função:

    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }


<h2>Expressões Lambda e Funções Anônimas</h2>


Expressões Lambda e funções anônimas são <i>function literals</i>. Function literals são funções não declaradas, as quais são passadas como uma expressão. Considere o exemplo a seguir:

    max(strings, { a, b -> a.length < b.length })

A função ```max``` é uma higher-order function, ou seja, ela pode receber outras funções por parâmetro e utilizá-las em seu escopo. Nesse caso, a função max recebe como parâmetro uma function literal, que seria equivalente ao seguinte exemplo:

    fun compare(a: String, b: String): Boolean = a.length < b.length


<h2>Sintaxe de uma Expressão Lambda</h2>


Uma função Lambda é utilizada seguindo a sintaxe descrita abaixo:

    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

- Uma expressão lambda é sempre cercada por chaves.
- As declarações de parâmetros na forma sintática completa ficam dentro de chaves e têm anotações de tipo opcionais.
- O corpo da função vai após ```->```.
- Se o tipo de retorno inferido do lambda não for Unit, a última (ou possivelmente única) expressão dentro do corpo lambda será tratada como o valor de retorno.

Caso todas as optional annotations sejam deixadas de fora, o que resta é algo parecido com o isso:

    val sum = { x: Int, y: Int -> x + y }


<h2>Funções Anônimas</h2>


A sintaxe da expressão lambda acima está não conta com um recurso específico – a capacidade de declarar explicitamente o tipo de retorno da função. Na maioria dos casos, isso é desnecessário porque o tipo de retorno pode ser inferido automaticamente. No entanto, se necessário, é possível usar uma sintaxe alternativa: uma função anônima.

    fun(x: Int, y: Int): Int = x + y

Uma função anônima se parece exatamente como uma função regular, exceto pela omissão de um namespace. Seu corpo também pode ser uma expressão(como no exmplo acima) ou um bloco:

    fun(x: Int, y: Int): Int {
        return x + y
    }


<h2>Valores Padrão</h2>


Parâmetros em funções podem possuir valores iniciais, os quais são utilizados quando o mesmo não é utilizado no escopo da função. Com isso também é possível diminuir o número de overloads da execução:

    fun read(
        b: ByteArray,
        off: Int = 0,
        len: Int = b.size,
    ) { /*...*/ }


<h1>Condicionais e Loops</h1>


O controle do fluxo de dados é, em suma, um dos aspectos mais importantes da programação. O Kotlin possui as seguintes estruturas para controle de fluxo de informações:


<h2>If expression</h2>


No Kotlin, o if é uma expressão, ou seja, ele recebe e retorna valores. Também é importante citar que não há um operador ternário (condição ? then : else) no Kotlin, visto que o ordinary if funciona bem nesse papel.

    var max = a

    if (a < b) max = b
    
    // With else

    var max: Int

    if (a > b) {
      max = a
    } else {
      max = b
    }

Caso um if seja utilizado como uma expressão para retornar um valor, ou atribuí-lo a uma variável, por exemplo, a ramificação else é obrigatória:

    // As expression
    val max = if (a > b) a else b

Tamém é possível utilizar expressões condicionais compostas por um ou mais else if, disponibilizando uma ou mais condições adicionais as duas expressões padrão:

    if (/*...*/) {
  
      ...

    } else {
  
      ...

    }


<h2>Verificações de tipo</h2>


As verificações de tipo são bastante comuns quando se trata da validação de determinado elemento do código. No Kotlin há duas formas de verificar o tipo inferido a uma entidade: se ela é de determinado tipo, ou se não é. Para isso, usamos as seguintes expressões respectivamente:

    if(obj is String) {
       println("it's a string")
    } 

A expressão ```is``` declara a condição de positividade quanto ao tipo do elemento a ser validado, retornando true caso o mesmo seja do tipo esperado.

    if(obj !is String) { // !(obj is String)
       println("Not a String")
    } else {
       println("it's a string") 
    }

A expressão ```!is``` tem a função oposta, declarando a condição esperada como negativa quanto ao tipo do elemento a ser validado, retornando true caso o mesmo não seja do tipo esperado.


<h2>Smart Casts</h2>


Casting é um recurso de verificação de tipos bastante usual, definido pela expressão ```as```. Na maioria dos casos, não é preciso usar operadores de conversão explícitos em Kotlin porque o compilador rastreia as verificações da expressão is e conversões explícitas para valores imutáveis ​​e inserções(seguras), as convertendo automaticamente quando necessário:

    fun demo(x: Any) {
        if (x is String) {
            println(x.length) // x é automaticamente convertido para String
        }
    }

Ser imutável é essencial para o funcionamento do Smart Cast pois o compilador precisa garantir que a variável em análise não irá mudar entre sua verificação e seu uso.


<h2>"Unsafe" cast operator</h2>


Normalmente, o operado de cast lançar uma exceção quando não é possível converter a variável em questão. E assim, nesses casos, ela é chamada de <i>unsafe</i>. Um unsafe cast é definido pela já citada expressão infix <i>as</i>:

    val x: String = y as String

Observe que null não pode ser convertido em String, pois esse tipo não permite valor nulo. Se y fosse nulo, o código acima iria lança uma exceção. Para tornar um código como este correto para valores nulos, usa-se o tipo nullable no lado direito da conversão:

    val x: String? = y as String?


<h2>"Safe" (nullable) cast operator</h2>


Para evitar exceções, utiliza-se o operador de <i>safe</i> cast ```as?```, o qual irá retornar null caso ache uma falha.

    val x: String? = y as? String

Observe que, apesar do fato de que o lado direito de as? é um tipo String não nulo, o resultado da conversão é nullable.


<h2>When expression</h2>


A expressão <i>when</i> define uma condicional com multiplas ramificações. É semelhante à instrução switch em linguagem da família C. A expressão when no Kotlin possui a seguinte sintaxe:

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

A verificação é feita sequencialmente em cada ramificação até que um valor satisfaça a condição. Caso seja utilizado como uma expressão, o else será obrigatório até que o compilador prove que todos os casos possíveis estejam listados na ramificação inicial. Exemplo:

    enum class Bit {
      ZERO, ONE
    }
    
    val numericValue = when (getRandomBit()) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
        // 'else' is not required because all cases are covered
    }


<h2>ForEach</h2>


O loop <i>forEach</i>, usado em exemplos anteriores, funciona como um método aplicado a elementos qua permitem interações, como arrays ou expressões em range. Por exemplo:

    fun main() {
     arrayOf(0, 1, 2, 3, 4, 5).forEach {
        println(it)
     }
    }

Output:

>0<br>
>1<br>
>2<br>
>3<br>
>4<br>
>5

<h2>For loops</h2>


O loop <i>for</i> itera qualquer elemento que forneça um iterador, sendo equivalente ao loop foreach em linguagens como C#. A sintaxe da expressão for é a seguinte:

    for (item in collection) println(item)

O escopo de um loop for pode ser um bloco de execução:

    for (item: Int in ints) {
        // ...
    }

Com o loop for é possível interagir com um range de números utilizando uma range expression:

    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

Output:

>1<br>
>2<br>
>3<br>
>6<br>
>4<br>
>2<br>
>0


<h2>For loop + Array</h2>


A formas distintas de operar interações em arrays no Kotlin, o for loop é a mais comum e usual. Uma das formas de utilizá-los em conjunto é através da indexação dos elementos do array:

    var myArray = Array(5) { i -> i }
    
    fun main() {
     for (i in myArray) {
         println(myArray[i])
     }
    }

Output:

>0<br>
>1<br>
>2<br>
>3<br>
>4

Em alternativa, é possível utilizar a função ```withIndex()```:

    var myArray = Array(5) { i -> i }
    
    fun main() {
     for ((index, value) in myArray.withIndex()) {
         println("$index - $value")
     }
    }

Output:

>0 - 0<br>
>1 - 1<br>
>2 - 2<br>
>3 - 3<br>
>4 - 4


<h2>Retornos e Jumps</h2>


O Kotlin possui três expressões de jump estruturais, as quais são utilizadas em conjunto com os controladores de fluxo em loop, elas são:

- ```return``` - Por padrão retorna da função mais próxima a delimitar a expressão.
- ```break``` - Encerra o loop mais próximo a delimitar a expressão.
- ```continue``` - Prossegue para o próximo passo do loop mais próximo a delimitar a expressão.

Há formas distintas de utilizar cada uma das expressões acima, com distinções ainda mais especificas quando se trata de diferentes estruturas de loop. Por exemplo, a expressão break não pode ser utilizada em conjunto com um forEach loop:
    
    var myArray = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    fun main() {
     myArray.forEach {
       println(it)
       if(it >= 8)
       break
     }
    }

Output:

>[Running] cd "c:\Ads\Linguagens\Kotlin\Development\" && kotlinc main.kt -include-runtime -d main.jar && java -jar main.jar<br>
>main.kt:21:4: error: 'break' and 'continue' are only allowed inside a loop<br>
>   break<br>
>   ^<br>
>
>[Done] exited with code=1 in 2.534 seconds

Nesse caso, em vez de utilizar a expressão break, usa-se um recurso chamado de lables, o qual será abordado a seguir.


<h2>Break & Continue labels</h2>


Qualquer expressão no Kotlin pode ser marcada por um label. Labels são formados por identificadores seguidos pelo sinal ```@```. Para rotular uma expressão basta adicionar um label que identifique a sua declaração:

    loop@ for (i in 1..100) {
        // ...
    }

Com o marcador, é possível qualificar uma expressão break ou continue com o label criado:

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (...) break@loop
        }
    }

Uma expressão ```break``` qualificada com um label faz um jump para o ponto de excução logo após o loop marcado com o label. Já o ```continue``` prossegue para a próxima interação do loop marcado.


<h2>Return labels</h2>


No Kotlin, as funções podem ser aninhadas usando funções literais, funções locais e expressões de objeto. Retornos qualificados com lables permitem retornar de uma função externa. O caso de uso mais importante é retornar de uma expressão lambda. É importante lembrar que o valor retornado ao utilizar um return é definido pela loop mais próximo ou o que delimita a expressão. Por exmplo:

    fun main() {
      arrayOf(1, 2, 3, 4, 5).forEach {
          if (it == 3) return // non-local return directly to the caller of foo()
          print(it)
      }
      println("este ponto não é acessível")
    }

Output:

>12

Observe que esses retornos não locais são suportados apenas por expressões lambda passadas para funções inline. Para retornar de uma expressão lambda, é preciso rotulá-la junto com seu retorno:

    fun main() {
     arrayOf(1, 2, 3, 4, 5).forEach lit@ {
       if (it == 3) return@lit 
       print(it)
     }
     print(" feito com um lable explicito")
    }

Output:

>1245 feito com um lable explicito


Perceba que em expressões <i>forEach</i>, o uso dos local returns possuem efeito similar ao uso do <i>continue</i> em loops regulares. Nele não há equivalente para a expressão break, mas é possível obter o mesmo resultado fazendo uso de um return label:

    arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach lit@ {
      if(it > 8) return@lit
      println(it)
    }

Output:

>0<br>
>1<br>
>2<br>
>3<br>
>4<br>
>5<br>
>6<br>
>7<br>
>8



<h2>While loops</h2>


Os loops <i>while</i> e <i>do-while</i> executam seu body continuamente enquanto sua condição for satisfatória. A diferença entre eles é o tempo de verificação de condição:

- <i>while</i> verifica a condição e, caso esta o satisfaça, executa o body e posteriormente retorna à verificação.
- <i>do-while</i> executa o body e posteriormente a condição. Caso esta o satisfaça, o loop é repetido. 

Portanto, o corpo do <i>do-while</i> é executado pelo menos uma vez, independentemente da condição.

    while (x > 0) {
        x--
    }
    
    do {
        val y = retrieveData()
    } while (y != null) // y is visible here!

O Kotlin também suporta os operadores ```break``` e ```continue``` comuns a loops, sobre os quais falaremos a seguir.


<h2>Exceptions</h2>


Todas as exception classes no Kotlin herdam a classe Throwable. Cada exception possui um message, um stack trace e uma optional cause.

Para lançar um exeption object, usa-se a expressão throw:

    throw Exception("Hi There!")

Output: 

>Exception in thread "main" java.lang.Exception: Hi There!<br>
>at MainKt.main(main.kt:3)<br>
>at MainKt.main(main.kt)


Para tratar uma exceção, usa-se a expressão ```try```...```catch```:

    try {
        // some code
    } catch (e: SomeException) {
        // handler
    } finally {
        // optional finally block
    }

É possível criar zero ou mais blocos catch, e o bloco finally pode ser omitido. Porém, ao menos um catch ou finally é obrigatório.


<h1>NullSafety</h1>


O já citado <i>nullsafety</i> é um recurso bastante comum a liguagens de programação modernas. Em uma definição rápida, poderia ser dito que o nullsafety é um método de controle de tipos nulos, com o qual é possível evitar reference exceptions quando determinado dato acessado é inesperadamente nulo. 

Atribuir um tipo null a uma variável só a torna passível de receber null. Com o nullsafety é possível definir que um elemento de determindado tipo espere por uma possível nulidade do valor recebido. Um dos vários casos de uso seria a obtenção de informações oriundas de Api's externas, cujo processo pode contar com impeditivos não previstos ou tipos desconhecidos, resultando em uma exception, e, por conseguinte, em um crash no código.

No Kotlin, o sistema de tipos distingue as referencias que podem ser ```null```(nullable reference) das que não podem(non-null reference). Por exemplo, uma variável tipada como String não sustenta um null:

    var a: String
    a = null // compilation error

Para que seja possível tornar o exemplo acima livre do erro resultante, a variável deve ser tipada com o marcador ```?```, a tornando nullable:

    var b: String?
    b = null // ok
    print(b)

Caso seja necessário acessar e utilizar o valor contido em uma variável nullable, é preciso garantir que o valor nela contido não seja null. Por exemplo, a seguinte atribuição não seria alvo de uma exception pois ```a``` só será valorada com valores non-nullable:

    val l = a.length

Já a variável ```b```, cujo valor pode ser nulo, não permite tal atribuição:

    val l = b.length // error: variable 'b' can be null

No Kotlin, há formas distintas de acessar esse valor.


<h2>Verificação de Valores Nulos</h2>


Primeiramente, é possível verificar se a variável b é nula e tratar as duas possibilidades de forma separada:

    val b: String? = "Kotlin"
    if (b != null && b.length > 0) {
        print("String of length ${b.length}")
    } else {
        print("Empty string")
    }

Output:

    String of length 6


<h2>Safe Calls</h2>


Uma alternativa para permitir o acesso a propriedades de entidades nullable é utilizar o operador de chamada segura, ou safe call ```?.```:

    val a = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length) // Unnecessary safe call

Output:

>null<br>
>6

A safe call é declarada após a instância da entidade e retorna o valor da propriedade caso sua origem não seja nula, caso contrário, retorna null.


<h2>O Operador !!</h2>


A terceira opção seria utilizar o operador de asserção não nulo (```!!```). Sua função é converter qualquer valor para um tipo non-null, lançando uma exception caso o valor seja null:

    val l = b!!.length

Ao aplicar o operador !! na variável b, é possível acessar suas propriedades sem uma verificação condicional de alto nível.


<h1>Kotlin e a Orientação a Objetos</h1>


Por ser uma linguagem orintada a objetos, o Kotlin conta com todos os recursos padrões do paradigma, como Classes, Constructors, herança baseada em hierarquia, além de muitos outros conceitos. A seguir iremos entender como aplicar os conceitos da POO com o Kotlin.


<h1>Classes</h1>


A classes no Kotlin são declaradas utilizando a palavra-chave ```class```:

    class Person { /*...*/ }

A declaração de uma classe consiste em identificador, o header da classe (especificando seus parãmetros, constructor e etc), e por último, um body, delimitado por chaves. Ambos header e body são opcionais, sendo possível omitir as chaves que o delimitam:

    class Empty


<h2>Constructor</h2>


Uma classe no Kotlin possui um ou mais constructors. Um <i>primary constructor</i> é parte do header da classe, podendo ser declarado após o identificador da classe da seguinte forma:

    class Person constructor(parameter: type) { /*...*/ }

O contructor pode receber parâmetros assim como uma função qualquer, sendo possível acessar seus valores ao inicializar a classe. Casp o <i>primary constructor</i> não possua annotations ou modificadores de visibilidade, a palavra-chave do construtor pode ser omitida:

    class Person(firstName: String) { /*...*/ }

O <i>primary constructor</i> não pode executar código algum. Código de inicialização pode ser alocado em blocos de inicialização, ou <i>initializaer block</i> prefixados com a palavra-chave ```init```:

    class Person(firstName: String) {
        init { /*...*/ }
     }

Durante a inicialização de uma classe, os blocos de init são executados na sua ordem de declaração, com o intervalo entre as inicializações das propriedades, que por sua vez podem receber os valores dos parâmetros do <i>primary constructor</i>: 

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
