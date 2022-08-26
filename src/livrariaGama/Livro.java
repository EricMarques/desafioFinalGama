package livrariaGama;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Livro {

	private String titulo;
	private Date ano;
	private int edicao;
	private String editora;
	private String ISBN;
	private double valor;
	int qntdEmEstoque;
	
	private Autor autor = new Autor();
	Estoque estoque = new Estoque();

	public Livro(String titulo, Autor autor, String ano, int edicao, String editora, String ISBN, double valor)
			throws ParseException {
		this.titulo = titulo;
		this.autor = autor;
		Date Ano = new SimpleDateFormat("dd/MM/yyyy").parse(ano);
		this.ano = Ano;
		this.edicao = edicao;
		this.editora = editora;
		this.ISBN = ISBN;
		this.qntdEmEstoque = estoque.getQntd();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Livro() {

	}

	public Autor getAutor() {
		return this.autor;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getAno() {
		return this.ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public int getEdicao() {
		return this.edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getEditora() {
		return this.editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getNomeAutor(String nome) {
		return this.autor.getNome();
	}


	@Override
	public String toString() {
		// System.out.println("===Livro===");
		return "Titulo = " + getTitulo() +
				"\nAno = " + getAno() +
				"\nEdicao = " + getEdicao() +
				"\nEditora = " + getEditora() +
				"\nISBN = " + getISBN() +
				"\nAutor = " + autor.getNome();
	}
}
