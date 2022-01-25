/**
 * Resolução do exercício "BEE 1024" da plataforma beecrowd.com.br que pede uma criptografia simples de 3 etapas.
 *
 * Segue o enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1024 
 * 
*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("");
        int quantCasosTeste = entrada.nextInt(); entrada.nextLine();

        for (int i = 0; i < quantCasosTeste; i++) {
            System.out.print("");
            String fraseOriginal = entrada.nextLine();

            char letras[];

            // Conversão Fase 1
            byte codeASCII; String fase1 = "";
            letras = fraseOriginal.toCharArray();
            for (char letra : letras) {
                codeASCII = (byte) letra;

                // Validador de letras eficaz
                if ((codeASCII >= 65 && codeASCII <= 90) || (codeASCII >= 97 && codeASCII <= 122)) {
                    char caracter3CasasDepois = (char) (codeASCII + 3);
                    fase1 += caracter3CasasDepois;
                } else {
                    fase1 += letra;
                }
            }

            // Conversão Fase 2
            String fase2 = "";
            letras = fase1.toCharArray();
            for (int j = fase1.length() - 1; j > -1; j--) {
                fase2 += letras[j];
            }

            // Conversão Fase 3
            String letrasMetade1 = fase2.substring(0, (fase2.length() / 2));
            char[] letrasMetade2 = fase2.substring((fase2.length() / 2)).toCharArray();

            String fase3 = letrasMetade1;

            for (char letra : letrasMetade2) {
                codeASCII = (byte) letra;
                char caracterAntecessor = (char) (codeASCII - 1);
                fase3 += caracterAntecessor;
            }

            System.out.println(fase3);
        }

    }
}