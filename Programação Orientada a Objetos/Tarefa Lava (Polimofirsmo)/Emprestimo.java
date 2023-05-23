public class Emprestimo {

    // Atributos
    private Cliente cliente;
    private Veiculo veiculo;
    private int qtdRenovacoes;

    // Construtor
    public Emprestimo(Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.qtdRenovacoes = 0;
    }

    // Getters & Setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQtdRenovacoes() {
        return qtdRenovacoes;
    }

    public void setQtdRenovacoes(int qtdRenovacoes) {
        this.qtdRenovacoes = qtdRenovacoes;
    }

    //Método de renovação
    public void renovarEmprestimo() {
        qtdRenovacoes++;
        System.out.println("Renovação concluida!!! Total de renovações: " + qtdRenovacoes);
    }

    

}
