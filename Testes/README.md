# **_Desenvolvimento avançado em java_**

## **_Paradigmas Funcionais no java_**

### É uma técnica de otimização que consiste no cache do resultado de uma função, baseada nos parâmetros de entrada, a partir desta afirmação, julgue o item correto.
Memoization.

### É uma recursão onde não há nenhuma linha de código após a chamada do próprio método e, sendo assim, não há nenhum tipo de processamento a ser feito após a chamada recursiva, a partir desta afirmação, julgue o item correto.
Taill Call.

### Qual é a sintaxe base de uma lambda?
InterfaceFuncional nomeVariavel = parametro → logica

### Antes do Java 8, qual era a estratégia utilizada para implementação de interface em uma classe especifica.
Classe Anônima;

### Qual das alternativas a seguir e uma declaração de um lambda.
Funcao a = valor -> "2”;


### Quando devemos utilizar chaves em um lambda?
Quando o mesmo possui mais de uma instrução.


### E aquele que expressa o código através de comandos ao computador, nele é possível ter controle de estado dos objetos, de acordo com a afirmação. Qual alternativa representa esse paradigma:
Imperativo
### Qual o problema que pode ocorrer ao utilizar recursividade?
Estouro de pilha (StackOverFlow).


### Uma vez que uma variável que recebe um valor, esta vai possuir esse valor para sempre, ou quando criamos um objeto ele não pode ser modificado, de acordo com a afirmação. Qual alternativa representa esse paradigma?
Imutabilidade.

### Damos uma regra, uma declaração de como queremos que o programa se comporte, de acordo com a afirmação. Qual alternativa representa esse paradigma:Funcional.


## **_Interfaces funcionais_**
### São interfaces funcionais as que possuem:
Um método abstrato.


### Qual o nome do método utilizado para filtrar dados em um stream?
filter


### Qual o método utilizado para transformar dados em um stream?
map


### Marque a alternativa que apresenta a assinatura do método abstrato da Interface Function:
R apply(T t);

### Marque a alternativa que apresenta a assinatura do método abstrato da Interface Predicate:
boolean test(T t);

### Marque a alternativa que apresenta a assinatura do método abstrato da Interface Consumer:

void accept(T t);

### Qual a classe do Java 8 que dá suporte a listas, conjuntos, mapas e arrays?

Stream.

### O que é uma função de alta ordem ?
É uma função que retorna uma função ou que recebe uma função como parâmetro.


### Marque a alternativa que apresenta a assinatura do método abstrato da Interface Supplier:
T get()

### Qual o nome método utilizado para iterar dados em um stream que substitui o “for"?
forEach


## **_Processamento Assíncrono e Paralelo_**
### Qual a nova interface que foi incluída no pacote java.util.concurrent para uma thread conseguir executá-la (NOVA API)?
Callable.

### Qual o nome do método para saber se uma thread está dormindo/em repouso (API ANTIGA)?
sleep().

### Qual o nome da interface que deve ser implementada para a thread conseguir executá-la (API ANTIGA)?
Runnable.


### Qual o nome do método para executar uma thread (API ANTIGA)?
start().


### O que é uma Thread?
É um pequeno programa que trabalha como um subsistema.

### Qual o nome do método para saber se uma thread está em execução(API ANTIGA)?
isAlive().


### Assinale a alternativa que corresponde com a seguinte afirmação: “São todos os processamentos que ocorrem em sequência”
Processamento Síncrono.


### Assinale a alternativa que apresenta a forma correta de ter acesso a um parallel stream?
list().stream().parallel() //ArrayList


### Qual a implementação padrão da interface Future(NOVA API)?
FutureTask.


### Qual é o método que consegue saber se uma execução já foi finalizada dentro da interface Future (NOVA API)?
isDone().



## **_Por dentro da modularização do java_**

### Qual o nome do arquivo que gerencia as dependências do módulo?
module-info.java


### Eu criei um modulo com o nome “test.java” e dentro dele existe o pacote “java.test”. Considerando que eu quero exportar esse pacote apenas para o módulo “runner.java”, qual a linha de comando correspondente às informações?
exports java.test to runner.java;

### São benefícios da modularização:
Melhorar a organização e desempenho.


### A partir de qual versão começou o plano de modularizar a plataforma Java?
JDK 7.


### Qual a palavra chave utilizada para importar exportar um pacote do módulo?
exports.


