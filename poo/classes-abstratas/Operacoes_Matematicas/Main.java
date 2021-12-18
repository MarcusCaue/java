import operacoes.*;

public class Main {
    public static void main(String[] args) {
        double valores[] = {10, 10};

        Soma c1 = new Soma(valores);
        Subtracao c2 = new Subtracao(valores);
        Multiplicacao c3 = new Multiplicacao(valores);
        Divisao c4 = new Divisao(valores);

        System.out.println("O resultado da operação foi " + c1.calcula());
        System.out.println("O resultado da operação foi " + c2.calcula());
        System.out.println("O resultado da operação foi " + c3.calcula());
        System.out.println("O resultado da operação foi " + c4.calcula());

    }
}