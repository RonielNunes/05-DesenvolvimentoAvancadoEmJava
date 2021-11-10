package aula2.Exercicio.Ex2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Metodos {
    public static String verificaSaude(final Function classificacaoIMC, final double peso){
        return (String) classificacaoIMC.apply(peso);
    }
    public static void exibeNome(final Consumer consumer, final String nome){
        consumer.accept(nome);
    }
    public static void saidaPredicate(final Predicate predicate, final String nome){
        System.out.println(predicate.test(nome));
    }
    public static void saidaSupplier(final Supplier supplier){
        System.out.println(supplier.get());
    }

    public static void exibeListaForFilter(String... nomes){
        String saida = "";
        for (int i = 0; i < nomes.length; i++){
            if(nomes[i].contains("a")){
                saida +=nomes[i];
                saida +=" ";
            }
        }
        System.out.println(saida);
    }

    public static void exibeListaStringFilter(String... nomes){
        System.out.println(Stream.of(nomes).filter(nome -> nome.contains("a")).collect(Collectors.joining()));
    }

    public static void exibeListFor(String... nomes){
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }

    public static  void exibeListStream(String... nomes){
        //Stream.of(nomes).forEach(nome -> System.out.println("Nome: " + nome));
        Stream.of(nomes).forEach(System.out::println);
    }
    public static void exibeOdobroFor(Integer... numeros){
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] * 2);
        }
    }
    public static void exibeOdobroStream(Integer... numeros){
        Stream.of(numeros).map(numero ->numero *2).forEach(System.out::println);
    }
}
