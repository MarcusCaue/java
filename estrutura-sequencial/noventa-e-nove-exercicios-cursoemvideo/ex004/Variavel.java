public class Variavel {
    private String valor;

    public Variavel(String novoValor) {
        this.valor = novoValor;
    }

    //Tipo da variável
    public String tipo() {
        String msg = valor.getClass().getSimpleName();
        return msg;
    }

    //Somente espaços
    public boolean isSpace() {
        boolean resultado = valor.isBlank();
        return resultado;
    }

    //Se está em Upper Case
    public boolean tudoMaiusculo() {

        if (isSpace()) {
            return false;
        }

        if (valor.equals(valor.toUpperCase())) {
            return true;
        }

        return false;
    }

    //Se está em Lower Case
    public boolean tudoMinusculo() {

        if (isSpace()) {
            return false;
        }

        if (valor.equals(valor.toLowerCase())) {
            return true;
        }

        return false;
    }

    //Se está em formato de título
    public boolean isTitle() {

        if (isSpace()) {
            return false;
        }

        String[] partesString = valor.split(" ");

        for (String pedaco : partesString) {

            //Primeiro caracter do 'pedaco'
            String firstCaracter = pedaco.substring(0, 1);

            //Primeiro caracter do 'pedaco' em maísculo
            String firstCaracterUpperCase = pedaco.substring(0, 1).toUpperCase();
            
            if (! firstCaracter.equals(firstCaracterUpperCase)) {
                return false;
            }
        }

        return true;
    }

    //Se é um número real
    public boolean isNumeric() {

        if (isSpace()) {
            return false;
        }

        /* Para saber se a variável é um número real, irei convertê-lo para Double porque  este tipo abrange os números racionais, consequentemente ele abrange os números inteiros também. Logo, se o programa conseguir converter a variável para Double, então essa variável pode ser um inteiro também */
        try {
            //Se a variável for um número decimal e se a sua parte decimal vier após uma vírgula e não por um ponto, então vou trocar a vírgula por um ponto.
            valor = valor.replace(",", ".");

            double num = Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            //Se ele não conseguiu converter para Double, então a variável não é um número
            return false;
        }

    }

    //Se é alfanumérico
    public boolean isAlphaNum() {

        if (isSpace() || isAlpha() || isNumeric()) {
            return false;
        }

        //Vou pegar a nossa variável e irei criar um array de caracteres que vai armazenar cada um dos caracteres de nossa variável para verificar se ela é um valor alfanumérico
        char[] caracteres = valor.toCharArray();

        //Vou pegar cada um desses caracteres e vou comparar com alguns símbolos e sinais de pontuação.
        char[] simbolosSinais = {'-', ' ', '@', '!', '+', '=', '(', ')', '#', '$', '%', '}', '{', 'º', '?', '/', ';', '\\', '\'', '\"'};

        //Caso algum desses caracteres for igual a um desses símbolos e sinais, então o método retorna 'false'.
        for (char c : caracteres) {
            for (char s : simbolosSinais) {
                if (c == s) {
                    return false;
                }
            }
        } 

        return true;
    }

    //Se é alfabético, isto é, composta somente por letras
    public boolean isAlpha() {
        // Criando um array de caracteres contendo cada caracter da varíavel
        // Cria-se um array de caracteres não alfabéticos (somente alguns) para que cada caracter da variável seja comparada com cada um desses caracteres.
        char[] letras = valor.toCharArray();
        char[] caracters = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '#', '$', '%', '&', '*', '@', '?' };

        // Comparando cada caracter da variável com os caracteres do array "caracters"
        for (char l : letras) {
            for (char c :  caracters) {
                if (l == c) {
                    //Caso algum caracter da variável for igual a algum caracter não alfabático, então a nossa variável não é alfabética
                    return false;
                }
            }
        }

        return true;

    }
}
