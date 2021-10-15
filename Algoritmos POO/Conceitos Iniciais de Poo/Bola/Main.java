import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da cor da bola: ");
        String cor = entrada.nextLine();

        System.out.print("Informe o valor da circunferência da bola: ");
        float circunferencia = entrada.nextFloat(); entrada.nextLine();

        System.out.print("Informe o material do qual a bola é feita: ");
        String material = entrada.nextLine(); 
        
        Bola futebol = new Bola(cor, circunferencia, material);

        System.out.printf("A bola mede %.0fcm de circunferência.\n", futebol.circunferencia);
        System.out.printf("A bola é feita de %s\n", futebol.material);
        System.out.printf("A bola é da cor %s\n", futebol.mostraCor());

        System.out.println("\nDigite agora a nova cor da bola: ");
        futebol.trocaCor(entrada.nextLine()); entrada.close();
        System.out.printf("A bola é da cor %s\n", futebol.mostraCor());
    }
}
