import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //Criando objetos
        Scanner entrada = new Scanner(System.in);
        Cidade campinaGrande = new Cidade(411807, 591.658);

        //Testes
        System.out.println("A cidade mede " + campinaGrande.getArea() + "km²");
        System.out.printf("Existem %,d pessoas morando na cidade\n", campinaGrande.getPessoas());
        System.out.printf("A densidade demográfica da cidade é de %.2f pessoas por km²\n", campinaGrande.densidadeDemografica());

        //Alterando os atributos
        System.out.print("\nDigite a quantidade de habitantes da cidade: ");
        int pessoas = entrada.nextInt();
        campinaGrande.setPessoas(pessoas);

        System.out.print("Digite o tamanho da cidade em km²: ");
        double area = entrada.nextDouble();
        campinaGrande.setArea(area);

        entrada.close();

        //Nova saída
        System.out.println("A cidade mede " + campinaGrande.getArea() + "km²");
        System.out.printf("Existem %,d pessoas morando na cidade\n", campinaGrande.getPessoas());
        System.out.printf("A densidade demográfica da cidade é de %.2f pessoas por km²\n", campinaGrande.densidadeDemografica());
    }
    
}
