public class ClienteEmpresa extends Cliente {

    // Atributos
    private String cnpj;
    private String nomeRepresentante;

    // Construtor
    public ClienteEmpresa(String nome, String telefone, String endereco, String cnpj, String nomeRepresentante) {
        super(nomeRepresentante, telefone, endereco, -1);
        this.cnpj = cnpj;
        this.nomeRepresentante = nomeRepresentante;
    }

    // Getters & Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    @Override
    public boolean liberarEmprestimo() {
        return true;
    }

}
