import java.util.Scanner;

public class Main {

    static int[] unir(int lista1[], int lista2[]) {
        int tamList1 = lista1.length;
        int tamList2 = lista2.length;

        int lista3[] = new int[tamList1 + tamList2];

        for (int i = 0; i < tamList1; i++) {
            lista3[i] = lista1[i];
        }

        for (int i = 0; i < tamList2; i++) {
            lista3[tamList1 + i] = lista2[i];
        }

        return lista3;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamLista;

        System.out.print("Quantidade de elementos da 1° lista: ");
        tamLista = entrada.nextInt();

        if (tamLista <= 0) {
            System.out.println("ERRO - A lista deve ter pelo menos 1 elemento.");
        }
        else {
            int lista1[] = new int[tamLista];

            for (int j = 0; j < tamLista; j++) {
                lista1[j] = entrada.nextInt();
            }

            System.out.print("Quantidade de elementos da 2° lista: ");
            tamLista = entrada.nextInt();

            if (tamLista <= 0) {
                System.out.println("ERRO - A lista deve ter pelo menos 1 elemento.");
            }
            else {
                int lista2[] = new int[tamLista];
    
                for (int j = 0; j < tamLista; j++) {
                    lista2[j] = entrada.nextInt();
                }

                int lista3[] = unir(lista1, lista2);

                System.out.println(lista3);
            }
        }
    
        
    }
}
