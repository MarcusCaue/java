package Animais;

public class Corvo extends Animal {

    //Construtor
    public Corvo(String novoNome, int numPatas) {
        super(novoNome, numPatas);
    }

    //Métodos
    public void emitirSom() {
        System.out.println("Cra!!! Cra!! Cra!!!");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public int getNumerodepatas() {
        return this.numeroDePatas;
    }

    public void setNumerodepatas(int newNumerodepatas) {
        this.numeroDePatas = newNumerodepatas;
    }
    
}