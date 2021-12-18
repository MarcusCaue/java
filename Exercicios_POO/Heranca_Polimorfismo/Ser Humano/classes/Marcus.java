package serHumano;

//Subclasse de Pessoa
public class Marcus extends Pessoa {

    long codigo;

    public Marcus(String novoNome, int novaIdade, long novoCodigo) {
        super(novoNome, novaIdade);
        this.codigo = novoCodigo;
    }

    public String rir() {
        return "KKKKKKKKKKK";
    }
    
}
