package digital.innovation.one.jesse.operacao.internal;

import digital.innovation.one.jesse.operacao.operacao;

public class SubHelper implements operacao {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
