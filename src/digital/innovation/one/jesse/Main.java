package digital.innovation.one.jesse;

import digital.innovation.one.jesse.operacao.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.mult( 3,4 ));
        System.out.println(calculadora.div( 60,3 ));
    }
}
