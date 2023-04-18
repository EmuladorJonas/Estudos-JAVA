public class Cliente {
  private String nome;
  private String cpf;
  private String cnpj;
  private String endereco;
  private String telefone;
  private static int nroTitular = 1; // O primeiro Titular criaddo será o 1.
 
  //Construtores
  public Cliente(String nome, String cpf, String cnpj, String endereco, String telefone){
    this.nome = nome;
    this.cpf = cpf;
    this.cnpj = cnpj;
    this.endereco = endereco;
    this.telefone = telefone;
    nroTitular += 1; // Para cada nova cnta, somar +1 no nmro do Titular.
  }

  public String getcnpj(){
    return this.cnpj;
  }

  //Retorna o valor
  public String getNome(){
    return this.nome;
  }

  //Retorna o CPF
  public String getCpf(){
    return this.cpf;
  }

  //Retorna o endereço
  public String getEndereco(){
    return this.endereco;
  }

  //Retorna o telefne
  public String getTelefone(){
    return this.telefone;
  }

  public void setCnpj(String cnpj){
    this.cnpj = cnpj;
  }

  //Seta nome
  public void setNome(String nome){
    this.nome = nome;
  }

  //Seta cpf
  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  //Seta endereço
  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  //Seta telefone
  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

  //Método para imprimir os dados da conta
  public String toString(){
    return "\nNome: " +this.getNome()+
           "\nCPF: " +this.getCpf()+
           "\nTelefone: " +this.getTelefone();
  }

}
