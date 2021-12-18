public class Pessoa {
    //Atributos
    String nome;
    int idade;
    float peso;
    double altura;

    //Construtor
    public Pessoa(String novoNome, int novaIdade, float novoPeso, double novaAltura) {
        this.nome = novoNome;
        this.idade = novaIdade;
        this.peso = novoPeso;
        this.altura = novaAltura;
    }

    //Métodos
    public void envelhecer(int anos) {
        this.idade += anos;
    }

    public void engordar(float massa) {
        this.peso += massa;
    }

    public void emagrecer(float massa) {
        this.peso -= massa;
    }

    public void crescer(double tamanho) {
        this.altura += tamanho;
    }
}