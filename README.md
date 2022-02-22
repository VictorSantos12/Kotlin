<div align="center">
  <img src="https://user-images.githubusercontent.com/61476935/154181283-f96bc557-81ba-45ee-8eae-4896d5656111.png">
</div>
<br>
<img src="https://img.shields.io/static/v1?label=Kotlin&message=Language&color=purple&style=for-the-badge&logo=Kotlin"/>


O Kotlin é uma linguagem de programação multiparadigma criada pela [JetBrains](https://www.jetbrains.com/pt-br/) no ano de 2011 com o intuito de atualizar ou mesmo substituir o Java. Sendo multiplataforma, o Kotlin é especialmente famoso por estar presente em aplicações sever-side, web e principalmente mobile. Isso se dá pois a linguagem foi criada para para ser compilada e executada na JVM(Java Virtual Machine), tornando possível utilizá-la em códigos baseados em Java e vice-versa, o que permite tâ-la presente em basicamente qualquer ambiente em que o Java é executado.

Indo além da JVM, o Kotlin se tornou mais notório do que sua função inicial permitiria. Oriunda da parceria entre a Google e a JetBrains, foi criada a Kotlin Foundation, que é a atual responsável pela linguagem. Da mesma parceria surgiu em 2017 a inclusão e o suporte do Kotlin em ferramentas como o Android Studio e aplicações Android em geral, passando a ser sua preferred language da plataforma em 2019. Além disso, o Kotlin também sofre constantes contribuições da comunidade por ser um projeto open-source.


<!-- <h1>Kotlin Multiplataform</h1> -->


<!-- <h2>Kotlin for Android</h2>


Como já foi mencionado o desenvolvimento de aplicações android é atualmente <i>Kotlin-first</i>, sendo assim desde que a parceria foi anunciada na Google I/O de 2019. -->


<h1>Ambiente de Desenvolvimento</h1>


O Kotlin pode ser utilizado de diversas maneiras e em ambientes distintos, os quais disponibilizam diferentes recursos úteis ao desenvolvimento de aplicações multiplataforma de formas diversas. Elas são:


<h2>IntelliJ IDEA</h2>


O IntelliJ IDEA é uma IDE criada pela JetBrains voltada para maximizar a produtividade dos desenvolvedores. Danto total supote ao Java, Kotlin, Scala e Groovy, o IntelliJ possui inúmeros recursos que potencializam o desenvolvimento. O link a seguir indica como obter e instalar as versões da ferramenta:

- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)


<h2>Android Studio</h2>


O Android Studio é o ambiente oficial de desenvolvimento integrado para o desenvolvimento de aplicações Andorid, baseado no IntelliJ IDEA. Indo além do IntelliJ, o Android Studio oferece ainda mais ferramentas com o intuito de melhorar a produtividade ao criar uma aplicação android, como:

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


O VSCode é um editor de código bastante popular, que não possui os recursos de IDE's como o Android Studio ou o IntelliJ IDEA, mas fornece o suficiente para que seja possível aprender a sintaxe do Kotlin de forma prática. Sendo assim, com o intuito de criar o ambiente mínimo para executar o Kotlin, faremos algumas instalações:

