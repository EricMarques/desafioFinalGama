package livrariaGama;

public class Autor {
    private String nome;
    private String nacionalidade;
    private int idade;
    private String sexo;

    //Livro livro = new Livro();

    public Autor() {
    }

    public Autor(String nome, String nacionalidade, int idade, String sexo) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        if (sexo == "F" || sexo == "f"){
            return "Feminino";
        }
        return "Masculino";
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /*public void mostraLivro(String livro){
        System.out.println(this.livro.getTitulo());
    }*/

    @Override
    public String toString() {
        System.out.println("===Autor===");
        return  "Nome = " + getNome() +
                "\nNacionalidade = " + getNacionalidade() +
                "\nIdade = " + getIdade() +
                "\nSexo = " + getSexo();
    }
}
