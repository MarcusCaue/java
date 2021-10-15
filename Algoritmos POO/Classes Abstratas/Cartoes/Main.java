import cartoes.*;

public class Main {

    //Função criada para mostrar uma linha separatória entre as mensagens que serão exibidas na saída
    static void mostraLinha() {
        for (byte i = 0; i < 71; i++) {
            System.out.print("=*");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        /*Classe CartaoNatal*/
        //Atribuindo valores às variáveis, os quais serão enviados aos atributos dos objetos
        String remetente = "Jonas de Samos";
        String destinatario = "Amanda de Abdera";
        String data = "25/12/478";
        String msg = "Prezada, te desejo um bom e alegre Natal! Que neste dia em que nos lembramos do nascimento de Nosso Senhor Jesus Cristo, você possa aumentar a sua fé e amor por Ele!\nContinue sempre sendo essa pessoa feliz, caridosa e generosa!\nObs: O presente se encontra naquele lugar especial :).";

        //Instanciando o objeto da classe CartaoNatal
        CartaoNatal cartaoNatal1 = new CartaoNatal(msg, remetente, destinatario, data);

        //Exibindo as informações
        mostraLinha();
        System.out.println("Cartão de Natal");
        System.out.printf("\nRemetente: %s\n", cartaoNatal1.getRemetente());
        System.out.printf("Destinatário: %s\n", cartaoNatal1.getDestinatario());
        System.out.printf("Data: %s\n\n", cartaoNatal1.getData());
        System.out.printf("%s\n\n", cartaoNatal1.mostrarMensagem());
        mostraLinha();
        
        /*Classe CartaoAniversario*/
        //Alterando os valores das variáveis
        remetente = "Marcus Cauê";
        destinatario = "Rafael Miranda";
        data = "04/10/2044";
        msg = "Meu querido filho, que dia maravilhoso! Neste dia tão especial nossa família se alegra ao lembrar do seu nascimento!\nTu és um rapaz inteligente, bondoso e fiel ao Nosso Senhor e à Nossa Senhora! Com certeza eles devem estar felizes lá no Céu neste grande dia!\nTeu pai deseja-te saúde, sabedoria para tomar boas atitudes e humildade para se relacionar bem com outros.\nUm feliz aniversário, garoto! s2\n\nObs: Depois vai dar uma olhada na cama do seu quarto, acho que tem uma coisa lá de que você vai gostar bastante ^^)";

        //Construindo um objeto da classe CartaoAniversario
        CartaoAniversario cartaoAniv1 = new CartaoAniversario(msg, remetente, destinatario, data);

        //Exibindo as informações
        System.out.println("Cartão de Aniversário");
        System.out.printf("\nRemetente: %s\n", cartaoAniv1.getRemetente());
        System.out.printf("Destinatário: %s\n", cartaoAniv1.getDestinatario());
        System.out.printf("Data: %s\n\n", cartaoAniv1.getData());
        System.out.printf("%s\n\n", cartaoAniv1.mostrarMensagem());
        mostraLinha();

    }
}
