import java.util.ArrayList;

abstract class Publicacoes {
    
    private String autor;
    private String dataPublic;
    private String titulo;
    private String resumo = " ";
    private boolean emprestado; //Set "true" caso a publicação for emprestada
    private double multa; // valor da multa (o esxercicio pede um valor diferenter para cada pub)
    private double divida; // calcular aqui o valor da divida total em caso de atraso
    private ArrayList<Publicacoes> refPublicacoes = new ArrayList<Publicacoes>(); //Lista para referência de outras publicações
     //Lista para referência dos autores

    //Construtor de Publicações
    public Publicacoes(String autor, String dataPublic, String titulo, String resumo,  Boolean emprestado, double multa) { //Contrutor Artigo
        this.autor = autor;
        this.dataPublic = dataPublic;
        this.titulo = titulo;
        this.resumo = resumo;
        this.emprestado = false; // Por padrão, qualquer publicação nova ainda não está emprestada
        this.multa = multa;
    }
    
    public Publicacoes(String autor, String dataPublic, String titulo, Boolean emprestado, double multa) { //Contrutor para livros
        this.autor = autor;
        this.dataPublic = dataPublic;
        this.titulo = titulo;
        this.emprestado = false; // Por padrão, qualquer publicação nova ainda não está emprestada
        this.multa = multa;
    }

    public String getDataPublic() {
        return dataPublic;
    }

    public void setDataPublic(String dataPublic) {
        this.dataPublic = dataPublic;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    
    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public ArrayList<Publicacoes> getRefPublicacoes() {
        return refPublicacoes;
    }

    public void setRefPublicacoes(ArrayList<Publicacoes> refPublicacoes) {
        this.refPublicacoes = refPublicacoes;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
