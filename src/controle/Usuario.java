package controle;

public class Usuario {
    private final String email;
    private final String senha;
    private String cpf;
    private String nome;
    //private String sintomas;

    public Usuario(String newEmail, String newSenha) {
        this.email = newEmail;
        this.senha = newSenha;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    /*
    public String getSintomas() {
        return this.sintomas;
    }

     */

    public void setCpf(String newCpf) {
        this.cpf = newCpf;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    /*
    public void setSintomas(String newSintomas) {
        this.sintomas = newSintomas;
    }

     */
}
