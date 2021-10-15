import classes.*; import java.util.Scanner;

public class Main {

    public static void exibeInformacao(byte acao, Funcionario objeto1, Funcionario objeto2) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("\nAgora escolha qual funcionário:\n   1 - %s\n   2 - %s\nDigite aqui a sua opção: ", objeto1.getNome(), objeto2.getNome());
        byte option = entrada.nextByte();

        if (option > 2 || option < 1) {
            mensagemValorInvalido();
        }
        else {
            if (acao == 1) {
                if (option == 1) {
                    System.out.printf("\nNome do Funcionário: %s\nSalário: R$%,.2f\n", objeto1.getNome(), objeto1.getSalario());
                }
                else {
                    System.out.printf("\nNome do Funcionário: %s\nSalário: R$%,.2f\n", objeto2.getNome(), objeto2.getSalario());
                }
            }
            else {
                if (option == 1) {
                    objeto1.aumentaSalario();

                    System.out.printf("\nSalário de %s aumentado em 20%%!\nValor atual do salário: R$%,.2f\n", objeto1.getNome(), objeto1.getSalario());
                }
                else {
                    objeto2.aumentaSalario(); 

                    System.out.printf("\nSalário de %s aumentado em 10%%!\nValor atual do salário: R$%,.2f\n", objeto2.getNome(), objeto2.getSalario()); 
                }
            }
        }
        entrada.close();
    }

    static void mensagemValorInvalido() {System.out.println("\nValor inválido parça! :/");}

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        Funcionario marcus = new Programador("Marcus Cauê", 1000);
        Funcionario ricardo = new Gerente("Ricardo", 10000);

        System.out.print("Escolha uma opção\n   1 - Imprimir os dados de algum funcionário\n   2 - Aumentar o salário de algum funcionário.\nDigite aqui a sua opção: ");
        byte option = entrada.nextByte();

        if (option > 2 || option < 1) {
            mensagemValorInvalido();
        }
        else {
            exibeInformacao(option, marcus, ricardo);
        }

        entrada.close();  
    }
}