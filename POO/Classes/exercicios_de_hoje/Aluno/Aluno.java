package Aluno;

public class Aluno {
    //Atributos
    String matricula;
    String nome;
    double notasProvas[];
    double notaTrabalho;

    //Construtor
    public Aluno(String newMatricula, String newNome, double newNotasProvas[], double newNotaTrabalho) {
        this.matricula = newMatricula;
        this.nome = newNome;
        this.notasProvas = newNotasProvas;
        this.notaTrabalho = newNotaTrabalho;
    }

    //Métodos

    public double media() {
        double mediaFinal = ((notasProvas[0] * 2.5) + (notasProvas[1] * 2.5) + (notaTrabalho * 2)) / 7;

        return mediaFinal;
    }

    public double emFinal() {
        double media = media();

        if (media > 7) {
            return 0;
        }
        else {
            double diferenca = 7 - media;
            return diferenca;
        }
    }


}