public class Titular {
  private String nome;
  private String cpf;
  private String endereco;
  private String telefone;

  private static int nroTitular = 1; // O primeiro Titular criaddo será o 1.
 
  //Construtores
  public Titular(String nome, String cpf, String endereco, String telefone){
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.telefone = telefone;
    nroTitular += 1; // Para cada nova cnta, somar +1 no nmro do Titular.
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
