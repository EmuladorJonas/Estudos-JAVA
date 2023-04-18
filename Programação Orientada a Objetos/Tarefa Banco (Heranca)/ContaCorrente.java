public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    @Override // Pegando o metodo "SACAR" da classe Conta e reescrevendo para funcionar na contaCorrente
    boolean sacar(double valor){
        if(valor > 0 && this.getSaldo() >= valor){
          this.setSaldo(this.getSaldo() - valor);
          System.out.println("Saque realizado com sucesso!");
          return true;
        }
        System.out.println("Erro ao realizar saque!");
        return false;
      }

    
      }