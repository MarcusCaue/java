public class Main {
    public static void main(String[] args) {

        Stack pilha = new Stack();

        boolean res;

        pilha.empilhar("Jonas de Samos");
        pilha.empilhar("Paula Miranda Barbosa");
        pilha.empilhar("Pedro Miranda Barbosa");
        pilha.empilhar("Lissandra");
        pilha.empilhar("Joana");

        pilha.elementos();
        System.out.println("Elemento do topo -> " + pilha.topo());

        pilha.pop();
        pilha.pop();

        pilha.elementos();
        System.out.println("Elemento do topo -> " + pilha.topo());

        pilha.empilhar("Rafael");
        pilha.empilhar("Francisco");
        pilha.empilhar("Morgana");

        pilha.elementos();
        System.out.println("Elemento do topo -> " + pilha.topo());

        pilha.empilhar("Lohana");
        pilha.pop();
        pilha.empilhar("Lohana");
        pilha.pop();
        pilha.empilhar("Lohana");
        pilha.pop();

        pilha.elementos();
        System.out.println("Elemento do topo -> " + pilha.topo());

    }
}
