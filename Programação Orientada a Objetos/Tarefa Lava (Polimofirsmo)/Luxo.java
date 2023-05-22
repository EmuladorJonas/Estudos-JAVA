public class Luxo extends Veiculo {

    // Atributos
    private int qntAirsBags;
    private String tamanhoPortaMalas;
    private boolean hasGps;
    

    // Construtor
    public Luxo(String marca, String modelo, String placa, int ano, double valorDaLocacao, int qntAirBags, String tamanhoPortaMalas, boolean hasGps) {
        super(marca, modelo, placa, ano, valorDaLocacao);
        this.qntAirsBags = qntAirBags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.hasGps = hasGps;
    }

    // Getters & Setters
    public int getQntAirsBags() {
        return qntAirsBags;
    }

    public void setQntAirsBags(int qntAirsBags) {
        this.qntAirsBags = qntAirsBags;
    }

    public String getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(String tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public boolean isHasGps() {
        return hasGps;
    }

    public void setHasGps(boolean hasGps) {
        this.hasGps = hasGps;
    }

    public double calcularMulta(int numeroRenovacoes) {
        if( numeroRenovacoes > 5) {
            return (numeroRenovacoes - 5) * 100.0;
        }
        return 0.0;
    }
}
