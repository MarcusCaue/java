package operacoes;

public class Multiplicacao extends OperacaoMatematica {

    public Multiplicacao(double conjuntoValores[]) {
        this.numeros = conjuntoValores;
    }

    public double calcula() {
        double resultado = 1;

        for (byte i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];
        }
        
        return resultado;
    }
    
}
