import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Leitura dos dados
        System.out.print("Insira uma data no formato (dd/mm/aaaa): ");
        String data1 = entrada.nextLine();

        System.out.print("Insira outra data agora: ");
        String data2 = entrada.nextLine();

        //Instanciando objetos
        Data d1 = new Data(data1);
        Data d2 = new Data(data2);

        /*Implementando os métodos*/
        
        //Retornando o valor das datas no formato (dd/mm/aaaa)
        System.out.println("\nPrimeira data no formato (dd/mm/aaaa): " + d1.getData());
        System.out.println("Segunda data no formato (dd/mm/aaaa): " + d2.getData());

        //Modificando o valor das datas
        System.out.print("\nInsira uma nova data no formato (dd/mm/aaaa): ");
        data1 = entrada.nextLine();

        System.out.print("Faça isso de novo: ");
        data2 = entrada.nextLine();

        d1.setData(data1);
        d2.setData(data2);

        entrada.close();

        //Retornando o valor das datas por extenso
        System.out.println("\nPrimeira data por extenso: " + d1.toString());
        System.out.println("Segunda data por extenso: " + d2.toString());

        //Comparando os valores das datas
        if (d1.equals(d1, d2)) {
            System.out.println("\nAs datas são iguais!");
        } else {
            System.out.println("\nAs datas NÃO são iguais.");
        }

    }
}