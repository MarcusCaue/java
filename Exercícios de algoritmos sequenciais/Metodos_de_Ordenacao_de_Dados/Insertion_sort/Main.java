import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Lista a ser ordenada
        int numbers[] = {42, 58, 63, 9, 12};

        //Laço externo
        for (int i = 1; i < numbers.length; i++) {

            //Valor que será comparado com os seus antecessores
            int ni = numbers[i];

            //Laço interno
            for (int j = i - 1; j > -1; j--) {

                //Valor do laço interno que será comparado com o "ni"
                int nj = numbers[j];

                if (ni < nj) {
                    /**
                     * Caso ni < nj, então eles trocam de posição
                     */
                    numbers[j] = ni;
                    numbers[j + 1] = nj;
                }
                else {
                    /**
                     * Caso contrário, ni não precisa ser comparado com os valores restantes
                     */
                    break;
                }          
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}