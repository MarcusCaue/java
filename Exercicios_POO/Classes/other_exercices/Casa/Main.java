public class Main {
    public static void main(String args[]) {
        String endereco = "Rua Campos Sales";
        String cor = "Branca";
        float area = 80;
        float preco = 150000;
        int quantidadeDeQuartos = 3;
        int quantidadeDeBanheiros = 2;
        int quantidadeDeAndares = 1;
        boolean areaDeServico = true;
        boolean quintal = true;
        boolean ocupada = true;

        Casa casaDeDaniel = new Casa(endereco, cor, area, preco, quantidadeDeQuartos, quantidadeDeBanheiros, quantidadeDeAndares, areaDeServico, quintal, ocupada);

        endereco = "Rua Jonas de Samos da Grécia";
        cor = "Vermelha";
        area = 90;
        preco = 350000;
        quantidadeDeQuartos = 2;
        quantidadeDeBanheiros = 2;
        quantidadeDeAndares = 4;
        areaDeServico = true;
        quintal = false;
        ocupada = true;

        Casa casaDaEmanulle = new Casa(endereco, cor, area, preco, quantidadeDeQuartos, quantidadeDeBanheiros, quantidadeDeAndares, areaDeServico, quintal, ocupada);

        
    }
    
}
