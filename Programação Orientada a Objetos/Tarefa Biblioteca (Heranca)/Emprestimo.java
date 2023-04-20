import java.time.LocalDate;

public class Emprestimo {
    private double divida; // calcular aqui o valor da divida total em caso de atraso
    private Usuario usuario;
    private Publicacoes publicacao;
    LocalDate dataDeEmprestimo;
    LocalDate previsaoDeDevolucao;
    LocalDate dataDeDevolução;

    //Construtor de Emprestimos
    public Emprestimo(Usuario usuario, Publicacoes publicacao, LocalDate dataDeEmprestimo, LocalDate previsaoDeDevolucao){
        this.usuario = usuario;
        this.publicacao = publicacao;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.previsaoDeDevolucao = previsaoDeDevolucao;
    }

    public void confirmaDevolucao(LocalDate dataDeDevolucao) { //Este metodo é chamado para armazenar a data de devolução para fins de calculos de dividas.
        this.dataDeDevolução = dataDeDevolucao;
    }



    public double calcularDivida(){ //Metodo para calcular divida.
        if(dataDeDevolução.isAfter(previsaoDeDevolucao)){
            long atraso = dataDeDevolução.getDayOfYear() - previsaoDeDevolucao.getDayOfYear();
            return atraso * publicacao.getMulta();
        }else{
            return 0;
        }

    }



    

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    


}
