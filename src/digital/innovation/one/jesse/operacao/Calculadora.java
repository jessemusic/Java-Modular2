package digital.innovation.one.jesse.operacao;

import digital.innovation.one.jesse.operacao.internal.DivHelper;
import digital.innovation.one.jesse.operacao.internal.MultHelper;
import digital.innovation.one.jesse.operacao.internal.SubHelper;
import digital.innovation.one.jesse.operacao.internal.SumHelper;

public class Calculadora {

    private SubHelper subHelper;
    private SumHelper sumHelper;
    private DivHelper divHelper;
    private MultHelper multHelper;

    public Calculadora(){
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        divHelper = new DivHelper();
        multHelper = new MultHelper();
    }
    public int sum(int a, int b){
        return sumHelper.execute( a,b );
    }

    public int sub(int a, int b){
        return subHelper.execute( a,b );
    }

    public int mult(int a, int b){
        return multHelper.execute( a,b );

    }public int div(int a, int b){
        return divHelper.execute( a,b );
    }
}
