package questao_02;

public class Data {
    String data;

    public Data(String newData) {

        if (newData.substring(2, 3).equals("/") && newData.subSequence(5, 6).equals("/")) {
            String partesData[] = newData.split("/");

            int firstPeace = Integer.parseInt(partesData[0]);
            int secondPeace = Integer.parseInt(partesData[1]);
            int thirdPeace = Integer.parseInt(partesData[2]);

            if (firstPeace > 0 && secondPeace > 0 && thirdPeace > 0) {
                if (firstPeace <= 31 && secondPeace <= 12) {
                    this.data = newData;
                }
                else {
                    this.data = "01/01/0001";
                }
            }
            else {
                this.data = "01/01/0001";
            }
        }
        else {
            this.data = "01/01/0001";
        }

    }
 
    public int getDia() {
        int dia = Integer.parseInt(data.substring(0, 2));

        return dia;
    }

    public int getMes() {
        int mes = Integer.parseInt(data.substring(3, 5));

        return mes;
    }

    public String getMesExtenso() {
        String meses[] = {
            "janeiro", "fevereiro", "março", "abril",
            "maio", "junho", "julho", "agosto",
            "setembro", "outubro", "novembro", "dezembro" 
        };

        return meses[getMes() - 1];
    }

    public int getAno() {
        int ano = Integer.parseInt(data.substring(6));

        return ano;
    }

    public String clone() {

        Data clonado = new Data(data);

        return clonado.toString();
    }

    public int compara(Data outraData) {
        if (getDia() == outraData.getDia() && getMes() == outraData.getMes() && getAno() == outraData.getAno()) {
            return 0;
        }
        else if (getDia() > outraData.getDia() || getMes() > outraData.getMes() || getAno() > outraData.getAno()) {
            return 1;
        }
        
        return -1;
    }

    public boolean isBissexto() {

        int ano = getAno();

        if ((ano % 4 == 0) || (ano % 400 == 0)) {
            return true;
        }

        return false;
    }

    public String getData() {
        return this.data;
    }
}