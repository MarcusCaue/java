package empregados;

public abstract class Funcionario {
    //Atributos
    String nome;
    String matricula;
    double salarioBase;

    public Funcionario(String novoNome, String novaMatricula, double novoSalBase) {
        this.nome = novoNome;
        this.matricula = novaMatricula;
        this.salarioBase = novoSalBase;
    }

    public abstract double calculaSalario();


    public String getNome() {
        return this.nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String newMatricula) {
        this.matricula = newMatricula;
    }

    public double getSalario() {
        return this.salarioBase;
    }

    public void setSalario(double newSalariobase) {
        this.salarioBase = newSalariobase;
    }

}