package aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
      Calculo soma =  ( a, b) -> a+b;
        System.out.println(executarOperacao(soma,1,3));
    }



    public static int executarOperacao(final Calculo calculo,final int a,final int b){
        return calculo.calcular(a,b);
    }
}


@FunctionalInterface
interface Calculo {
    public int calcular(final int a,final int b);
}