import java.util.Scanner;

public class Main {

    static int calcularNivel(int velocidades[]) {
        int maiorVelocidade = velocidades[0];

        for (int i = 1; i < velocidades.length; i++) {
            if (velocidades[i] > maiorVelocidade) {
                maiorVelocidade = velocidades[i];
            }
        }

        if (maiorVelocidade < 10) {
            return 1;
        }
        else if (maiorVelocidade >= 20) {
            return 3;
        }
        else {
            return 2;
        }

    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de lesmas: ");
        int quantLesmas = entrada.nextInt();

        int grupoDeLesmas[] = new int[quantLesmas];

        System.out.println("Lista de velocidades: ");
        for (int i = 0; i < quantLesmas; i++) {
            grupoDeLesmas[i] = entrada.nextInt();
        }

        entrada.close();

        System.out.println("Nível da lesma mais veloz: " + calcularNivel(grupoDeLesmas));
    }
}