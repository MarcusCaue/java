package formas_geometricas;

public class Losango extends Quadrado {
    
    public Losango(float novoLado) {
        super(novoLado);
    }

    public float area() {
        float area = (lado * lado) / 2;
        return area;
    }

    public float getLado() {
        return this.lado;
    }
    
    public void setLado(float newLado) {
        this.lado = newLado;
    }

}