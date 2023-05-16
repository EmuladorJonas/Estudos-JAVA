public class Empresa extends Cliente {

    // Atributos
    private String cnpj;
    private String nomeRepresentante;

    // Construtor
    public Empresa(String nome, String telefone, String endereco, String cnpj, String nomeRepresentante) {
        super(nomeRepresentante, telefone, endereco);
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

}
