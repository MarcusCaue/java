package Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe uma data: ");
        String data = entrada.nextLine();

        Data d1 = new Data(data);

        System.out.println("\nDia: " + d1.getDia());
        System.out.println("Mês: " + d1.getMes());
        System.out.println("Mês por extenso: " + d1.getMesExtenso());
        System.out.println("Ano: " + d1.getAno());

        System.out.println("\nReferência do objeto clone: " + d1.clone());

        /*/System.out.print("\nInforme uma outra data: ");
        data = entrada.nextLine();

        Data d2 = new Data(data);

        System.out.print("Comparando a primeira data  com a segunda, o resultado é que: ");

        int comparacao = d1.compara(d2);

        if (comparacao == 0) {
            System.out.println("as datas iguais");
        }
        else if (comparacao == 1) {
            System.out.println("a primeira data é maior do que a segunda");
        }
        else {
            System.out.println("a segunda data é maior do que a primeira");
        }/*/

        if (d1.isBissexto()) {
            System.out.println("A data faz parte de um ano bissexto!");
        }
        else {
            System.out.println("A data não faz parte de um ano bissexto");
        }
        
        
    }
}
