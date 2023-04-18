import java.util.Scanner;

public class MenuDados {
    private Scanner scanner;

    public int Menu() {
        System.out.println("\n*****Area Banco*****");
        System.out.println("------------------------");
        System.out.println("1- Criar Conta"); // PS. O NRO DA CONTA É A ORDEM DE CRIAÇÃO. A PRIMEIRA CONTA SERA A CONTA
                                              // NRO 1 E ASSIM POR DIANTE!!!!
        System.out.println("2- Exibir Dados da conta");
        System.out.println("3- Sacar");
        System.out.println("4- Depositar");
        System.out.println("5- Transferir");
        System.out.println("6- Rende (Aplica operação de rendimento)");
        System.out.println("7- Sair");
        System.out.println("------------------------");
        return scanner.nextInt();
    }

    public MenuDados() {
        scanner = new Scanner(System.in);
    }

    public String lerNome() {
        System.out.print("Nome: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String lerCpf() {
        System.out.print("CPF: ");
        return scanner.nextLine();
    }

    public String lerEndereco() {
        System.out.print("Endereço: ");
        return scanner.nextLine();
    }

    public String lerTelefone() {
        System.out.print("Telefone: ");
        return scanner.nextLine();
    }

    public String lerCnpj() {
        System.out.print("CNPJ: ");
        return scanner.nextLine();
    }

}
