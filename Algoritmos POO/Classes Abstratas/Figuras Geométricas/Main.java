import formas_geometricas.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Descobrindo o tipo de terreno
        System.out.print("Qual é o formato do seu terreno? ");
        String tipoTerreno = entrada.nextLine();


        /*Lendo as informações do terreno*/

        //Quando for um quadrado ou um losango
        if (tipoTerreno.equals("Quadrado") || tipoTerreno.equals("Losango")) {
            System.out.print("Informe o valor de um dos lados do Quadrilátero: ");
            float lado = entrada.nextFloat();

            /*Criando o objeto*/

            //Objeto Losango
            if (tipoTerreno.equals("Losango")) {
                
                Losango los = new Losango(lado);

                System.out.printf("\nO Losango possui 4 lados iguais de %.2fm\n", los.getLado());
                System.out.printf("O perímetro desse Losango é de %.2fm\n", los.perimetro());
                System.out.printf("A área desse Losango é de %.2fm²\n", los.area());
            }

            //Objeto Quadrado
            else {

                Quadrado q1 = new Quadrado(lado);

                System.out.printf("\nO Quadrado possui 4 lados iguais de %.2fm\n", q1.getLado());
                System.out.printf("O perímetro desse quadrado é de %.2fm\n", q1.perimetro());
                System.out.printf("A área desse quadrado é de %.2fm²\n", q1.area());
            }
        }


        //Quando for um triângulo
        else if (tipoTerreno.equals("Triangulo")) {
            
            float ladosTriangulo[] = new float[3];
            for (int i = 0; i < 3; i++) {
                System.out.printf("Informe o valor do %dº lado: ", i + 1);
                ladosTriangulo[i] = entrada.nextFloat();
            }

            /*Criando o objeto*/
            Triangulo t1 = new Triangulo(ladosTriangulo);

            System.out.println("\nO triângulo possui 3 lados, em que: ");
            for (int i = 0; i < 3; i++) {
                System.out.printf("O %dº mede %.2fm\n", i + 1, t1.getLados(i));
            }

            System.out.printf("O perímetro desse triângulo mede %.2fm\n", t1.perimetro());
            System.out.printf("A área desse triângulo mede %.2fm²\n", t1.area());

        }

       
        //Quando for um círculo
        else if (tipoTerreno.equals("Circulo")) {
            System.out.print("Informe o valor do raio do círculo: ");
            float raio = entrada.nextFloat();

            /*Criando o objeto*/
            Circulo c1 = new Circulo(raio);
            
            System.out.printf("\nO círculo tem um raio de %.2fm\n", c1.getRaio());
            System.out.printf("A circunferência do círculo mede %.2fm\n", c1.perimetro());
            System.out.printf("A área do círculo mede %.2fm²\n", c1.area());
        }

        entrada.close();
    }
}