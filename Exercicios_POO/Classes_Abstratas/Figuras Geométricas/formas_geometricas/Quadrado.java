package formas_geometricas;

public class Quadrado extends FiguraPlana {
    float lado;

    public Quadrado(float novoLado) {
        this.lado = novoLado;
    }

    public float area() {
        float area = lado * lado;
        return area;
    }

    public float perimetro() {
        float perimetro = 4 * lado;
        return perimetro;
    }
    
    public float getLado() {
        return this.lado;
    }
    
    public void setLado(float newLado) {
        this.lado = newLado;
    }
}
