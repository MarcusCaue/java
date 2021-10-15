package cartoes;

public class CartaoAniversario extends CartaoWeb {

   public CartaoAniversario(String newMsg, String newRemt, String newDest, String newData) {
       this.mensagem = newMsg;
       this.remetente = newRemt;
       this.destinatario = newDest;
       this.data = newData;
   }

   public String mostrarMensagem() {
       return this.mensagem;
    }

   /*Getters e Setters*/
   
   //Set da Mensagem

   public void setMensagem(String novaMensagem) {
       this.mensagem = novaMensagem;
   }

   //Get e set do Remetente
   public String getRemetente() {
       return this.remetente;
   }

   public void setRemetente(String novoRemetente) {
       this.remetente = novoRemetente;
   }

   //Get e set do Destinatário
   public String getDestinatario() {
       return this.destinatario;
   }

   public void setDestinatario(String novoDestinatario) {
       this.destinatario = novoDestinatario;
   }

   //Get e set da Data
   public String getData() {
       return this.data;
   }

   public void setData(String novaData) {
       this.data = novaData;
   }
}
