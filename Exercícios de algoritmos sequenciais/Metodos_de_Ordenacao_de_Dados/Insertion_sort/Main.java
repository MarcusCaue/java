public class Main {
    public static void main(String[] args) {

        int numbers[] = {4, 5, 2, 1, 0, 21, 44};

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j > -1; j--) {

                System.out.println(numbers[j] + " " + numbers[i]);
                System.out.println("---------------------------");

            }

        }



    }
}