import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private boolean especial;
    private int quantEmprestada; //Quantidade que foi emprestada ao usuario
    ArrayList<Publicacoes> EmprestimosDoUsuarios = new ArrayList<Publicacoes>();


    //Construtor de Usuarios
    public Usuario(String nome, String telefone, String email, String cpf, boolean especial) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.especial = especial;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean getEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public int quantEmprestada() {
        return quantEmprestada;
    }

    public void setQuantEmprestada(int quantEmprestada) {
        this.quantEmprestada = quantEmprestada;
    }

    @Override
    public String toString() {
        
        return "y";
    }


}
