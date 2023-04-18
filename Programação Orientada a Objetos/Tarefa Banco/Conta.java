public class Conta{
  
  private int nro;
  private Titular titular;
  private double saldo = 0.0;//Valor inicial de cada conta criada
  private static int nroConta = 1; // A primeira Cont criadda será a 1.

  public Conta(Titular titular){
    this.nro = nroConta;
    this.titular = titular;
    nroConta += 1; // Para cada nova conta, somar +1 no nmro da Conta.
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

  
  boolean sacar(double valor){
    if(valor > 0 && saldo >= valor){
      saldo = saldo - valor;
      System.out.println("Saque realizado com sucesso!");
      return true;
    }
    System.out.println("Erro ao realizar saque!");
    return false;
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

  void extrato(){
    System.out.println("Conta "+nro+" - Saldo atual: "+saldo);
  }

  public String toString(){
    return "\n**********DADOS BANCARIOS**********"+
           "\nNumero da Cnta: " +this.getNro()+
           "\nNome: " +this.titular.getNome()+
           "\nEndereco: " +this.titular.getEndereco()+
           "\nTelefone: " +this.titular.getTelefone()+
           "\nSaldo: R$ " +this.getSaldo()+
           "\n********************\n";
  }
 
}