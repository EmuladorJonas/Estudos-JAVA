
public class Tese extends Publicacoes {
    private int nroPaginas;
    private String dataDefesa;
    private String institutoDefesa;

    //Contrutor Teses
    public Tese(String autor, String dataPublic, String titulo, String resumo, Boolean emprestado, double multa, int nroPaginas, String dataDef, String institutoDefesa) {
        super(autor, dataPublic, titulo, resumo, emprestado, multa);
        this.nroPaginas = nroPaginas;
        this.dataDefesa = dataDef;
        this.institutoDefesa = institutoDefesa;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstitutoDefesa() {
        return institutoDefesa;
    }

    public void setInstitutoDefesa(String institutoDefesa) {
        this.institutoDefesa = institutoDefesa;
    }

}
