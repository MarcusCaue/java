import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Lendo os atributos do objeto
        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Peso em kg: ");
        float peso = entrada.nextFloat();

        //Criando objeto
        Pessoa marcusCaue = new Pessoa(nome, idade, peso, altura);

        //Alterando atributos
        System.out.print("\nQuantos anos se passaram desde a última vez que você informou a idade? ");
        idade = entrada.nextInt();

        double tamanho;
        double idadeFloat = idade;

        if (marcusCaue.idade < 21) {
            tamanho = 0.05 * idadeFloat;
        }
        else {
            tamanho = 0.02 * idadeFloat;
        }

        marcusCaue.crescer(tamanho);

        marcusCaue.envelhecer(idade);
        
        System.out.println("\nA pessoa ganhou ou perdeu massa? \nObs: Responda com 'G' ou 'P': ");
        char situacao = entrada.next().toUpperCase().charAt(0);

        if (situacao != 'G' && situacao != 'P') {
            System.out.println("Valor inválido! :/");
        }
        else {
            if (situacao == 'P') {
                System.out.print("A pessoa perdeu quantos kg de masssa? ");
                peso = entrada.nextFloat();

                marcusCaue.emagrecer(peso);
            }
            else {
                System.out.print("A pessoa ganhou quantos kg de masssa? ");
                peso = entrada.nextFloat();

                marcusCaue.engordar(peso);
            }
        } 

        entrada.close();

        System.out.printf("\nA pessoa agora tem %d anos de idade", marcusCaue.idade);
        System.out.printf("\nA pessoa pesa agora %.1fkg\n", marcusCaue.peso);
        System.out.printf("\nA pessoa agora mede %.2fm de altura\n", marcusCaue.altura);
    }   
}
