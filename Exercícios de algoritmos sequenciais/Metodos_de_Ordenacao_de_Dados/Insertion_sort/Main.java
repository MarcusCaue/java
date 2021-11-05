public class Main {
    public static void main(String[] args) {

        int numbers[] = {4, 5, 2, 1, 0, 21, 44};

        for (int i = 0; i < numbers.length - 1; i++) {

            int atual = numbers[i + 1];

            for (int j = i + 1; j > -1; j--) {

                if (atual < numbers[j]) {
                    int nj = numbers[j];
                    numbers[j] = atual;
                    numbers[j + 1] = nj;
                }

            }

        }
    }
}