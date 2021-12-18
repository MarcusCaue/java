import Animais.*;

public class Main {
    public static void main(String[] args) {
        Animal undefined = new Animal("Não tem nome", 0);
        Corvo jackdaw = new Corvo("Jackdaw, o Corvo das Trevas", 2);
        Lobo lorram = new Lobo("Lorram, o Lobo do Norte", 4);

        System.out.printf("O animal tem o nome '%s', possui %d patas e o som que ele emite é ", undefined.getNome(), undefined.getNumerodepatas());
        undefined.emitirSom();

        System.out.printf("O animal tem o nome '%s', possui %d patas e o som que ele emite é ", jackdaw.getNome(), jackdaw.getNumerodepatas());
        jackdaw.emitirSom();

        System.out.printf("O animal tem o nome '%s', possui %d patas e o som que ele emite é ", lorram.getNome(), lorram.getNumerodepatas());
        lorram.emitirSom();
    
    }
}
