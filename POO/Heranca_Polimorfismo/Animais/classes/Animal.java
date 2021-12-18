package Animais;

public class Animal {
    //Atributos
    String nome;
    int numeroDePatas;

    //Construtor
    public Animal(String nomeAnimal, int numPatas) {
        this.nome = nomeAnimal;
        this.numeroDePatas = numPatas;
    }

    //Métodos
    public void emitirSom() {
        System.out.println("Oi");
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