package tests;

import org.junit.Assert;
import org.junit.Test;

import livrariaGama.Livro;
import static livrariaGama.App.*;

import livrariaGama.App;
import livrariaGama.Autor;
import static livrariaGama.Livro.*;
import static org.junit.Assert.assertEquals;

import java.text.ParseException;

public class TesteLivro {

	@Test
	public void testeMostraLivroDoAutor() throws ParseException {
		// Instancia dos livros e autores
		initData();

		// Valida que o metodo retorna o nome do livro correto
		assertEquals(livros.get(0).getTitulo(), getLivroDoAutor("J.K. Rolling"));

	}

	@Test
	public void testeMostraAutorDoLivro() throws ParseException {
		// Instancia dos livros e autores
		initData();

		// Valida que titulo do livro
		// Assert.assertEquals("J.K. Rolling", getAutorPeloLivro("Harry Potter"));

	}

	@Test
	public void testeLivro() throws ParseException {
		initData();
		assertEquals("Harry Potter", livros.get(0).getTitulo());
	}

}
