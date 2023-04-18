public class ContaEspecial extends Conta {

    private double chequeEspecial;

    public ContaEspecial(Cliente titular, double chequeEspecial) {
        super(titular);
        this.chequeEspecial = chequeEspecial;
        //this.chequeEspecial = 2000;
    }

    @Override // Pegando o metodo "SACAR" da classe Conta e reescrevendo para funcionar na contaEspecial
    boolean sacar(double valor){
        if(valor > 0 && this.getSaldo() >= (valor + chequeEspecial)){
          this.setSaldo(this.getSaldo() - valor);
          System.out.println("Saque realizado com sucesso!");
          return true;
        }
        System.out.println("Erro ao realizar saque!");
        return false;
      }
    
}