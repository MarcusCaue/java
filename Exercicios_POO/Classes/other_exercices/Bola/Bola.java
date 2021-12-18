public class Bola {
    String cor;
    float circunferencia;
    String material;

    public Bola(String novaCor, float novaCircun, String novoMaterial) {
        this.cor = novaCor;
        this.circunferencia = novaCircun;
        this.material = novoMaterial;
    }

    public void trocaCor(String cor) {
        this.cor = cor;
        System.out.println("A cor da bola foi trocada!");
    }
    
    public String mostraCor() {
        return this.cor;
    }
}
