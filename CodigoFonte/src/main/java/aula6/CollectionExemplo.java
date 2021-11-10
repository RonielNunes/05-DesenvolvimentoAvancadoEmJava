package aula6;

import javax.print.CancelablePrintJob;
import java.util.*;

public class CollectionExemplo {

    public static void main(String[] args) {
        List<String> testes = new ArrayList<>();
        testes.add("1");
        testes.add("r3e");

        Collection<String> testes2 = Arrays.asList("Oi","Tudo","Bem","?");

        Collection<String> testes3 = List.of("Oi","Tudo","Bem","?");

        Collection<String> nomes = Set.of("Joao", "Paulo", "Oliveira", "Santos");

        System.out.println(testes);
        System.out.println(testes2);
        System.out.println(testes3);
        System.out.println(nomes);
    }
}
