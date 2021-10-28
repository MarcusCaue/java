/*Usei o arquivo disponibilizado pelo professor e só fiz algumas pequenas alterações*/

public class ListaSeq{
  private String dados[];
  private int tamanho;
  private int tamMax;

  public ListaSeq(){
    this.tamanho = 0;
    this.tamMax = 100;
    this.dados = new String[this.tamMax];
  }

  public boolean vazia(){
    if (this.tamanho == 0)
      return true;
    return false;  
  }

  public boolean cheia(){
    if (this.tamanho == this.tamMax)
      return true;
    return false;  
  }

  public int tamanho(){
    return this.tamanho;
  }

  public String busca(int posicao){
    if ((posicao < 0) || (posicao>this.tamanho-1))
      return null;
    return this.dados[posicao];
  }

  public int busca(String dado){
    for (int i=0; i<this.tamanho; i++){
        if (this.dados[i].equals(dado))
          return i;
    }
    return -1;
  }

  public boolean inserir(String dado){
    if (this.cheia())
      return false;

    this.dados[this.tamanho] = dado;  
    this.tamanho++;
    return true;
  }

  public void exibir(){
    System.out.print("[");

    for (int i=0; i<this.tamanho; i++){
      System.out.print(this.dados[i]);
      
      if (i != tamanho - 1) {
        System.out.print(", ");
      }
      else {
        System.out.print("");
      }

    }

    System.out.println("]");
  }

  public boolean remover(String dado){
    int pos=busca(dado);

    if (pos==-1)
      return false;

    for (int i = pos; i < this.tamanho-1; i++)
      this.dados[i] = this.dados[i+1];
      this.tamanho--;

    return true;
    }
  
  public String[] getDados() {
    String listaReal[] = new String[tamanho];
    
    for (int i = 0; i < tamanho; i++) {
      listaReal[i] = dados[i];
    }
    
    return listaReal;
  }

  public void limpar() {
    if (vazia()) {
      System.out.println("A lista já está vazia!");
    }
    else {
      for (String word : getDados()) {
        remover(word);
      }
      System.out.println("Lista esvaziada com sucesso!");
    }
  }
}