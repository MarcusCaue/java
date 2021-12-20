package questao_01;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        String option;
        do {   
            System.out.print("Matricula: ");
            String matricula = entrada.nextLine();

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            double notasProvas[] = new double[2];

            System.out.print("Nota da 1º prova: ");
            notasProvas[0] = entrada.nextDouble();

            System.out.print("Nota da 2º prova: ");
            notasProvas[1] = entrada.nextDouble();

            System.out.print("Nota do trabalho: ");
            double notaTrabalho = entrada.nextDouble();

            Aluno a1 = new Aluno(matricula, nome, notasProvas, notaTrabalho);

            System.out.printf("\nMédia final: %.1f\n", a1.media());

            if (a1.emFinal() == 0) {
                System.out.println("Parabéns! Você não está em final!");
            }
            else {
                System.out.printf("Você precisa de %.1f para passar na final!\n", a1.emFinal());
            }
            
            System.out.print("Quer continuar? "); entrada.nextLine();
            option = entrada.nextLine();

        } while (! option.equals("N"));
    }
    
}