- [VSCode](https://code.visualstudio.com/)

O VSCode é imprescindível para escrever e compilar o código Kotlin de forma simples e rápida. Além do próprio editor, iremos incluir duas extensões essenciais, sendo elas:

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

Como output teremos o seguinte resultado:

    [Running] cd "c:\..\..\..\..\" && kotlinc main.kt -include-runtime -d main.jar && java -jar main.jar
    Hello, world!
    
    [Done] exited with code=0 in 3.62 seconds

Outra forma de obter o resultado é gerando um arquivo em java a partir da file .Kt. Para isso, no terminal, acesse o diretório em que o arquivo deve ser gerado e execute o comando a seguir:

    kotlinc main.kt -include-runtime -d main.jar

Um arquivo main.jar será gerado. Para executá-lo use o comando a seguir:

    java -jar main.jar

Como resultado temos:

>Hello, world!

Além disso, também é possível acessar o Kotlin interactive e executar algumas operações fazendo run da palavra-chave ```kotlin``` no terminal. Como resultado temos um compiler que faz uso da jvm:

    Welcome to Kotlin version 1.6.10 (JRE 1.8.0_211-b12)
    Type :help for help, :quit for quit
    >>>

Experimente executar alguma operações ou printar algumas mensagens em string:
     
    >>> var a = 16 * 15
    >>> a
    res4: kotlin.Int = 240

<br>

    >>> println("Welcome to the Kotlin interactive")
    Welcome to the Kotlin interactive


<h2>Características Básicas</h2>


Sendo multiparadigma, o Kotlin é uma linguagem totalmente orientada a objetos que conta com features da programação funcional. Como foi feita para ser compatível com o JVM, muitas características do Java podem ser encontradas nela e a comparação entre ambas é constante. Partindo dessa comparação, uma característica que  acentua a qualidade do Kotlin é que ele consegue ser mais produtivo e reduz em 40% o código que o Java necessitaria para criar determinada rotina.

O Kotlin é uma linguagem estaticamente tipada, ou seja, a definição de tipos só pode ser inferida uma vez, fazendo com que o elemento tipado se restrinja ao tipo inferido. Tal característica a torna mais rigida e segura em termos de processamento. Outras características destacaveis são:


<h3>Interoperabilidade</h3>


Como citado anteriormente, Kotlin e Java podem fazer parte do mesmo código sem qualquer impedimento. Outra vantegem que a interoperabilidade permite é utilizar as bibliotecas Java em um código Kotlin, já que ambas as linguagens são executadas pelas mesmas APIs.


<h3>Concisão</h3>


A sintaxe do Java é muitas vezes criticada pois exige uma série de declarações e definições de acesso que não são necessárias em muitas linguagens populares. O Kotlin por sua vez, com o intuito de evitar a repetição desnecessária de código, possui uma sintaxe bastante concisa. Um exemplo disso é a declaração de um simples Hello World:

    // Java                                          // Kotlin
                                                                 
    class HelloWrold {                               fun main(args : Array<String>) {
        public static void main(String[] args) {         println("Hello, World!")
            System.out.println("Hello, World!");     }
        }
    }

<h3>Null Safety</h3>

Presente em linguagens modernas como o Dart e Typescript, o Null Safety é um recurso de segurança void bastante usual. O Null Safety permite declarar a nulidade ou nullability do código com base em seu tipo, sendo utilizado para evitar erros ao valorar elementos com tipos restritos através do marcador ```?```. Exemplos:

    var stringValue: String = “Hello World!”
    stringValue= null; // error
    
    var stringValue: String? = “Hello World!”
    stringValue = null // ok


<h3>Coroutines</h3>


As coroutines são um design pattern utilizado para simplificar a execução de código assíncrono no Kotlin. Diferente de outras linguagens que definem ```async``` e ```await``` como palavras-chave da execução assíncrona de promises, o Kotlin faz uso do conceito de <i>suspending function</i>, que provê um meio mais seguro e menos propenso a erros de executar operações não síncronas. Tal assunto será mais bem abordado posteriormente.


<h1>Sintaxe Básica</h1>


A seguir iremos abordar a base e um pouco além do que compõe a sintaxe e estrutura do Kotlin, como declarar e utilizar seus componentes utilizando exemplos práticos e como tais elementos seriam declarados em Java para fins de comparação:


<h2>Packages e Importações</h2>


Uma file kotlin normalmente inicia coma uma declaração de package:

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

A execução do exemplo acima terá o seguinte output:

>Hello world!

Já a função ```println``` tem a mesma função com o adicional de aincluir uma quebra de linha em seu output:

    println("Hello world!")
    println(42)

A execução do exemplo acima terá o seguinte output:

>Hello world!
>
>42


<h2>Tipos Básicos</h2>


No Kotlin, basicamente tudo é um objeto, de modo que é possível chamar qualquer membro que componha o core da linguagem em qualquer variável, seja uma função ou propriedade. Com isso, alguns tipos possuem uma representação distinta, por exemplo, <i>numbers</i>, <i>characteres</i> e <i>boolenas</i> podem ser representados como valores primitivos durante o runtime, mas, para o usuário, eles são apenas instâncias de classes internas. Na seção a seguir iremos descrever quais são os tipos básicos utilizados no Kotlin e suas características:


<h2>Numbers</h2>


O Kotlin provê uma série de built-in types para representar valores numéricos, sendo estes divididos em dois tipos distintos:


<h3>Intenger</h3>


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


<h3>Floating-point</h3>


Para números decimais, o Kotlin provê os floating-point types <i>Float</i> e <i>Double</i>. De acordo com o padrão [IEEE 754 standard](https://en.wikipedia.org/wiki/IEEE_754), valores decimais se diferenciam por sua posição decimal, que é a quantidade de dígitos que os mesmos podem conter. Foat reflete o IEEE 754 <i>single precision</i>, enquanto Double provê <i>double precision</i>:

Type    | Size(bits) | Bits significativos | Bits de expoente | Digitos decimais 
------- | ---------- | ------------------- | ---------------- | -----------------
 Float  |  32        |  24                 |  8               |  6-7
 Double |  64        |  53                 |  11              |  15-16

É possível inicializar variáveis Double e Float com números fracionados, sendo separados por ponto. Para variáveis com inferência de tipo defina por um número decimal, por padrão lhe será atribuída o tipo <i>Double</i>:

    val pi = 3.14 // Double
    // val one: Double = 1 // Error: type mismatch
    val oneDouble = 1.0 // Double

Para especificar explicitamente o tipo <i>Float</i> em uma variável, é preciso adcionar o sufixo <i>f</i> ou <i>F</i> ao valor atribuído. Se um valor contém mais de 6-7 dígitos, ele é arredondado:

    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

Note que diferente de algumas linguagens, no Kotlin, não há conversões de ampliação implícitas para números. Por exemplo, uma função com um parâmetro do tipo <i>Double</i> não pode receber valores do tipo <i>Float</i>, <i>Int</i>, ou qualquer outro tipo numérico, apenas <i>Double</i>:

    fun main() {

        fun printDouble(d: Double) { print(d) }
    
        val i = 1
        val d = 1.0
        val f = 1.0f
    
        printDouble(d)
        printDouble(i) // Error: Type mismatch
        printDouble(f) // Error: Type mismatch

    }

Para converter tais valores, o Kotlin disponibiliza as Explicit conversions, as quais serão abordadas a seguir.


<h2>Explicit Conversions</h2>


Devido a diferentes representações, os tipos numéricos menores não são subtipos dos maiores, como Int é diferente de Long. Tal diferenciação permite manter a identidade de cada tipo restrita a si, e destacar essa característica evitar possíveis confusões futuras. Uma consequência dessa diferença é que não é possível converter tipos menos em maiores de forma implicita. O que define a necessidade de utilizar uma conversão explicita. Exemplo:

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

Em muitos casos, não é necessário utilizar explicit conversion porque o tipo é inferido pelo contexo. Em operações aritméticas por exemplo, as conversões são aopropriadas automaticamente: 

    val l = 1L + 3 // Long + Int => Long


<h2>Operadores</h2>


O Kotlin porvê os seguintes operadores em seua sintaxe:


<h3>Aritméticos</h3>


O Kotlin dá suporte ao conjunto de operações aritméticas padrão: ```+```, ```-```, ```*```, ```%```:

    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)

A execução do exemplo acima terá o seguinte output:

>3
>2499999999
>8.5094
>3.3333333333333335


<h3>Divisão de Inteiros</h3>


A divisão entre números inteiros sempre resultará em um número inteiro, ou seja, qualquer parte fracionada do resultado será descartada:

    val x = 5 / 2
    //println(x == 2.5) // ERROR: O operador '==' não pode ser aplicado entre valores 'Int' e 'Double'
    println(x == 2)

A execução do exemplo acima terá o seguinte output:

>true

Para retornar um floating-point type, é preciso converter explicitamente um dos operandos para um dos floating-point types:

    val x = 5 / 2.toDouble()
    println(x == 2.5)

A execução do exemplo acima terá o seguinte output:

>true


<h3>Verificação de igualdade</h3>


O Kotlin dá suporte ao conjunto dos seguintes operadores de igualdade: ```a == b``` e  ```a != b```, ambos tendo um boolean como resultado:

    println(1 == 2)
    println(2_500_000_000L != 1L)
    println(3.14 == 2.71)
    println(10.0.toInt() !== 3)

A execução do exemplo acima terá o seguinte output:

>false
>true
>false
>true


<h3>Operadores de Comparação</h3>


O Kotlin dá suporte ao conjunto dos seguintes operadores de comparação: ```a < b```, ```a > b```, ```a <= b```, ```a >= b```, todos tendo um boolean como resultado:

    println(1 < 2)
    println(2_500_000_000L > 1L)
    println(3.14 <= 2.71)
    println(10.0.toInt() >= 3)

A execução do exemplo acima terá o seguinte output:

>true
>true
>false
>true


<h2>Booleans</h2>


O tipo <i>Boolean</i> representa um objeto booleano que pode vir a ter valor lógico positivo: ```true```; ou negativo ```false```. Um boolean possui a contraparte nullable ```Boolean?```, que além dos valores comvencionais, também pode receber null.

Os operadores internos do Kotlin para entidades booleanas incluem:

- ```||``` - Dijunção ou OR lógico
- ```&&``` - Conjunção ou AND lógico
- ```!``` - Negação ou NOT lógico

Uma operação utilizado algum dos operadores acima sempre irá resultar em um boolean. Além diiso, tanto o operador de dijunção quanto o de conjunção trabalhão de forma lenta. Os exemplos a seguir mostra como utilizar tais recursos:


    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null // Variable 'boolNull' is never used
    
    fun main() {
     
      println(myTrue || myFalse)
      println(myTrue && myFalse)
      println(!myTrue)
    
    }

Como resultado do exemplo acima, temos o seguinte output:

>true
>false
>false


<h2>Charactes</h2>


Os cracteres no Kotlin são representados pelo tipo <i>Char</i>, sendo definido por um elemento entre aspas simples ```1```. Cracteres especiais iniciam com uma barra invertida ```\```, este podendo ser um dos seguintes elementos suportados: \t, \b, \n, \r, \', \", \\ e \$. Para codificar qualquer outro caractere, usa-se a sintaxe de sequência de escape Unicode: '\uFF00'.

    val aChar: Char = 'a'
    
    println(aChar)
    println('\n') //printa um caractere que representa uma linha extra
    println('\uFF00')

Como resultado do exemplo acima, temos o seguinte output:

>a
>
>
>＀


<h2>String</h2>


No Kotlin uma Strings são representadas pelo tipo <i>String</i>, geralmente sendo uma sequência de caracteres entre aspas duplas (```" "```):

    val str = "abcd 1234"

Os elementos de uma string são caracteres que podem ser acessádos via um operador de indexação: ```s[i]```, sendo possível obter qualquer um dos caracteres através de uma interação com a string em questão em um loop for, sobre o qual falaremos mais adiante.

Outro detalhe importante sobre as strings no Kotlin é que tais elementos são imutáveis. Uma vez que uma string é inicializada, não é possível alterar seu valor. Todos os elementos que operam strings retornam seu resultado em um novo objeto string, mantndo a string original inalterada:

    val str = "abcd"
    println(str.uppercase()) // Cria e printa um no objeto String
    println(str) // A Strig original permanece a mesma

Como resultado do exemplo acima, temos o seguinte output:

>ABCD
>abcd

Para concatenar uma string usa-se o operador ```+```. Com a concatenação também é possível unir string a valores de diferentes tipos, desde que o primeiro elemento seja a string:

    val s = "abc" + 1
    println(s + "def")

Como resultado do exemplo acima, temos o seguinte output:

>abc1def


<h3>String literals</h3>


O Kotlin possui dois tipos de string literals:

- <i>escaped</i> strings que podem conter caracteres de escape
- <i>raw</i> strings brutas que podem conter novas linhas e texto arbitrário

A seguir temos um exemplo de escapes string:

    val s = "Hello, world!\n"

O escape é feito da maneira convencional, com uma barra invertida (```\```). Consulte Caracteres acima para obter a lista de sequências de escape com suporte.

Uma raw string é delimitada por uma sequência de aspas duplas(```"""```) e pode conter novas linhas e qualquer outro caractere:

    val text = """
        for (c in "foo")
            print(c)
    """

<h3>String templates</h3>


String literals podem conter um <i>template</i> expression que consiste em partes do código que são avaliadas e cujo resultado é concatenado dentro da string. Uma template expression inicia com um cifrão (```$```) seguido do identificado do elemento a ser concatenado:

    val i = 10
    println("i = $i") // printa "i = 10"

output:

>i = 10

Uma template expression também pode ser declarada entre chaves da seguinte forma:

    val s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"

output:

>abc.length is 3


<h2>Funções</h2>


As funções em Kotlin são definidas a partir do identificador <i>fun</i> seguido de um namespace com os args entre parênteses e por último a inferência de tipo retornado pela mesma: 

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

Uma função inda pode ter um omissão do seu escopo, tendo a expressão que a função executa o substituindo:

    fun sum(a: Int, b: Int) = a + b

Funções Kotlin também podem te um type genêrico, este sendo chamdo de ```Unit```:

    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

Em alternativa, também é possível omitir o tipo inferido a função:

    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }


<h2>Variáveis</h2>


Variáveis locais são declaradas precedidas da palavra-chave ```val```. Essas seriam chamadas ```consts``` em outras linguagens já que podem ser valoradas uma vez apenas:

    val a: Int = 1  // atribuição imadiata
    val b = 2   // tipo `Int` inferido pelo valor atribuído
    val c: Int  // Tipo necessário quando nenhum inicializador é fornecido
    c = 3       // atribuição adiada

Caso uma val receba um outro valor durante o fluxo de execução, como no exemplo a seguir, uma exception será lançada:

    val a = 1;
    
    fun main() {
       a = 2;
       print(a);
    }

Como resultado da execução teriamos:

>main.kt:4:4: error: val cannot be reassigned<br>
>   a = 2;<br>
>   ^

Variáveis cujo valor pode ser redefinido durante o fluxo de execução são definidas com a palavra-chave ```var```:

    var a = 1; 

    fun main() {
       a = 2;
       print(a);
    }

Como resultado da execução teriamos:

>2


<h2>Array</h2>

