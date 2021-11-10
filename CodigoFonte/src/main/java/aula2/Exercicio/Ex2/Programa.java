package aula2.Exercicio.Ex2;

import aula1.FuncaoComClasseAnonima;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa {
    public static void main(String[] args) {
        /*Interfaces funcionais já implemeantaddas*/

        //FUNCTION
        System.out.println("** FUNCTION **");
        //Tipo do parâmetro<entrada,saida>
        Function <Double,String> classificacaoIMC = (imc) -> {
            String msg = null;

            if(imc >=0 && imc < 18.5){
                msg = "Magreza";
            }else if(imc >= 18.5 && imc<=24.9){
                msg = "Saudável";
            }else if(imc >= 25.0 && imc <= 29.9){
                msg = "Obsidade Grau I";
            }else if(imc >= 30.0 && imc <=39.9){
                msg = "Obsidade Severa Grau II";
            }else if(imc > 40.0){
                msg = "Obsidade Mórbida Grau III";
            }else{
                msg = "Erro";
            }

            return msg;
        };
        Function <Pessoa,String> dadosPessoa = pessoa -> {return pessoa.toString();};
        Function <Forma,String> formaObjetos = forma -> {forma = new Forma(); return forma.toString();};
        Function <String, Forma> geradorForma = nome -> { return new Forma(nome);};

        System.out.println("Primeira forma de saída: " + classificacaoIMC.apply(20.0));
        System.out.println("Segunda forma de saída: " + Metodos.verificaSaude(classificacaoIMC,28.0)); //Classe que contem os métodos staticos
        System.out.println();
        System.out.println("Dados pessoa: " + dadosPessoa.apply(new Pessoa("Roni",23)) );
        Forma teste = null;
        System.out.println("Geometria espacial: " + formaObjetos.apply(teste)); //Somente exibe
        //assert teste != null;
        //System.out.println("Forma instanciada: " + teste.getNome());
        teste = geradorForma.apply("cilindro");
        System.out.println("Exibe: " + teste.getNome());
        System.out.println();

        //CONSUMERS
        System.out.println("**CONSUMERS**");
        //Trabalha com a entrada, e tem retorno void
        Consumer<String> maisculo = nome -> System.out.println("alterado: " + nome.toUpperCase());
        Consumer<String> exibe = System.out::println;
        maisculo.accept("leticia");
        exibe.accept("Ana");
        Metodos.exibeNome(maisculo,"Leticia");
        Metodos.exibeNome(exibe,"roni");
        System.out.println();

        //PREDICATE
        System.out.println("PREDICATE");
        //boolean <T t>;
        Predicate<String> verifica = nome -> nome.isEmpty();
        Predicate<String> verificaLetraA = nome -> { if(nome.contains("a")){return true;}else{return false;}};
        System.out.println(verifica.test(""));
        System.out.println(verifica.test("teste"));
        Metodos.saidaPredicate(verificaLetraA,"ANA");
        Metodos.saidaPredicate(verificaLetraA,"ana");
        System.out.println();

        //SUPPLIER
        //T get();, sem nenhuma entrada
        System.out.println("SUPPLIER");
        Supplier<Forma> instancia = ()-> new Forma();
        Supplier<Forma> instancia2 = Forma::new;
        System.out.println(instancia.get()); //Retorma o método toString
        Metodos.saidaSupplier(instancia2);

        //INTERATOR

        //Preenchendo as listas
        String[] frutas = {"abacate", "açai", "abacaxi", "Bacada", "Banana", "Uva", "Araticum", "Acerola", "limão"};

        Integer[] numeros = {1,2,4,6,3,123,43,6,8,21,34,5657,234,432,78,23,23454};

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);


        Metodos.exibeListaForFilter(frutas);
        System.out.println();

        Metodos.exibeListaStringFilter(frutas);
        System.out.println();

        Metodos.exibeListFor(frutas);
        System.out.println();

        Metodos.exibeListStream(frutas);
        System.out.println();

        Metodos.exibeOdobroFor(numeros);
        System.out.println();

        Metodos.exibeOdobroStream(numeros);

    }
}
