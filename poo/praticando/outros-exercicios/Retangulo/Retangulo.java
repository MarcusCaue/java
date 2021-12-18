public class Retangulo {
    //Atributos;
    float comprimento;
    float altura;

    //Construtor
    public Retangulo(float novoComp, float novoAlt) {
        this.comprimento = novoComp;
        this.altura = novoAlt;
    }

    //Métodos
    public float getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(float novoComp) {
        this.comprimento = novoComp;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float novoAlt) {
        this.altura = novoAlt;
    }

    public float area() {
        return this.comprimento * this.altura;
    }

    public float perimetro() {
        return 2 * (this.comprimento + this.altura);
    }
}