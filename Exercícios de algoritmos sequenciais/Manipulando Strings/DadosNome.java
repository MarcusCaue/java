import java.util.Scanner;

public class DadosNome {
    static int encontre(String palavra, String caracter) {
        if (palavra.isEmpty()) {
            return -1;
        }
        else {
            for (int i = 0; i < palavra.length(); i++) {
                String c = palavra.charAt(i);







                if (palavra.charAt(i) == caracter) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        String nome = entrada.nextLine().trim();        

        if (nome.isEmpty() || encontre(nome, "\n") == -1) {
            System.out.println("Jonas");
        }


        //String primeiroNome = nome.substring(0, nome.indexOf(" "));

        /*/int quantLetras = 0;

        String caracter;
        for (int i = 0; i < nome.length(); i++) {

            caracter = nome.substring(i, i+1);
            if (! caracter.equals(" ")) {
                quantLetras++;
            }
        }

        System.out.println("O nome completo em letras MAIÚSCULAS: " + nome.toUpperCase());
        System.out.println("O nome completo em letras minúsculas: " + nome.toLowerCase());
        System.out.println("O primeiro nome tem " + primeiroNome.length() + " letras");
        System.out.println("O nome possui " + quantLetras + " letras ao todo.");/*/

    }
}