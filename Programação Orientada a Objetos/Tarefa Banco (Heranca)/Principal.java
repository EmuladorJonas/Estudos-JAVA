import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    MenuDados menu = new MenuDados();
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Conta> contas = new ArrayList<>(); // Lista para as contas
    contas = new ArrayList<Conta>(); // Instanciado a lista de contas

    int escolha = 0; // Primeira escolha da *Area Banco*
    int escolha2 = 0; 
    int numConta; // Escolha nro da conta para as operações.
    double valor; // Valores para as operações.
    String nome; // Entrada apenas da classe Main
    String cpf; // Entrada apenas da classe Main
    String cnpj; // Entrada apenas da classe Main
    String telefone; // Entrada apenas da classe Main
    String endereco; // Entrada apenas da classe Main

    while(escolha != 7){ // Para repetir enquando não houver o comando de sair

      escolha = menu.Menu();

      if (escolha == 1) {
        System.out.println("\n*****Criar Conta*****");
        System.out.println("Informe o tipo da conta: ");
        System.out.println("\n1- Conta Corrente\n2- Conta Especial\n3- Conta Poupança\n4- Conta Empresarial");
        escolha2 = sc.nextInt();

        System.out.println("------------Criar Conta------------");
        nome = menu.lerNome();
        endereco = menu.lerEndereco();
        telefone = menu.lerTelefone();
        System.out.println("------------------------");
  
          
        if (escolha2 == 1){
          cpf = menu.lerCpf();
          Cliente cliente = new Cliente(nome,cpf, " ", endereco, telefone);
          Conta conta = new ContaCorrente(cliente);
          contas.add(conta);
          System.out.println("*****CONTA CC CRIADA*****\n");

        }else if (escolha2 == 2){

          cpf = menu.lerCpf();
  
          Cliente cliente = new Cliente(nome,cpf, " ", endereco, telefone);
          Conta conta = new ContaEspecial(cliente, 2000);
          contas.add(conta);
          System.out.println("*****CONTA CE CRIADA*****\n");

        }else if (escolha2 == 3){

          cpf = menu.lerCpf();
  
          Cliente cliente = new Cliente(nome,cpf, " ", endereco, telefone);
          Conta conta = new ContaPoupanca(cliente);
          contas.add(conta);
          System.out.println("*****CONTA CP CRIADA*****\n");

        }else if (escolha2 == 4) {
         
          cnpj = menu.lerCnpj();
  
          Cliente cliente = new Cliente(nome, " ", cnpj, endereco, telefone);
          Conta conta = new ContaEmpresarial(cliente, 2000);
  
          contas.add(conta);
          System.out.println("*****CONTA CE CRIADA*****\n");
        }else {
          System.out.println("*****OPÇAO INVALIDA*****");
          System.exit(0); //Finaliza o programa caso o mongol selecione uma opção invalida
        }
        
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

      if(escolha == 6){
        contas.forEach(
          conta -> conta.rendimento()
        );
      }

      if (escolha == 7) {
        System.out.println("*****VALEU*****FALOU*****");
        System.exit(0);
      }

    }

    sc.close();
  }
}
