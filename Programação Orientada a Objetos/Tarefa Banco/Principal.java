import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Titular> titulares = new ArrayList<>();
    ArrayList<Conta> contas = new ArrayList<>(); // Lista para as contas
    contas = new ArrayList<Conta>(); // Instanciado a lista de contas

    int escolha = 0; // Primeira escolha da *Area Banco*
    int numConta; // Escolha nro da conta para as operações.
    double valor; // Valores para as operações.
    String nome; // Entrada apenas da classe Main
    String cpf; // Entrada apenas da classe Main
    String telefone; // Entrada apenas da classe Main
    String endereco; // Entrada apenas da classe Main

    do { // Para repetir enquando não houver o comando de sair

      System.out.println("\n*****Area Banco*****");
      System.out.println("------------------------");
      System.out.println("1- Criar Conta"); // PS. O NRO DA CONTA É A ORDEM DE CRIAÇÃO. A PRIMEIRA CONTA SERA A CONTA
                                            // NRO 1 E ASSIM POR DIANTE!!!!
      System.out.println("2- Exibir Dados da conta");
      System.out.println("3- Sacar");
      System.out.println("4- Depositar");
      System.out.println("5- Transferir");
      System.out.println("6- Sair");
      System.out.println("------------------------");
      escolha = sc.nextInt();

      if (escolha == 1) {
        System.out.println("\n*****Criar Conta*****");
        System.out.println("------------------------");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        nome = sc.nextLine();
        System.out.print("CPF: ");
        cpf = sc.nextLine();
        System.out.print("Endereco: ");
        endereco = sc.nextLine();
        System.out.print("Telefone: ");
        telefone = sc.nextLine();
        System.out.println("------------------------");

        Titular titular = new Titular(nome, cpf, endereco, telefone);
        Conta conta = new Conta(titular);

        contas.add(conta);
        System.out.println("*****CONTA CRIADA*****\n");
      }

      if (escolha == 2) {
        System.out.print("Informe o Numero da conta para EXTRATO: ");
        numConta = sc.nextInt() - 1; // Esse -1 é para o numero digitado combinar com a posição da aray que considera
                                     // o 0 com posição!!!
        Conta conta = contas.get(numConta);
        System.out.println(conta);

      }

      if (escolha == 3) {
        System.out.print("Informe o Numero da conta para SAQUE: ");
        numConta = sc.nextInt() - 1; // Esse -1 é para o numero digitado combinar com a posição da aray que considera
                                     // o 0 com posição!!!
        Conta conta = contas.get(numConta);
        System.out.print("Informe o valor: R$");
        valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println("************\n");
      }

      if (escolha == 4) {
        System.out.print("Informe o Numero da conta para DEPOSITO: ");
        numConta = sc.nextInt() - 1; // Esse -1 é para o numero digitado combinar com a posição da aray que considera
                                     // o 0 com posição!!!
        Conta conta = contas.get(numConta);
        System.out.print("Informe o valor: R$");
        valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println("************\n");
      }

      if (escolha == 5) {
        System.out.print("Informe o Numero da conta para qual será TRANSFERIDO o dinheiro: ");
        numConta = sc.nextInt() - 1; // Esse -1 é para o numero digitado combinar com a posição da aray que considera
                                     // o 0 com posição!!!
        Conta conta = contas.get(numConta);
        System.out.print("Informe o valor: R$");
        valor = sc.nextDouble();
        conta.transferir(valor, conta);
        System.out.println("************\n");
      }

      if (escolha == 6) {
        System.out.println("*****VALEU*****FALOU*****");
        System.exit(0);
      }

    } while (escolha != 1 || escolha != 2 || escolha != 3 || escolha != 4 || escolha != 5 || escolha != 6); // Para
                                                                                                            // repetir
                                                                                                            // enquando
                                                                                                            // não
                                                                                                            // houver o
                                                                                                            // comando
                                                                                                            // de sair

    sc.close();
  }
}
