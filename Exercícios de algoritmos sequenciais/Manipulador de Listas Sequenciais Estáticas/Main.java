import java.util.Scanner;

public class Main {
    //Funções

    static void linha() {
        System.out.println("-------------------------");
    }

    static byte validaOpcao(byte num) {
        Scanner entrada = new Scanner(System.in);

        while (num < 1 || num > 7) {
            System.out.print("Valor inválido. Tente novamente: ");
            num = entrada.nextByte();
        }

        return num;

    }

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        //Programa Principal
        byte option = 0;
        do {

            //Menu
            System.out.println("Editor de Lista");
            linha();
            System.out.println(
                "1 - Exibir Lista"
                + "\n2 - Inserir"
                + "\n3 - Remover"
                + "\n4 - Exibir elemento"
                + "\n5 - Exibir posição"
                + "\n6 - Esvaziar Lista"
                + "\n7 - Sair"
            );
            System.out.print("\nDigite a sua opção: ");
            option = validaOpcao(entrada.nextByte()); 
            
            //Comando utilizado para corrigir um problema na inserção de um valor String quando um valor inteiro é lido antes.
            entrada.nextLine();

            linha();

            //Variável que será utilizada pela maioria das ações
            //Pode ser um elemento da lista; um novo valor a ser adicionado; uma posição de um elemento ou um valor correspondente a uma confirmação.
            String valor;

            //Ações
            switch (option) {

                //Sair do programa
                case 7:
                    break;
                
                //Exibir Lista
                case 1:
                    System.out.println("A lista contém {} elementos e esses são os seguintes: ");
                    break;

                //Inserir elemento
                case 2:
                    System.out.print("Digite o nome do elemento que você deseja adicionar: ");
                    valor = entrada.nextLine();
                    break;

                //Remover
                case 3:
                    System.out.print("Digite o nome do elemento que você deseja remover: ");
                    valor = entrada.nextLine();
                    break;

                //Exibir elemento
                case 4:
                    System.out.print("Insira a posição do elemento: ");
                    valor = entrada.nextLine();
                    break;

                //Exibir posição
                case 5:
                    System.out.print("Digite o nome do elemento que você deseja ver a posição: ");
                    valor = entrada.nextLine().toUpperCase();
                    break;

                //Esvaziar Lista
                case 6:
                    System.out.print("Você realmente deseja esvaziar a lista? Digite 'S' ou 'N': ");
                    valor = entrada.nextLine();

                    if (valor.equals("S")) {
                        System.out.println("Lista esvaziada com sucesso!");
                    }
                    else if (valor.equals("N")) {
                        System.out.println("A lista não foi esvaziada!");
                    }
                    else {
                        System.out.println("Valor inválido! A lista não foi esvaziada!");
                    }

                    break;
            }

            linha();

        } while (option != 7);

        System.out.println("Programa finalizado! :)");
        
        





    }
}