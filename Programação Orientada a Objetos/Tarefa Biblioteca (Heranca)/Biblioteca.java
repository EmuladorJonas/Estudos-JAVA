import java.util.ArrayList;

public class Biblioteca {
    
    private String nome;
    private String endereco;

    ArrayList<Publicacoes> publicacoes = new ArrayList<Publicacoes>();
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Artigo> artigos = new ArrayList<Artigo>();
    ArrayList<Tese> teses = new ArrayList<Tese>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void addPublicacao(Publicacoes publicacao) {
        this.publicacoes.add(publicacao);
    }

    public void addLivros(Livro livro) {
        this.livros.add(livro);
    }

    public void addArtigos(Artigo artigo) {
        this.artigos.add(artigo);
    }

    public void addTeses(Tese tese) {
        this.teses.add(tese);
    }

    public void addUsuarios(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    

    public Publicacoes VerificaPublicacao(String nomePublicacao) {
        for (Publicacoes publicacao : publicacoes) {
            if(publicacao.getTitulo().equals(nomePublicacao) && publicacao.getEmprestado() == false) {
                publicacao.setEmprestado(true);  
                return publicacao;
            }    
        }
        return null;
    }


    public Usuario verificaUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if(usuario.getNome().equals(nome) && usuario.quantEmprestada() <= usuario.limiteDeEmprestimos()) {  
                return usuario;
            }    
        }
        return null;
    }

    public Publicacoes BuscaPublicacao(String nomePublicacao) {
        for (Publicacoes publicacao : publicacoes) {
            if(publicacao.getTitulo().equals(nomePublicacao)) {
                publicacao.setEmprestado(false);  
                return publicacao;
            }    
        }
        return null;
    }

    public Usuario BuscaUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if(usuario.getNome().equals(nome)) {  
                return usuario;
            }    
        }
        return null;
    }




    public void mostrarLivros(){
        System.out.println("Catalogo de LIVROS "+ this.nome +": ");
        for(int x = 0; x < this.livros.size(); x++){
            System.out.println("************************");
            System.out.println(x+1 + ". \n" + 
            "TITULO: " + this.livros.get(x).getTitulo() +
            "\nAUTOR: " +this.livros.get(x).getAutor() +
            "\nDATA DA PUBLICAÇÃO: " +this.livros.get(x).getDataPublic() +
            "\nEDIÇÃO: " +this.livros.get(x).getNroEdicao() +
            "\nEDITORA: " +this.livros.get(x).getNomeEditora() +
            "\nISBN: " +this.livros.get(x).getIsbn()
            );
            System.out.println("************************");
        }
    }

    public void mostrarArtigos(){
        System.out.println("Catalogo de ARTIGOS "+ this.nome +": ");
        for(int x = 0; x < this.artigos.size(); x++){
            System.out.println("************************");
            System.out.println(x+1 + ". \n" + 
            "TITULO: " + this.artigos.get(x).getTitulo() +
            "\nAUTOR: " +this.artigos.get(x).getAutor() +
            "\nDATA DA PUBLICAÇÃO: " +this.artigos.get(x).getDataPublic() +
            "\nRESUMO: " +this.artigos.get(x).getResumo()
            );
            System.out.println("************************");
        }
    }

    public void mostrarTeses(){
        System.out.println("Catalogo de TESES "+ this.nome +": ");
        for(int x = 0; x < this.artigos.size(); x++){
            System.out.println("************************");
            System.out.println(x+1 + ". \n" + 
            "TITULO: " + this.teses.get(x).getTitulo() +
            "\nAUTOR: " +this.teses.get(x).getAutor() +
            "\nDATA DA PUBLICAÇÃO: " +this.teses.get(x).getDataPublic() +
            "\nRESUMO: " +this.teses.get(x).getResumo() +
            "\nPAGINAS: " +this.teses.get(x).getNroPaginas() +
            "\nDATA DE DEFESA: " +this.teses.get(x).getDataDefesa() +
            "\nINSTITUIÇÃO DE DEFESA: " +this.teses.get(x).getInstitutoDefesa()
            );
            System.out.println("************************");
        }
    }

    public void mostrarUsuarios() { //String nome, String telefone, String email, String cpf, boolean especial
        System.out.println("Lista de Usuarios "+ this.nome +": ");
        for(int x = 0; x < this.usuarios.size(); x++){
            System.out.println("************************");
            System.out.println(x+1 + ". \n" + 
            "NOME: " + this.usuarios.get(x).getNome() +
            "\nTELEFONE: " +this.usuarios.get(x).getTelefone() +
            "\nEMAIL: " +this.usuarios.get(x).getEmail() +
            "\nCPF: " +this.usuarios.get(x).getCpf()
            );
            System.out.println("************************");
        }
    }

    
    public String toString() {
        return "\n**********DADOS BIBLIOTECA**********"+
           "\n\nNOME: " +this.getNome()+
           "\nEndereco: " +this.getEndereco()+
           "\n\n********************\n";
    }


}
