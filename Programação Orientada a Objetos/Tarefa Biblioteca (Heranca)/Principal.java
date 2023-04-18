import java.util.Scanner;

public class Principal {
public static void main(String[] args) {

    int escolha = 0;
    int escolha2 = 0;
    Biblioteca biblioteca = new Biblioteca();
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);

    biblioteca.setNome("BibliotecaIF");
    biblioteca.setEndereco("Rua Da BR");
    
    do{
        menu.menuInicio();
        escolha = sc.nextInt();

        switch (escolha) {
            case 1: // Adicionar Livro
                biblioteca.addLivros(menu.criarLivro());
                break;

            case 2: // Adicionar Artigo
                biblioteca.addArtigos(menu.criarArtigo());
                break;

            case 3: // Adicionar Tese
                biblioteca.addTeses(menu.criarTese());
                break;

            case 4: // Adicionar Tese
                biblioteca.addTeses(menu.criarTese());
                break;
            
            case 7:
                System.out.print("O que gostaria de ver? " +
                                    "\n1- LIVROS" + 
                                    "\n2- ARTIGOS" + 
                                    "\n3- TESES---->");
                escolha2 = sc.nextInt();
                if(escolha2 == 1) {
                    biblioteca.mostrarLivros();
                }else if(escolha2 == 2) {
                    biblioteca.mostrarArtigos();
                }else if(escolha2 == 3) {
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