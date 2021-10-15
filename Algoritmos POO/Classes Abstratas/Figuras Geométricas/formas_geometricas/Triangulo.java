package formas_geometricas;

public class Triangulo extends FiguraPlana {
    float lados[] = new float[3];

    public Triangulo(float valoresLados[]) {
        this.lados[0] = valoresLados[0];
        this.lados[1] = valoresLados[1];
        this.lados[2] = valoresLados[2];
    }
    
    public float perimetro() {
        float perimetro = lados[0] + lados[1] + lados[2];
        return perimetro;
    } 

    public float area() {
        float area = (lados[0] * lados[1]) / 2;
        return area;
    }

    //Getters and Setters
    public float getLados(int posicaoElemento) {
        return lados[posicaoElemento];
    }

    public void setLados(float newLado1, float newLado2, float newLado3) {
        this.lados[0] = newLado1;
        this.lados[1] = newLado2;
        this.lados[2] = newLado3;
    } 
}
