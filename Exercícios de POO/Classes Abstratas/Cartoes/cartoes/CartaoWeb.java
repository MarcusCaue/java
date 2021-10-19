package cartoes;

public abstract class CartaoWeb {
    String mensagem;
    String remetente;
    String destinatario;
    String data;

    public abstract String mostrarMensagem();
}