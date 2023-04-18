import java.util.Scanner;

public class Principal {
public static void main(String[] args) {

    int escolha = 0;
    int escolha2 = 0;
    Biblioteca biblioteca = new Biblioteca();
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    Livro livro = null;
    Artigo artigo = null;
    Tese tese = null;

    biblioteca.setNome("BibliotecaIF");
    biblioteca.setEndereco("Rua Da BR");
    
    do{
        menu.menuInicio();
        escolha = sc.nextInt();

        switch (escolha) {
            case 1: // Adicionar Livro
                livro = menu.criarLivro();
                biblioteca.addLivros(livro);
                biblioteca.addPublicacao(livro);
                break;

            case 2: // Adicionar Artigo
                artigo = menu.criarArtigo();
                biblioteca.addArtigos(artigo);
                biblioteca.addPublicacao(tese);
                break;

            case 3: // Adicionar Tese
                tese = menu.criarTese();
                biblioteca.addTeses(tese);
                biblioteca.addPublicacao(tese);
                break;

            case 4: // Adicionar Tese
                biblioteca.addUsuarios(menu.criarUsuario());
                break;

            case 5: // Fazer emprestimo
                biblioteca.addUsuarios(menu.criarUsuario());
                break;
            
            case 7:
                System.out.print("O que gostaria de ver? " +
                                    "\n1- Usuarios" + 
                                    "\n2- LIVROS" + 
                                    "\n3- ARTIGOS" + 
                                    "\n4- TESES---->");
                escolha2 = sc.nextInt();
                if(escolha2 == 1) {
                    biblioteca.mostrarUsuarios();
                }else if(escolha2 == 2) {
                    biblioteca.mostrarLivros();
                }else if(escolha2 == 3) {
                    biblioteca.mostrarArtigos();
                }else if(escolha2 == 4) {
                    biblioteca.mostrarTeses();
                }else{
                    System.out.println("opção invalida!!!");
                }
                
                break;
            case 0:
                break;
        
            default:
                break;
        }
    }while(escolha != 9);

    sc.close();
}



}