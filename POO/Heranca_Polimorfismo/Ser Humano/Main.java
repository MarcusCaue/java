import serHumano.*;

public class Main {
    public static void main(String[] args) {
        Pessoa jonas = new Pessoa("Jonas de Samos", 2786);
        Marcus marcusCaue = new Marcus("Marcus Cauê de Farias Barbosa", 17, 2114452242);
        Pessoa marcusAlternativo = new Marcus("Marcus Alternativo", 71, 887711);

        System.out.printf("A pessoa %s ri da seguinte forma: %s\n", jonas.getNome(), jonas.rir());
        System.out.printf("A pessoa %s ri da seguinte forma: %s\n", marcusCaue.getNome(), marcusCaue.rir());
        System.out.printf("A pessoa %s ri da seguinte forma: %s\n", marcusAlternativo.getNome(), marcusAlternativo.rir());
        
    }   
}
