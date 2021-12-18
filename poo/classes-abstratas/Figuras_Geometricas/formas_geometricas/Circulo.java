package formas_geometricas;

public class Circulo extends FiguraPlana {
    float raio;

    public Circulo(float novoRaio) {
        this.raio = novoRaio;
    }

    public float perimetro() {
        float perimetro = (3.14f * 2 * raio);
        return perimetro;
    }

    public float area() {
        float area = 3.14f * raio * raio;
        return area;
    }

    //Getters and Setters
    public float getRaio() {
        return this.raio;
    }
    
    public void setRaio(float newRaio) {
        this.raio = newRaio;
    }
    
} 
