package aula1;

public class Aula {
    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
            return valor;
        };
        System.out.println(funcao1.gerar("Rô"));

        Funcao2 funcao2 =(x,y) -> {
            int soma = x + y; return soma;
        };
        System.out.println(funcao2.soma(1,3));

        Funcao3 funcao3 = ((nome, sobrenome) -> {
            System.out.println("Seu nome é: " + nome + " " + sobrenome);
        });

        funcao3.parametros("Rô","Capry");
    }
}



interface Funcao1 {
    String gerar(String valor);
}

interface Funcao2{
    Integer soma(int x,int y);
}

interface Funcao3{
    void parametros(String nome,String sobrenome);
}