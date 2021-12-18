import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaração de variáveis
        float comp, altura;
        char option;

        //Criando os objetos
        Scanner entrada = new Scanner(System.in);
        Retangulo espaco = new Retangulo(0, 0);

        //Entrada dos dados
        System.out.println("===== Material de Construção Jonas Madereiro =====");
        
        do {
            System.out.print("\nComprimento (m): ");
            comp = entrada.nextFloat();

            System.out.print("Altura (m): ");
            altura = entrada.nextFloat();

            //Alterando os dados do objeto
            espaco.setComprimento(comp);
            espaco.setAltura(altura);
            
            //Processamento e Saída
            System.out.printf("\nA área de um espaço com essas medidas é de %.2fm². Dessa forma, você terá que comprar %.0f pisos para cobrir o espaço.\n", espaco.area(), espaco.area());
            System.out.printf("O perímetro desse espaço mede %.2fm. Portanto, você terá que comprar %.0f rodapés para contorná-lo.\n", espaco.perimetro(), espaco.perimetro());

            entrada.nextLine();
            System.out.print("\nQuer continuar [S/N]? ");
            option = entrada.nextLine().toUpperCase().charAt(0);

        } while (option == 'S');

        entrada.close();
        
    }
    
}
