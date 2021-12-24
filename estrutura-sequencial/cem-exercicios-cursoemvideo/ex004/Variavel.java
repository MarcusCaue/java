public class Variavel {
    private String valor;

    public Variavel(String novoValor) {
        this.valor = novoValor;
    };

    //Tipo da variável
    public String tipo() {
        String msg = valor.getClass().getSimpleName();
        return msg;
    }

    //Somente espaços
    public boolean isSpace() {
        boolean resultado = valor.isEmpty();
        return resultado;
    }

    /**
     * boolean resultado;
        return resultado;
     */
}
