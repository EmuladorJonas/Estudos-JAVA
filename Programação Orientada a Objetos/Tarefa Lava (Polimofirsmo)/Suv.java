public class Suv extends Veiculo {

    // Atributos
    private String tamanhoPortaMalas;
    private String tipoDeTracao;
    private String tipoDeCombustivel;

    // Construtor
    public Suv(String marca, String modelo, String placa, int ano, double valorDaLocacao, String tamanhoPortaMalas, String tipoDeTracao, String tipoDeCombustivel) {
        super(marca, modelo, placa, ano, valorDaLocacao);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipoDeTracao = tipoDeTracao;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    // Getters & Setters
    public String getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(String tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public String getTipoDeTracao() {
        return tipoDeTracao;
    }

    public void setTipoDeTracao(String tipoDeTracao) {
        this.tipoDeTracao = tipoDeTracao;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public double calcularMulta(int numeroRenovacoes) {
        if( numeroRenovacoes > 3) {
            return (numeroRenovacoes - 3) * 100.0;
        }
        return 0.0;
    }

}
