package serHumano;

//SuperClasse | A Classe Mãe
public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String novoNome, int novaIdade) {
        this.nome = novoNome;
        this.idade = novaIdade;
    }

    public String rir() {
        return "kkkkkkk";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}
