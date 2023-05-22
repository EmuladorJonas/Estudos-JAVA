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

    //Metodo obrigatório calcularMulta
    @Override
    public double calcularMulta(int numeroDeRenovacoes) {
        if (numeroDeRenovacoes > 1) {
            return (numeroDeRenovacoes - 1) * 50.0; // 1 é o limite para carros pop e 50 é valor aleatorio de multa
        }
        return 0.0;
    }

}
