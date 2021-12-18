/*
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro;
Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades de um local. Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local.
*/

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