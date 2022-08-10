package tests;

import org.junit.Assert;
import org.junit.Test;

import livrariaGama.Livro;
import livrariaGama.Autor;
import static livrariaGama.App.*;

import java.text.ParseException;

public class TesteLivro {

	@Test
	public void testeMostraLivroDoAutor() throws ParseException {

		Autor autor = new Autor("J.K.Rolling", "Brasileira", 32, "f");
		Livro livro = new Livro("Harry Potter", autor, "22/07/2018", 5, "Calice", "");

		// Valida que o metodo retorna o nome do livro correto
		// Assert.assertEquals("Harry Potter",
		// getLivroDoAutor("J.K.Rolling").getTitulo());

	}

	@Test
	public void testeMostraAutorDoLivro() throws ParseException {

		Autor autor = new Autor("J.K.Rolling", "Brasileira", 32, "f");
		Livro livro = new Livro("Harry Potter", autor, "22/07/2018", 5, "Calice", "");

		// Valida que titulo do livro
		Assert.assertEquals("J.K.Rolling", getAutorPeloLivro("Harry Potter"));

	}

}
