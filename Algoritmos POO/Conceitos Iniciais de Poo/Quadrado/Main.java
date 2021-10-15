import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //Criando objetos
        Scanner entrada = new Scanner(System.in);
        Quadrado cerâmica = new Quadrado(27.5f);

        //Realizando testes
        System.out.println("O perímetro da cerâmica mede " + cerâmica.perimetro() + "cm");
        System.out.println("A área da cerâmica mede " + cerâmica.area() + "cm²");
        System.out.println("A cerâmica tem 4 lados de " + cerâmica.getLado() + "cm");

        System.out.print("Digite o valor do novo lado da cerâmica: ");
        float novoLado = entrada.nextFloat();
        entrada.close();

        cerâmica.setLado(novoLado);

        System.out.println("\nO perímetro da cerâmica mede " + cerâmica.perimetro() + "cm");
        System.out.println("A área da cerâmica mede " + cerâmica.area() + "cm²");
        System.out.println("A cerâmica tem 4 lados de " + cerâmica.getLado() + "cm");

    }
}