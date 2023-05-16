public class Popular extends Veiculo {

    // Atributos
    private boolean hasArCondicionado;

    // COnstrutor
    public Popular(String marca, String modelo, String placa, int ano, double valorDaLocacao,
            boolean hasArCondicionado) {
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

}
