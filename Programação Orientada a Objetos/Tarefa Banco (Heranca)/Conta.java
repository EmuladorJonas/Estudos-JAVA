public abstract class Conta{
  
  private int nro;
  private Cliente titular;
  private double saldo;//Valor inicial de cada conta criada
  private static int nroConta = 1; // A primeira Cont criadda será a 1.

  public Conta(Cliente titular){
    this.nro = nroConta;
    this.titular = titular;
    this.saldo = 0.0;
    nroConta += 1; // Para cada nova conta, somar +1 no nmro da Conta.

  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }


  public int getNro() {
    return this.nro;
  }

  public void setNro(int nro) {
    this.nro = nro;
  }

  public double getSaldo(){
    return this.saldo;
  }

  public void setSaldo(double valor){
    this.saldo = valor;
  }

  
  boolean sacar(double valor){
    if(valor > 0 ){
      saldo = saldo - valor;
      System.out.println("Saque realizado com sucesso!");     
    }
    return true;
  }

  boolean depositar(double valor){
    if(valor > 0 ){
      saldo = saldo + valor;
      System.out.println("Deposito realizado com sucesso!");
      return true;
    }
    System.out.println("Erro ao realizar deposito!");
    return false;
  }

  boolean transferir(double valor, Conta contaDestino){
    if(this.sacar(valor)){
      contaDestino.depositar(valor);
      System.out.println("Transferencia realizado com sucesso!");
      return true;
    }
    System.out.println("Erro ao realizar transferencia!");
    return false;
  }

  void rendimento() {
    
  }

  void extrato(){
    System.out.println("Conta "+nro+" - Saldo atual: "+saldo);
  }

  public String toString(){
    return "\n**********DADOS BANCARIOS**********"+
           "\nNumero da Cnta: " +this.getNro()+
           "\nNome: " +this.titular.getNome()+
           "\nCNPJ: " +this.titular.getcnpj()+
           "\nCPF: " +this.titular.getCpf()+
           "\nEndereco: " +this.titular.getEndereco()+
           "\nTelefone: " +this.titular.getTelefone()+
           "\nSaldo: R$ " +this.getSaldo()+
           "\n********************\n";
  }
 
}