public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular) {
        super(titular);
    }

    @Override
    void rendimento() {
        this.setSaldo(this.getSaldo() + this.getSaldo() * 0.05);
    }

}
