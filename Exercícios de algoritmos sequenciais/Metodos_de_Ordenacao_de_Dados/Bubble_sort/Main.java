import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * Obs.: Os elementos vão ser ordenados em ordem crescente.
         */
        
        //Lista a ser ordenada
        int[] numbers = {1, 86, 59, 92, 21, 13, 20, 38};

        //Valor inicial atribuído para o fim do loop interno
        int tamJ = numbers.length;

        //Loop externo
        for (int i = 0; i < numbers.length; i++) {
            
            int ni = numbers[0]; //Valor que será comparado com os outros a seguir
            int posNi = 0; //A posição desse valor na lista

            //Loop interno
            for (int j = 1; j < tamJ; j++) {

                //Valor que está a direita de n1 e que será comparado com o mesmo 
                int nj = numbers[j];

                /**
                 * Caso nj for menor que ni, então ambos trocam de posição.
                 * Dessa forma, a posição de ni será a que nj tinha.
                 * A partir daí, ni continua a ser comparado com os outros valores da lista.
                */
                if (nj < ni) {
                    numbers[posNi] = nj;
                    numbers[j] = ni;
                    posNi++;
                }

                /**
                 * Porém, se nj for maior que ni, então ele passará a ser o ni agora.
                 * A partir daí, esse novo ni vai ser comparado com os outros valores da lista.
                 * Consequentemente, posNi vai ser a posição que nj tinha também.
                */
                else {
                    ni = nj;
                    posNi = j;
                }
            }

            /**
             * Irá dimininuir em 1 o ponto de parada do loop interno para impedir que ni seja comparado com valores que já estão ordenados
            */
            tamJ--;

        }

        System.out.println("Lista ordenada: " + Arrays.toString(numbers));
    }
}