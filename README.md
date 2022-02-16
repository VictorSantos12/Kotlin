<div align="center">
  <img src="https://user-images.githubusercontent.com/61476935/154181283-f96bc557-81ba-45ee-8eae-4896d5656111.png">
</div>
<br>
<img src="https://img.shields.io/static/v1?label=Kotlin&message=Language&color=purple&style=for-the-badge&logo=Kotlin"/>


O Kotlin é uma linguagem de programação multiparadigma criada pela [JetBrains](https://www.jetbrains.com/pt-br/) no ano de 2011 com o intuito de atualizar ou mesmo substituir a linguagem Java. Sendo multiplataforma, o Kotlin é especialmente famoso por estar presente em aplicações sever-side, web e principalment mobile. O Kotlin é ainda mais popular por ser facilmente compilado e executado na JVM(Java Virtual Machine), o que permite utilizá-lo em códigos baseados em Java e vice-versa.

Indo além da JVM, o Kotlin se tornou mais notório do que sua função inicial permitiria. Oriunda da parceria entre a Google e a JetBrains, foi criada a Kotlin Foundation, que é a atual responsável pela linguagem. Além disso, o Kotlin também sofre constantes contribuições da comunidade por ser um porjeto open-source e é suportada por ferramentas como o Android Studio e aplicações Android em geral desde 2017, passando a ser sua preferred language em 2019.


<!-- <h1>Kotlin Multiplataform</h1> -->


<!-- <h2>Kotlin for Android</h2>


Como já foi mencionado o desenvolvimento de aplicações android é atualmente <i>Kotlin-first</i>, sendo assim desde que a parceria foi anunciada na Google I/O de 2019. -->


<h2>Ambiente de Desenvolvimento</h2>


Da forma que foi descrito acima, é perceptível que o Kotlin pode ser utilizado de diversas maneiras e em ambiente distintos. Porém, para os quais pretendem aprender os conceitos básicos e até mesmo avançados da linguagem sem se preocupar com a criação de um projeto ou a obtenção de inúmeras ferramentas, a melhor opção é utilizar o [VSCode](https://code.visualstudio.com/). O VSCode é um editor de código bastante popular, que não possui os recursos de IDE's como o Android Studio ou IntelliJ IDEA, mas fornece o suficiente para que seja possível aprender a sintaxe da linguagem de forma prática.

Com isso, com o intuito de criar o ambiente mínimo para executar o Kotlin, faremos algumas instalações:

- [VSCode](https://code.visualstudio.com/)

O VSCode é imprescindível para escrever e compilar o código Kotlin de forma simples e rápida. Além do próprio editor, iremos incluir duas extensões essenciais, sendo elas:

<div>
  <img width="50%" src="https://user-images.githubusercontent.com/61476935/154200841-084b114e-b16a-4039-b1b6-eae294acd78f.png">
  <img width="50%" src="https://user-images.githubusercontent.com/61476935/154200796-f7c8063e-a990-45fc-b455-790659558c6f.png">
</div>


- [Kotlin Compiler](https://kotlinlang.org/docs/native-command-line-compiler.html)


O Kotlin Compiler ou Kotlinc, será a responsável por compilar o código gerado. O link acima mostra como obter a versão mais recente da ferramenta, a qual será obtida a partir do download de uma zip file que pode ser identificada da seguinte forma: ```kotlin-compiler-0.0.0.zip```. Após o fim da instalação, extraia o documento e o anexe a um diretório de sua preferência, exemplo: C:\Kotlin. 

No arquivo Kotlinc há um diretório bin, o qual contém a ferramenta. Para que seja possível executar o compiler globalmente, adicione uma nova variável de ambiente a variável Path contendo o caminho até a pasta bin. Exemplo: C:\Kotlin\kotlinc\bin.

Após a criação da nova variável de ambiente, reinicie o computador para que a mesma seja lida, já sendo possível, em seguida, utilizar o Kotlin Compiler. Para atestar sua instalção, acessa o terminal de comando e execute:

    kotlinc -version 

O resultado deve ser semelhante ao seguinte:

    info: kotlinc-jvm 1.6.10 (JRE 1.8.0_211-b12)

Obs.: Para que esse processo seja possível, é preciso ter uma versão igual ou superior a <i>Java 1.8</i>, do contrário não será possível fazer uso do Kotlin.

Após montar o ambiente de desenvolvimento, iremos abordar os aspectos que definem o Kotlin, como sua sintaxe, tipagem e paradigmas que a linguagem abrange.


<h2>Hello World</h2>


Uma forma prática de entender a estrutura mais básica de uma linguagem de programação é o popular Hello World. Sendo assim, em uma file hellWorld.kt, execute as seguintes linhas de código:

    fun main() {
        println("Hello, world!")
    }

Como output teremos o seguinte resultado:

    [Running] cd "c:\..\..\..\..\" && kotlinc main.kt -include-runtime -d main.jar && java -jar main.jar
    Hello, world!
    
    [Done] exited with code=0 in 3.62 seconds


<h2>Características Básicas</h2>