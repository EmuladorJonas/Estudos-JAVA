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
        this.veiculosDisponiveis = new ArrayList<Veiculo>();
        this.clientes = new ArrayList<Cliente>();
        this.listaEmprestimos = new ArrayList<Emprestimo>();
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getendereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone(String telefone) {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Veiculo> getCarrosDisponiveis(ArrayList<Veiculo> carrosDisponiveis) {
        return carrosDisponiveis;
    }

    public void setCarrosDisponiveis(ArrayList<Veiculo> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public ArrayList<Cliente> getClientes(ArrayList<Cliente> clientes) {
        return clientes;
    }

    public void SetClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Emprestimo> getEmprestimos(ArrayList<Emprestimo> listaEmprestimos) {
        return listaEmprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    // Metodos

    public boolean realizarEmprestimo(Locacao locacao, Locator locator) {
            //Verifica (caso Pessoa Fisica, se já tem emprestimo)
            for (Emprestimo emprestimo : listaEmprestimos) {
                if (emprestimo.getLocator() == locator) {
                    System.out.println("ERRO!!! Essa pessoa já realizou um emprestimo");
                    return false;
                }
            }

        Emprestimo emprestimo = new Emprestimo(locacao, locator);
        listaEmprestimos.add(emprestimo);
        System.out.println("Emprestimo Realizado!!!");
        return true;
    }


}