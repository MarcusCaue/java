package operacoes;

public class Soma extends OperacaoMatematica {

    public Soma(double conjuntoValores[]) {
        this.numeros = conjuntoValores;
    }

    public double calcula() {
        double resultado = 0;

        for (byte i = 0; i < numeros.length; i++) {
            resultado += numeros[i];
        }
        
        return resultado;
    }
}