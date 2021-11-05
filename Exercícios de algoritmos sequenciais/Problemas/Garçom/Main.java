import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de bandejas: ");
        byte bandejas = entrada.nextByte();

        byte latas, copos, coposQuebrados = 0;
        for (byte i = 0; i < bandejas; i++) {
            System.out.print("Quantidade de latas: ");
            latas = entrada.nextByte();

            System.out.print("Quantidade de copos: ");
            copos = entrada.nextByte();

            if (latas > copos) {
                coposQuebrados += copos;
            }
        }

        entrada.close();

        System.out.println("Quantidade de copos quebrados: " + coposQuebrados);

    }

}