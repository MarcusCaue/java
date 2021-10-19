package empregados;

public class Assistente extends Funcionario {
    
    public Assistente(String novoNome, String novaMatricula, double novoSal) {
        super(novoNome, novaMatricula, novoSal);
    }

    public double calculaSalario() {
        return this.salarioBase;
    }
    
}
