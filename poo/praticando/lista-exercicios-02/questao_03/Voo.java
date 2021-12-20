package questao_03;

import questao_02.Data;

public class Voo {
    
    private Data data;
    private boolean vagas[];
    private int numVoo;

    public Voo(int novoNumVoo, Data novaData) {
        this.numVoo = novoNumVoo;
        this.data = novaData;
        this.vagas = new boolean[100];
    }
    
    public int proximoLivre() {

        for (int i = 1; i < 101; i++) {
            if (! verifica(i)) {
                return i;
            }
        }

        return -1;
    }
  
    public boolean verifica(int numCadeira) {
        if (this.vagas[numCadeira - 1]) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean ocupa(int numCadeira) {
        if (verifica(numCadeira)) {
            return false;
        }
        else {
            this.vagas[numCadeira - 1] = true;
            return true;
        }
    }

    public byte vagas() {

        byte cadeirasVagas = 0;

        for (byte i = 0; i < 100; i++) {
            if (this.vagas[i] == false) {
                cadeirasVagas++;
            } 
        }

        return cadeirasVagas;
    }

    public int getVoo() {
        return this.numVoo;
    }

    public Data getData() {
        return this.data;
    }

    public Voo clone() {
        
        Voo cloneVoo = new Voo(this.numVoo, this.data);
        
        for (byte i = 0; i < 100; i++) {
            cloneVoo.vagas[i] = this.vagas[i];
        }

        return cloneVoo;

    }

}
