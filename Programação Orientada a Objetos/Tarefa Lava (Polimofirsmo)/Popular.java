public class Popular extends Veiculo {

    // Atributos
    private boolean hasArCondicionado;

    // Construtor
    public Popular(String marca, String modelo, String placa, int ano, double valorDaLocacao, boolean hasArCondicionado) {
        super(marca, modelo, placa, ano, valorDaLocacao);
        this.hasArCondicionado = hasArCondicionado;
    }

    // Getters & Setters
    public boolean isHasArCondicionado() {
        return hasArCondicionado;
    }

    public void setHasArCondicionado(boolean hasArCondicionado) {
        this.hasArCondicionado = hasArCondicionado;
    }

    /*Metodo obrigatório calcularMulta. Para questões de polimorfismo
    cada categoria implementa seu próprio metodo de calcular multa*/
    @Override
    public double calcularMulta(int qtdRenovacoes) {
        if (qtdRenovacoes > 1) {
            return (qtdRenovacoes - 1) * 50.0; // 1 é o limite para carros pop e 50 é valor aleatorio de multa
        }
        return 0.0;
    }

}
