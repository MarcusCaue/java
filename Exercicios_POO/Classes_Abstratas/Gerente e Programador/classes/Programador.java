package classes;

public class Programador extends Funcionario {

    public Programador(String novoNome, double novoSalario) {
        this.nome = novoNome;
        this.salario = novoSalario;
    }

    public void aumentaSalario() {
        this.salario += (salario * 0.20);
    }
    
}
