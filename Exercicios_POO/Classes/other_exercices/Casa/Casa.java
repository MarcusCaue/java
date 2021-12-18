public class Casa {
    //Atributos
    String endereco;
    String cor;
    float area;
    float preco;
    int quantidadeDeQuartos;
    int quantidadeDeBanheiros;
    int quantidadeDeAndares;
    boolean areaDeServico;
    boolean quintal;
    boolean ocupada;

    //Construtor
    public Casa(String novoEndereco, String novaCor, float novaArea, float novoPreco, int novoQuartos, int novoBanheiros, int novoAndares, boolean novaAreaDeServico, boolean novoQuintal, boolean novoOcupada) {
        this.endereco = novoEndereco;
        this.cor = novaCor;
        this.area = novaArea;
        this.preco = novoPreco;
        this.quantidadeDeQuartos = novoQuartos;
        this.quantidadeDeBanheiros = novoBanheiros;
        this.quantidadeDeAndares = novoAndares;
        this.areaDeServico = novaAreaDeServico;
        this.quintal = novoQuintal;
        this.ocupada = novoOcupada;
    }

    //Métodos ou funções

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String newEndereco) {
        this.endereco = newEndereco;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String newCor) {
        this.cor = newCor;
    }

    public float getArea() {
        return this.area;
    }

    public void setArea(float newArea) {
        this.area = newArea;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float newPreco) {
        this.preco = newPreco;
    }

    public int getQuantidadedequartos() {
        return this.quantidadeDeQuartos;
    }

    public void setQuantidadedequartos(int newQuantidadedequartos) {
        this.quantidadeDeQuartos = newQuantidadedequartos;
    }

    public int getQuantidadedebanheiros() {
        return this.quantidadeDeBanheiros;
    }

    public void setQuantidadedebanheiros(int newQuantidadedebanheiros) {
        this.quantidadeDeBanheiros = newQuantidadedebanheiros;
    }

    public int getQuantidadedeandares() {
        return this.quantidadeDeAndares;
    }

    public void setQuantidadedeandares(int newQuantidadedeandares) {
        this.quantidadeDeAndares = newQuantidadedeandares;
    }

    public boolean getAreadeservico() {
        return this.areaDeServico;
    }

    public void setAreadeservico(boolean newAreadeservico) {
        this.areaDeServico = newAreadeservico;
    }

    public boolean getQuintal() {
        return this.quintal;
    }

    public void setQuintal(boolean newQuintal) {
        this.quintal = newQuintal;
    }

    public boolean getOcupada() {
        return this.ocupada;
    }

    public void setOcupada(boolean newOcupada) {
        this.ocupada = newOcupada;
    }

}