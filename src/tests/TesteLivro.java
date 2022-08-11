package tests;

import org.junit.Assert;
import org.junit.Test;

import livrariaGama.Livro;
import static livrariaGama.App.*;
import livrariaGama.Autor;
import static livrariaGama.Livro.*;

import java.text.ParseException;

public class TesteLivro {

	@Test
	public void testeMostraLivroDoAutor() throws ParseException {
		// Instancia dos livros e autores
		initData();
		
		// Valida que o metodo retorna o nome do livro correto
		Assert.assertEquals("Harry Potter", getLivroDoAutor("J.K. Rolling"));

	}

	@Test
	public void testeMostraAutorDoLivro() throws ParseException {
		// Instancia dos livros e autores
		initData();

		// Valida que titulo do livro
		Assert.assertEquals("J.K. Rolling", getAutorPeloLivro("Harry Potter"));

	}

}
