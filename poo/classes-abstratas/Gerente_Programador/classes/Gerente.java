package classes;

public class Gerente extends Funcionario {

    public Gerente(String novoNome, double novoSalario) {
        this.nome = novoNome;
        this.salario = novoSalario;
    }
    
    public void aumentaSalario() {
        this.salario += (salario * 0.10);
    }
}
