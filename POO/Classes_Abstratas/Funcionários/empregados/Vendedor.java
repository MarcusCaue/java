package empregados;

public class Vendedor extends Funcionario {

    double comissao;

    public Vendedor(String novoNome, String novaMatricula, double novoSal, double novaComissao) {
        super(novoNome, novaMatricula, novoSal);
        this.comissao = novaComissao;
    }

    public double calculaSalario() {
        this.salarioBase += this.comissao;
        return this.salarioBase;
    }
    
}
