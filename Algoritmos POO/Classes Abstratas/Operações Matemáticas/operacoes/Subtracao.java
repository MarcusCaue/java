package operacoes;

public class Subtracao extends OperacaoMatematica {

    public Subtracao(double conjuntoValores[]) {
        this.numeros = conjuntoValores;
    }

    public double calcula() {
        double resultado = numeros[0];

        for (byte i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        
        return resultado;
    }
    
}
