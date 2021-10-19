public class Cidade {
    //Atributos
    int pessoas;
    double area;

    //Construtor
    public Cidade(int quantPessoas, double tamanhoCidade) {
        this.pessoas = quantPessoas;
        this.area = tamanhoCidade;
    }

    //Métodos
    public double densidadeDemografica() {
        return pessoas / area;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int novaQuantPessoas) {
        this.pessoas = novaQuantPessoas;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double novaArea) {
        this.area = novaArea;
    }
}