import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Lista a ser ordenada
        int numbers[] = {1, 86, 59, 92, 21, 13, 20, 38};
        
        //Loop externo
        for (int i = 0; i < numbers.length - 1; i++) {
            //Escolho um valor na posição i que vai ser comparado com os outros valores da lista para descobrir alguém que seja menor que ele.
            int ni = numbers[i];
            int posMenor = i;

            //Loop interno
            for (int j = i + 1; j < numbers.length; j++) {

                //Valor que será comparado com ni
                int nj = numbers[j];

                if (nj > ni) {
                    /**
                     * Caso nj < ni, então nj é considerado como o menor da lista e será comparado com os valores restantes da lista.
                     * Sua posição na lista também é armazenada.
                     */
                    ni = nj;
                    posMenor = j;
                }
            }

            //Momento da troca de posição entre o valor que foi analisado inicialmente com o menor valor encontrado
            numbers[posMenor] = numbers[i];
            numbers[i] = ni;
        }

        System.out.println(Arrays.toString(numbers));
    }
}