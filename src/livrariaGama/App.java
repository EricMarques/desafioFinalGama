/**
 * @authors:
 * Augustfreitas 
 * marianarusig 
 * EricMarques
 * rickybustillos
 **/
package livrariaGama;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static List<Autor> autores = new ArrayList<Autor>();
	public static List<Livro> livros = new ArrayList<Livro>();

	public static void main(String[] args) throws ParseException {

		initData();

		// Usuario user = new Usuario("Rodrigo", 111_111_111 - 11, "61 99999-9999");
		// Usuario user2 = new Usuario("Eric", 222_222_222 - 22, "61 99999-9999");
		// Usuario user3 = new Usuario("Joao", 333_333_333 - 33, "61 99999-9999");

		// Emprestimo emprestimo = new Emprestimo(livros.get(0), user, 1);
		// System.out.println("++++++++++++++++++");
		// emprestimo.mostrarEmprestimo(0, true);

		getLivroDoAutor("J.K. Rowling");
	}

	public static String getLivroDoAutor(String nomeAutor) {

		// ERRO AQUI: No value present

		// String titulo = livros.stream()
		// .filter(e -> e.getAutor().getNome() == nomeAutor)
		// .findAny()
		// .get()
		// .getTitulo();
		return "erro";
	}

	public static Autor getAutorPeloLivro(String nomeLivro) {
		return autores.stream()
				.filter(e -> e.getNome() == nomeLivro)
				.findFirst()
				.get();
	}

	private static void initData() throws ParseException {
		Autor autor1 = new Autor("J.K. Rolling", "Brasileira", 32, "f");
		Autor autor2 = new Autor("Patati", "Portugûes", 122, "M");
		Autor autor3 = new Autor("D. Pedro I", "Portugûes", 122, "M");

		autores.addAll(Arrays.asList(autor1, autor2, autor3));

		livros.add(new Livro("Harry Potter", autor1, "22/07/2018", 5, "Calice", ""));
		livros.add(new Livro("O Aluno Iluminado", autor2, "01/04/2022", 4, "Patatá", "ABC12344"));
		livros.add(new Livro("Independencia ou Brasil", autor2, "01/07/1980", 1, "Atlas", "EWRT32432)"));
		livros.add(new Livro("Independencia ou Brasil - O retorno", autor3, "01/07/1980", 1, "Atlas",
				"EWRT32432"));
	}

}
