public class Emprestimo {

    // Atributos
    private Locacao locacao;
    private Locator locator;

    // Construtor
    public Emprestimo(Locacao locacao, Locator locator) {
        this.locacao = locacao;
        this.locator = locator;
    }

    // Getters & Setters
    public Locacao getLocacao() {
        return locacao;
    }

    public void setVeiculo(Locacao locacao) {
        this.locacao = locacao;
    }


    public Locator getLocator() {
        return locator;
    }

    public void setLocator(Locator locator) {
        this.locator = locator;
    }

}
