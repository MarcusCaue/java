package Animais;

public class Lobo extends Animal {

    //Construtor
    public Lobo(String novoNome, int numPatas) {
        super(novoNome, numPatas);
    }

    //Métodos
    public void emitirSom() {
        System.out.println("Auuuuuuu!!");
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