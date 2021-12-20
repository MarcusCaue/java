package questao_03;

import java.util.Scanner;
import questao_02.Data;

public class Main {

    public static void title(String titulo) {
        System.out.printf("\n===== %s =====\n", titulo);
    } 
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        //Inserção dos Dados
        title("Aeroporto João Montanhẽs");
        System.out.println("Insira abaixo as informações do vôo\n");

        System.out.print("Número do Vôo: ");
        int numVoo = entrada.nextInt(); entrada.nextLine();

        System.out.print("Data: ");
        String data = entrada.nextLine();
        Data dataVoo1 = new Data(data);

        //Validação do Vôo
        if (dataVoo1.getData().equals("01/01/0001")) {
            System.out.println("\nHum... Então você inseriu uma data inválida... \nSinto muito, o programa não pode prosseguir. Tente novamente! :/");
        }
        else {
            Voo voo1 = new Voo(numVoo, dataVoo1);

            System.out.println("\nInformações inseridas com sucesso! :)");
            System.out.println("=======================================");
            
            int opcao;

            //Ações do usuário
            boolean estadoPrograma = true;
            while (estadoPrograma) {

                title("Menu Inicial");
                System.out.println("\n1 - Verificar o número da cadeira vaga mais próxima\n2 - Verificar se a cadeira está ocupada\n3 - Ocupar uma cadeira\n4 - Consultar o número de cadeiras vagas\n5 - Consultar o número do Vôo\n6 - Consultar a data do Vôo\n7 - Consultar todas as informações do Vôo\n8 - Sair do programa\n");

                System.out.print("Digite a seguir o número que corresponde ao que você quer fazer: ");
                opcao = entrada.nextInt();

                switch (opcao) {
                    case 8:
                        title("Finalização do Programa");
                        System.out.println("Programa finalizado com sucesso!");
                        estadoPrograma = false;
                        break;

                    case 1:
                        title("Cadeira Vaga mais Próxima");
                        
                        int numCadeira = voo1.proximoLivre();
                        if (numCadeira == -1) {
                            System.out.println("Não há mais cadeiras vagas :(");
                        }
                        else {
                            System.out.println("A cadeira vaga mais próxima é identificada pelo número " + numCadeira);
                        }
                        
                        break;

                    case 2:
                        break;
                        
                    case 3:
                        break;
                        
                    case 4:
                        break;
                        
                    case 5:
                        break;
                        
                    case 6:
                        break;
                        
                    case 7:
                        break;
                        
                    default:
                        title("Erro");
                        System.out.println("Valor inválido. Tente novamente!");
                        break;
                }



            }
            


            

        }


        

    }    
}
