package tests;

import static livrariaGama.App.getLivroDoAutor;
import static livrariaGama.App.initData;
import static livrariaGama.App.estoque;
import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

public class TesteLivro {

	@Test
	public void testeMostraLivroDoAutor() throws ParseException {
		// Instancia dos estoque e autores
		initData();

		// Valida que o metodo retorna o nome do livro correto
		assertEquals(estoque.get(0).getTitulo(), getLivroDoAutor("J.K. Rolling"));

	}

	@Test
	public void testeMostraAutorDoLivro() throws ParseException {
		// Instancia dos estoque e autores
		initData();

		// Valida que titulo do livro
		assertEquals(estoque.get(0).getAutor(), getLivroDoAutor("Harry Potter"));

	}



}
