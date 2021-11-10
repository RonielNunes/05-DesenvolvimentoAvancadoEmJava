package digital.innovation.com.operacao.interno;

import digital.innovation.com.operacao.Operacao;

public class SumHelper implements Operacao {
    @Override
    public int execute(final int a,final int b) {
        return a + b;
    }
}
