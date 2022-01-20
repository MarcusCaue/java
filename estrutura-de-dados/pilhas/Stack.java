public class Stack {
    private String dados[];
    private int tam;

    public Stack() {
        this.dados = new String[10];
        this.tam = 0;
    }

    public boolean vazia() {
        if (this.tam == 0) {
            return true;
        }

        return false;
    }

    public boolean cheia() {
        if (this.tam == 10) {
            return true;
        }

        return false;
    }

    public int tamanho() {
        return this.tam;
    }

    public boolean empilhar(String novoDado) {
        if (cheia()) {
            return false;
        }

        this.dados[this.tam] = novoDado;
        this.tam++;

        return true;
    }

    public boolean pop() {
        if (vazia()) {
            return false;
        }

        this.dados[this.tam] = null;
        this.tam--;

        return true;
    }

    public void elementos() {
        System.out.println("\n{");

        for (int i = this.tam - 1; i >= 0; i--) {
            System.out.println("    " + this.dados[i]);
        }

        System.out.println("}\n");
    }

    public String topo() {
        if (vazia()) {
            return null;
        }

        return this.dados[this.tam - 1];
    }
}