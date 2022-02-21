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


<h2>Ambiente de Desenvolvimento</h2>


Da forma que foi descrito acima, é perceptível que o Kotlin pode ser utilizado de diversas maneiras e em ambiente distintos. Porém, para os quais pretendem aprender os conceitos básicos e até mesmo avançados da linguagem sem se preocupar com a criação de um projeto ou a obtenção de ferramentas custozas, a melhor opção é utilizar o VSCode. O VSCode é um editor de código bastante popular, que não possui os recursos de IDE's como o [Android Studio](https://developer.android.com/studio) ou [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/), que são alternativas, mas fornece o suficiente para que seja possível aprender a sintaxe da linguagem de forma prática.

Sendo assim, com o intuito de criar o ambiente mínimo para executar o Kotlin, faremos algumas instalações:

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
- [kotlin.sequences.*](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/): Definição de tipo de avaliação aplicada a collection que serão avaliadas lentamente.
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

>Hello world!

Já a função ```println``` tem a mesma função com o adicional de aincluir uma quebra de linha em seu output:

    println("Hello world!")
    println(42)

>Hello world!
>
>42