import java.util.ArrayList;

public class Livro extends Publicacoes {

    private int nroEdicao;
    private String nomeEditora;
    private String isbn;
    private ArrayList<Autor> refAutores = new ArrayList<Autor>();

    //Contrutor para Livros
    public Livro(String autor, String dataPublic, String titulo, boolean emprestado, double multa, int nroEdicao, String nomeEditora, String isbn) {
        super(autor, dataPublic, titulo, emprestado, multa);
        this.nroEdicao = nroEdicao;
        this.nomeEditora = nomeEditora;
        this.isbn = isbn;
    }
    
    public int getNroEdicao() {
        return nroEdicao;
    }

    public void setNroEdicao(int nroEdicao) {
        this.nroEdicao = nroEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public ArrayList<Autor> getRefAutores() {
        return refAutores;
    }

    public void setRefAutores(ArrayList<Autor> refAutores) {
        this.refAutores = refAutores;
    }

    public void addAutor(Autor autor) {
        this.refAutores.add(autor); //Para adicionar mais autores na lista.
    }

}
