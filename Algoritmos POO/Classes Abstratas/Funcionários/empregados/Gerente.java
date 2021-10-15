package empregados;

public class Gerente extends Funcionario{

    public Gerente(String novoNome, String novaMatricula, double novoSal) {
        super(novoNome, novaMatricula, novoSal);
    }

    public double calculaSalario() {
        this.salarioBase += this.salarioBase;
        return this.salarioBase;
    }
    
}