### No arquivo de gerenciamento de dependências do module qual a palavra chave utilizada para declarar o módulo?
module

### Qual a palavra chave utilizada para importar um módulo:
requires.


### A seguir todos os módulos estão importados no módulo java.base, exceto:
java.sql


### O “Compact Profile” foi desenvolvido em qual versão do Java?
JDK 8.


### Em qual versão foi lançada a modularização no Java ?
JDK 9.


## **_Novidades do java 10_**

### A partir de qual versão a inferência foi introduzida na JDK?
JDK 10.


### O que irá acontecer no código a seguir?

public class InferenciaExemplo {
private var expoente = 2;
    public static void main(String[] args) {
        System.out.println(10*expoente);
    }
}
Erro de compilação, pois var só pode ser utilizado em variáveis locais.

### O que irá acontecer no código a seguir (desconsiderar importações e o método main)?

var nome;
System.out.println(nome);
Erro de compilação, pois o var tinha q ser inicializado.

### No comando “docker container run -it -m512M --entrypoint bash openjdk:10-jdk”, o que o “-m512M” significa?
memória limite do container

### João criou um método e precisa saber se ele vai funcionar pois o mesmo não te um computador para testar, você como já fez o curso de Java Avançado da Digital Innovation One pode ajudá-lo , então diga a ele o que irá acontecer no código a seguir(desconsiderar importações e o método main)?
public int somarNumeros(var numero1, var numero2){
return numero1+numero2;
}
Erro de compilação, não se pode utilizar var em assinatura de métodos.

### O que irá acontecer no código a seguir (desconsiderar importações e o método main)?

var nome = “Joao”;
System.out.println(nome);
Imprimirá o nome Joao.

### No comando “docker container run -it --cpus 2 openjdk:10-jdk” a flag “--cpus” significa:
Número de processadores disponíveis.


### O que irá acontecer no código a seguir (desconsiderar importações e o método main)?
```java
    private static void connectAndPrintURLJavaOracle()  {
       try {
           var url = new URL("https://docs.oracle.com/javase/10/language/");
           var urlConnection = url.openConnection();

           try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
               System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }
```
Funcionará sem problema.

### O que irá acontecer no código a seguir (desconsiderar importações e o método main)?
```java
public static void printarSoma(int... numeros) {
        int soma;
        if (numeros.length > 0) {
            soma = 0;
            for (var numero = 0; numero < numeros.length; numero++) {
                soma += numeros[numero];
            }

            System.out.println("A soma e ::: " + soma);
        }
    }
```
Funcionará sem problema algum.

### O que irá acontecer no código a seguir (desconsiderar importações e o método main)?
```java
Public void printHelloTimes(int times){
    var hello;
    hello = “Hello”;
    for(var i = 0; i < times ; i++){
 	    System.out.println(hello);
    }
}
```
Erro na linha 2, var sempre ser inicializado.

## **_Novidades do java 11_**
### Na nova API de Http Client, eu quero fazer uma requisição do tipo GET. E no endereço “https://digitalinnovation.one/”?
HttpRequest.newBuilder() .uri(URI.create("https://digitalinnovation.one/")) .GET() .build();

### Na nova API Http Client da JDK 11, qual a classe  que lida com as resposta das requisições? Exemplo: eu quero que o retorno da minha requisição venha como String.
BodyHandlers

### No código a seguir se eu quiser abstrair esta string em um stream de string separados pela quebra de linha qual o método que utilizaria na variável html ?

    public static void main(String[] args) {
        String html = "<html>\n<head>\n</head>\n <body> \n <body> \n<html>";
    }

html.lines()


### É uma novidade da JDK 11?
Nova API de Http Client.

### É novidade na JDK 11
Http Cliente API suportar Http/2

### É uma forma nova de instanciar um ArrayList no Java 11:
List.of(...).


### A seguir, qual seria a melhora opção para saber se a variável nome fosse nula, vazia, ou espaços em branco?
nome.isBlank().


### Qual dos métodos a seguir dispara a ação na classe HttpClient?
send

### Na JDK 11, qual o procedimento para repetir a string nome dez vezes do modo mais simples?
nome.repeat(10);


### O que irá acontecer no código a seguir (desconsiderar importações e o método main):

Function<Integer,Double> dividirPorDois  = (var numero) numero / 2.0;
System.out.println(dividirPorDois.apply(15));
Lançará um erro no momento de imprimir o valor.

