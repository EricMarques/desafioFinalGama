package livrariaGama;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {

	private String titulo;
	//private String autor;
	private Date ano;
	private int edicao;
	private String editora;
	private String ISBN;

	Autor autor = new Autor();

	public Livro(String titulo, Autor autor, String ano, int edicao, String editora, String ISBN) throws ParseException {
		this.titulo = titulo;
		this.autor = autor;
		Date Ano = new SimpleDateFormat("dd/MM/yyyy").parse(ano);
		this.ano = Ano;
		this.edicao = edicao;
		this.editora = editora;
		this.ISBN = ISBN;
	}

	public Livro() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void mostraAutor(String autorLido){

	}

	@Override
	public String toString() {
		System.out.println("===Livro===");
		return 	"Titulo = " + getTitulo() + 
			   	"\nAno = " + getAno() + 
				"\nEdicao = " + getEdicao() + 
				"\nEditora = " + getEditora() +
				"\nISBN = " + getISBN() +
				"\nAutor = " + autor.getNome();
	}
}