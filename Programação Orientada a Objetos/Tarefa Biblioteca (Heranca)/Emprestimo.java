import java.time.LocalDate;

public class Emprestimo {
    private double divida; // calcular aqui o valor da divida total em caso de atraso
    private Usuario usuario;
    private Publicacoes publicacao;
    LocalDate dataDeEmprestimo;

    public Emprestimo(Usuario usuario, Publicacoes publicacao, LocalDate dataDeEmprestimo){
        this.usuario = usuario;
        this.publicacao = publicacao;
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    


}
