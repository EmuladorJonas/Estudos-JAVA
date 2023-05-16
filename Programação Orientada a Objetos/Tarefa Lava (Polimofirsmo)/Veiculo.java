public abstract class Veiculo {

    // Atributos
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valorDaLocacao;

    // Construtor
    public Veiculo(String marca, String modelo, String placa, int ano, double valorDaLocacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorDaLocacao = valorDaLocacao;
    }

    // Getters & Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorDaLocacao() {
        return valorDaLocacao;
    }

    public void setValorDaLocacao(double valorDaLocacao) {
        this.valorDaLocacao = valorDaLocacao;
    }

}
