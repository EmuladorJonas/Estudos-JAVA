import java.util.Scanner;

public class Menu {
    String titulo;
    String dataPub; // Não achei necessário usar a biblioteca de datas do java, já que não é necessário nenhuma operação com a data de criação da Public.
    String autor;
    int nroEdicao;
    double valorMulta;
    String nomeEditora;
    String isbn;
    String dataDef;
    String resumo;
    String instDef;
    boolean emprestado;
    int nroPaginas;
    String nome;
    String telefone;
    String email;
    String cpf;
    boolean especial;
    int quantEmprestada;
    int limiteDeEmprestimos;
    Scanner sc = new Scanner(System.in);
    int escolhaEspecial;


    public void menuInicio() { //Mrtodo para o menu inicial
        System.out.println("\n*****MENU*****");
        System.out.println(
            "1 - Adicionar Livro\n"  +
            "2 - Adicionar Artigo\n"  +
            "3 - Adicionar Tese\n"  +
            "4 - Criar Usuario\n" +
            "5 - Fazer Emprestimo\n"+
            "6 - Fazer Devolução\n" +
            "7 - Listar Acervo\n" +
            "0 - Sair --->  "
        );
    }

    public Livro criarLivro() { //Metodo para Criar livro
        
        System.out.println("\n*****ADICIONAR LIVRO*****");
        System.out.print("AUTOR: ");
        autor =sc.nextLine();
        System.out.print("DATA DE PUBLICAÇÃO: ");
        dataPub = sc.nextLine();
        System.out.print("TITULO: ");
        titulo = sc.nextLine();
        emprestado = false;
        System.out.print("VALOR DA MULTA: ");
        valorMulta = sc.nextDouble();
        System.out.print("NUMERO DA EDIÇÃO: ");
        nroEdicao = sc.nextInt();
        System.out.print("EDITORA: ");
        sc.next();
        nomeEditora = sc.nextLine();
        System.out.print("ISBN: ");
        isbn = sc.nextLine();
        System.out.println("************************");
        
        Livro livro = new Livro(autor, dataPub, titulo, emprestado, valorMulta, nroEdicao, nomeEditora, isbn);
        return livro;
    }
    
    public Artigo criarArtigo() { //Metodo para Criar Artigo
        
        System.out.println("\n*****ADICIONAR ARTIGO*****");
        System.out.print("AUTOR: ");
        autor =sc.nextLine();
        System.out.print("DATA DE PUBLICAÇÃO: ");
        dataPub = sc.nextLine();
        System.out.print("TITULO: ");
        titulo = sc.nextLine();
        System.out.print("RESUMO: ");
        resumo = sc.nextLine();
        emprestado = false;
        System.out.print("MULTA: ");
        valorMulta = sc.nextDouble();
        System.out.println("************************");

        Artigo artigo = new Artigo(autor, dataPub, titulo, resumo, emprestado, valorMulta);
        return artigo;
    }
    
    public Tese criarTese() { //Metodo para Criar Tese
        
        System.out.println("\n*****ADICIONAR TESE*****");
        System.out.print("AUTOR: ");
        autor =sc.nextLine();
        System.out.print("DATA DE PUBLICAÇÃO: ");
        dataPub = sc.nextLine();
        System.out.print("DATA DE DEFESA: ");
        dataDef = sc.nextLine();
        System.out.print("INSTITUIÇÃO DE DEFESA: ");
        instDef = sc.nextLine();
        System.out.print("TITULO: ");
        titulo = sc.nextLine();
        System.out.print("RESUMO: ");
        resumo = sc.nextLine();
        System.out.print("NRO PAGINAS: ");
        nroPaginas = sc.nextInt();
        emprestado = false;
        System.out.print("MULTA: ");
        valorMulta = sc.nextDouble();
        System.out.println("************************");

        Tese tese = new Tese(autor, dataPub, titulo, resumo, emprestado, valorMulta, nroPaginas, dataDef, instDef);
        return tese;
    }

    public Usuario criarUsuario() { //Metodo para Criar Usuario

        System.out.println("\n*****ADICIONAR USUARIO*****");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Telefone: ");
        telefone = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("CPF: ");
        cpf = sc.nextLine();
        System.out.print("Especial?  1.SIM    2.NÃO ");
        escolhaEspecial = sc.nextInt();
        quantEmprestada = 0;
        if(escolhaEspecial == 1){
            especial = true;
            limiteDeEmprestimos = 1000;

        }else if(escolhaEspecial == 2){
            especial = false;
            limiteDeEmprestimos =1;
        }else{
            System.out.println("ERRO DE OPÇÃO!!! SAINDO!!!");
        }

        Usuario usuario = new Usuario(nome, telefone, email, cpf, especial, quantEmprestada, limiteDeEmprestimos );
        return usuario;
    }
    



}
