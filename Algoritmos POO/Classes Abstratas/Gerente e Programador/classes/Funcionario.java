package classes;

public abstract class Funcionario {
    String nome;
    double salario;

    public abstract void aumentaSalario();

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String newNome) {
        this.nome = newNome;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double newSalario) {
        this.salario = newSalario;
    }
}
