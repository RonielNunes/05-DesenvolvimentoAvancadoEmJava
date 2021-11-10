package aula2.Exercicio.Ex1;

public class FuncaoAltaOrdem2 {
    public static void main(String[] args) {
        Calculo2 Soma = (a,b) -> a + b;
        Calculo2 Sub = (a,b) -> a - b;
        Calculo2 div = (a,b) -> a / b;
        Calculo2 Multi = (a,b) -> a * b;

        System.out.println(Soma.calcular(1.0,2.0));
        System.out.println(Sub.calcular(1.0,2.0));
        System.out.println(div.calcular(1.0,2.0));
        System.out.println(Multi.calcular(1.0,2.0));

        //Executando ação
        System.out.println("Executando ações ");
        executar(Soma,2,3); //aqui está retornando mas para ficar de fácil visualização coloquei o exibir no seu interior
        executar(div,3,4);
        executar(Sub,1,5);
        executar(Multi,3,5);

    }
    public static double executar(final Calculo2 acao,final double a, final double b ){
        System.out.println(acao.calcular(a,b));
        return acao.calcular(a,b);
    }
}

@FunctionalInterface
interface Calculo2{
    Double calcular(final double a, final double b);
}