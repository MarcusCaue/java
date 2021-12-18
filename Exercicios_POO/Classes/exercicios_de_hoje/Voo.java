import Data.Data;

public class Voo {
    int number;
    Data data;
    int cadeiras[];

    public Voo(int newNumber, Data newData) {
        this.number = newNumber;
        this.data = newData;
        this.cadeiras = new int[100];
    }

    public int proximoLivre() {
        return -1;
    }

    public String verifica(int numCadeira) {
        return "está ocupada!";
    }
    
    public boolean ocupa(int numCadeira) {

        return true;

    }
}
