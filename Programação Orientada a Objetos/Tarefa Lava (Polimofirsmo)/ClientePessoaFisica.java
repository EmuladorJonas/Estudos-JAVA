public class ClientePessoaFisica extends Cliente {

    // Atributos
    private String cpf;

    // Construtor
    public ClientePessoaFisica(String nome, String telefone, String endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }

    // Getters & Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
