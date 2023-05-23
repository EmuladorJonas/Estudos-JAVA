import java.util.ArrayList;

public class Locadora {

    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Veiculo> veiculosDisponiveis;
    private ArrayList<Cliente> clientes;
    private ArrayList<Emprestimo> listaEmprestimos;

    // Construtor
    public Locadora(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.veiculosDisponiveis = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.listaEmprestimos = new ArrayList<>();
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Veiculo> getVeiculosDisponiveis() {
        return veiculosDisponiveis;
    }

    public void setVeiculosDisponiveis(ArrayList<Veiculo> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void SetClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return listaEmprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    // Metodos

    public void adicionarVeiculoDisponivel(Veiculo veiculo) {
        veiculosDisponiveis.add(veiculo);
    }

    public void removerVeiculoDisponivel(Veiculo veiculo) {
        veiculosDisponiveis.remove(veiculo);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void adicionarEmprestimos(Emprestimo emprestimo) {
        listaEmprestimos.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        listaEmprestimos.remove(emprestimo);
    }

    /*Verificação generica para Emprestimo.
    Só vai ser usada se tratando de ClientePessoaFisica*/
    private boolean possuiEmprestimo(ClientePessoaFisica cliente) {
        for (Emprestimo emprestimo : listaEmprestimos) {
            if (emprestimo.getCliente() instanceof ClientePessoaFisica) {
                ClientePessoaFisica clienteEmprestimo = (ClientePessoaFisica) emprestimo.getCliente();
                if (clienteEmprestimo.equals(cliente)) {
                    return true;
                }
            }
        }
        return false;
    }

    
     /*Metodo de ralização de emprestimos. todas as verificações necessáriasestão
     sendo feitas de uma vez só para evitar criar varios métodos.
     */

    public void realizarEmprestimo (Cliente cliente, Veiculo veiculo) throws CarroNaoDisponivelException, ClienteNaoPodeAlugarException {
        //Verifica se o veiculo está disponivel
        if (!veiculosDisponiveis.contains(veiculo)) {
            throw new CarroNaoDisponivelException("O Caarro não está disponível!!!");
            }
            //Verifica se a pessoaFisica já possui emprestimo
            if(cliente instanceof ClientePessoaFisica){
                ClientePessoaFisica pessoaFisica = (ClientePessoaFisica) cliente;
                if(possuiEmprestimo(pessoaFisica)) {
                    throw new ClienteNaoPodeAlugarException("Esssa pessoa já possui um emprestimo!!");
                }
            }
        //Cria o objeto emprestimo e adiciona na listaEmprestimos
        Emprestimo emprestimo = new Emprestimo(cliente, veiculo);
        listaEmprestimos.add(emprestimo);

        //Remove o veiculo da lista de disponiveis
        veiculosDisponiveis.remove(veiculo);
        System.out.println("Emprestimo Realizado!!!");
    }

    /*Método de devoluçaõ. Irá fazer os calculos de multa com base
      nos metodos referentes a valorTotal e valorLocacao da classe generia Veiculo! 
     */
    public void devolucao(Emprestimo emprestimo) {
        //Calculando valores totais
        double valorTotal = emprestimo.getVeiculo().valorTotal(emprestimo.getQtdRenovacoes());
        System.out.println("Valor total (incluido possiveis multas): R$" + valorTotal);

        //Remover o objeto Emprestimo da lista
        listaEmprestimos.remove(emprestimo);

        //Retorna o carro pra lista de disponiveis
        veiculosDisponiveis.add(emprestimo.getVeiculo());
        System.out.println("Devolução Finalizada!!!");
    }


}