package livrariaGama;

public class Usuario {

    private String nome;
    private long CPF;
    private String telefone;
    private String matricula;

    public Usuario(String nome, int CPF, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.matricula = Math.random() + "";
    }

    public Usuario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void mostrarUsuario() {
        System.out.printf("Nome: %s\nCPF: %d\nTelefone: %s\n" + "Matricula: %s\n", nome, CPF, telefone, matricula);
    }

    @Override
    public String toString() {
        return "Nome = " + getNome() +
                "\nCPF = " + getCPF() +
                "\nTelefone = " + getTelefone();
    }

}