import java.util.Scanner;

public class Main {
    //Funções

    //Mostra uma linha na tela
    static void linha() {
        for (int i = 0; i < 70; i++) {
            System.out.print("-");
        }

        System.out.println();
    }

    //Função para validar a escolha do usuário em relação a uma das opções do menu  
    static byte validaOpcao(byte num) {
        Scanner entrada = new Scanner(System.in);

        while (num < 1 || num > 7) {
            System.out.print("Valor inválido. Tente novamente: ");
            num = entrada.nextByte();
        }

        entrada.close();

        return num;
    }

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        //Programa Principal
        byte option = 0;

        //Criando um objeto do tipo lista sequencial estática
        ListaSeq myList = new ListaSeq();

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

            //Variáveis que serão utilizadas por algumas ações

            //Pode ser um elemento da lista; um novo valor a ser adicionado; uma posição de um elemento ou um valor correspondente a uma confirmação.
            String valor;
            
            //Posição de algum elemento da lista
            int pos;
            
            //Ações
            switch (option) {

                //Sair do programa
                case 7:
                    break;
                
                //Exibir Lista
                case 1:
                    System.out.printf("A lista contém %d elementos e esses são os seguintes: ", myList.tamanho());
                    myList.exibir();
                    break;

                //Inserir elemento
                case 2:
                    System.out.print("Digite o nome do elemento que você deseja adicionar: ");
                    valor = entrada.nextLine();

                    if (myList.inserir(valor)) {
                        System.out.println("Valor adicionado com sucesso!");
                    }
                    else {
                        System.out.println("Lista cheia, não podes adicionar mais valores!");
                    }

                    break;

                //Remover
                case 3:
                    System.out.print("Digite o nome do elemento que você deseja remover: ");
                    valor = entrada.nextLine();

                    if (myList.remover(valor)) {
                        System.out.println("O elemento foi removido com sucesso!");
                    }
                    else {
                        System.out.println("Esse elemento não está presente na lista!");
                    }

                    break;

                //Exibir elemento
                case 4:
                    System.out.print("Insira a posição do elemento: ");
                    pos = entrada.nextInt();

                    valor = myList.busca(pos);

                    if (valor == null) {
                        System.out.println("A posição que você inseriu é inválida!");
                    }
                    else {
                        System.out.println("Elemento encontrado -> " + valor);
                    }

                    break;

                //Exibir posição
                case 5:
                    System.out.print("Digite o nome do elemento que você deseja ver a posição: ");
                    valor = entrada.nextLine();

                    pos = myList.busca(valor);

                    if (pos == -1) {
                        System.out.println("O elemento não está presente na lista!");
                    }
                    else {
                        System.out.println("Posição do elemento: " + pos);
                    }

                    break;

                //Esvaziar Lista
                case 6:
                    System.out.print("Você realmente deseja esvaziar a lista? Digite 'S' ou 'N': ");
                    valor = entrada.nextLine();

                    if (valor.equals("S")) {
                        myList.limpar();                       
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

        entrada.close();

        System.out.println("Programa finalizado! :)");
    }
}