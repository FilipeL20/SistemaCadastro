
public class usuario {//classe do usuario

    private static int contador = 1;
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private String cpf;

    public usuario(String nome, String email, String cpf, String dataNascimento, String senha) {//método constructor
        this.id = contador++;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;


    }

    public int getId() {//usar get para poder acessar metodos privados de uma classe(nesse caso usuario)
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
