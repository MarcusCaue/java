public class Quadrado {
    //Atributo
    float lado;

    //Construtor
    public Quadrado(float novoLado) {
        this.lado = novoLado;
    }

    //Métodos
    public float perimetro() {
        return this.lado * 4;
    }

    public float area() {
        return this.lado * this.lado;
    }

    public float getLado() {
        return this.lado;
    }

    public void setLado(float novoLado) {
        this.lado = novoLado;
    }
}