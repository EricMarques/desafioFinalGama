package tests;

import org.junit.Assert;
import org.junit.Test;

import livrariaGama.Exemplar;

import java.text.ParseException;

public class TesteExemplar {

  @Test
  public void testeGetCodigoExemplar() throws ParseException {
    Exemplar exemplar = new Exemplar(1234, true, false);

    // Valida que o metodo retorna o nome do livro correto
    Assert.assertEquals(1234, exemplar.getCodigo());
    Assert.assertTrue(exemplar.isCativa());
    Assert.assertFalse(exemplar.isEmprestada());

  }

}