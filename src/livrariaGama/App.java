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
import java.util.stream.Collector;
import java.util.stream.Stream;

public class App {

	public static List<Autor> autores = new ArrayList<Autor>();
	public static List<Livro> livros = new ArrayList<Livro>();

	public static void main(String[] args) throws ParseException {

		initData();


		getLivroDoAutor("Patati");
		//getAutorPeloLivro("Harry Potter");

	}

	// Refatorar codigo com o professor
	public static String getLivroDoAutor(String nomeAutor) {
		List<Livro> livro = new ArrayList<>();
		//String titulos = "";
		livro.addAll(livros);
		livro.stream().filter(i -> i.getAutor().getNome() == nomeAutor).forEach(
				i -> System.out.println("Os livros cadastrados do autor " + nomeAutor + " são: \n" + i.getTitulo()));

				return livro.get(0).getTitulo();
	}

	public static String getAutorPeloLivro(String nomeLivro) {
		List<Livro> livro = new ArrayList<>();
		livro.addAll(livros);
		livro.stream().filter(i -> i.getTitulo() == nomeLivro).forEach(
				i -> System.out.println(
						"Os livros cadastrados do autor de " + nomeLivro + " são: \n" + i.getAutor().getNome()));
		return livro.toString();
	}

	public static void initData() throws ParseException {
		Autor autor1 = new Autor("J.K. Rolling", "Brasileira", 32, "f");
		Autor autor2 = new Autor("Patati", "Portugûes", 122, "M");
		Autor autor3 = new Autor("D. Pedro I", "Portugûes", 122, "M");

		autores.addAll(Arrays.asList(autor1, autor2, autor3));

		livros.add(new Livro("Harry Potter", autor1, "22/07/2018", 5, "Calice", ""));
		livros.add(new Livro("O Aluno Iluminado", autor2, "01/04/2022", 4, "Patatá", "ABC12344"));
		livros.add(new Livro("Independencia ou Brasil", autor2, "01/07/1980", 1, "Atlas", "EWRT32432)"));
		livros.add(new Livro("Independencia ou Brasil - O retorno", autor3, "01/07/1980", 1, "Atlas", "EWRT32432"));
	}

}
