package digital.innovation.com.operacao;

import digital.innovation.com.operacao.interno.DivHelper;
import digital.innovation.com.operacao.interno.MultHelper;
import digital.innovation.com.operacao.interno.SubHelper;
import digital.innovation.com.operacao.interno.SumHelper;

public class Calculadora {

    private DivHelper divHelpe;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        divHelpe = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum(final int a, final int b){
        return sumHelper.execute(a,b);
    }

    public int div(final int a, final int b){
        return divHelpe.execute(a,b);
    }

    public int mult(final int a, final int b){
        return multHelper.execute(a,b);
    }

    public int sub(final int a, final int b){
        return subHelper.execute(a,b);
    }

}
