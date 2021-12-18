public class Data {
    //Atributo
    String data;

    //Construtor
    public Data(String novaData) {
        this.data = novaData;
    }

    //Métodos
    public String toString() {
        
        //Lista que vai armazenar os nomes dos meses do ano
        String meses[] = {
            "Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto", 
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        //Lista que vai conter os pedaços de uma data: o dia, o mês e o ano separados.
        String pedacosData[] = this.data.split("/");

        //Convertendo o tipo de dado do mês de String para inteiro
        //Isso faz com que seja possível acessar um valor da lista "meses" através de um índice numérico 
        int mesInteiro = Integer.parseInt(pedacosData[1]) - 1;

        //Cada variável contendo um pedaço de uma data
        String dia = pedacosData[0];
        String mes = meses[mesInteiro];
        String ano = pedacosData[2];

        //Variável que vai armazenar o valor da data por extenso
        String dataExtensa = dia + " de " + mes + " de " + ano;

        //Retornando o valor da variável "dataExtensa"
        return dataExtensa;
    }

    public boolean equals(Data data1, Data data2) {
        
        //Irá comparar os valores das duas datas passadas como parâmetros

        if (data1.getData().equals(data2.getData())) {
            //Esse equals() utilizado é o método equals() implementado pela classe String para comparar objetos do tipo String
            return true;
        }
        
        return false;
    }
    
    //Get e Set
    public String getData() {
        return this.data;
    }

    public void setData(String novaData) {
        this.data = novaData;
    }

}