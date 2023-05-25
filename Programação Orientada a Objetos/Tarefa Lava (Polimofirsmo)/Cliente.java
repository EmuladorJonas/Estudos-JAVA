public abstract class Cliente {

    // Atributos
    private String nome;
    private String telefone;
    private String endereco;
    private int limiteEmprestimo;
    private int qtdEmprestimo;

    // Construtor
    public Cliente(String nome, String telefone, String endereco, int limiteEmprestimo) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.limiteEmprestimo = limiteEmprestimo;
        this.qtdEmprestimo = 0;
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(int limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public int getQtdEmprestimo() {
        return qtdEmprestimo;
    }

    public void setQtdEmprestimo(int qtdEmprestimo) {
        this.qtdEmprestimo = qtdEmprestimo;
    }

    public abstract boolean liberarEmprestimo();

}
