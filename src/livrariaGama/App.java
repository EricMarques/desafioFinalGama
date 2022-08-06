package livrariaGama;

import static livrariaGama.Usuario.numeroMatricula;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws ParseException {
		//Map<String, Autor> autores = new HashMap<String, Autor>();
		List<Autor> autores = new ArrayList<Autor>(); 
			
		Autor autor = new Autor();
		autores.add(new Autor("J.K.Rolling", "Brasileira", 32, "f"));
		autores.add(new Autor("D. Pedro I", "Portugûes", 122, "M"));
		autores.add(new Autor("Patati", "Tangamandapiano", 35, "M"));

	
        Usuario user = new Usuario("Rodrigo", 111_111_111-11, "61 99999-9999", numeroMatricula());
		Usuario user2 = new Usuario("Eric", 222_222_222-22, "61 99999-9999", numeroMatricula());
		Usuario user3 = new Usuario("Joao", 333_333_333-33, "61 99999-9999", numeroMatricula());


		Livro Harry_Potter = new Livro("Harry Potter", autores.get(0),"22/07/2018",5,"Calice","");
		Livro oIluminado = new Livro("O Aluno Iluminado", autores.get(1),"01/04/2022",4, "Patatá","ABC12344");
		Livro independencia = new Livro("Independencia ou Brasil", autores.get(2),"01/07/1980",1,"Atlas","EWRT32432");
		
		String nome = "Patati";
		for (int i = 0; i < autores.size(); i++) {
			autores.get(i).toString().contains(nome);
		}
		System.out.println("Autor " +nome+" encontrado ");
		
		

		

		/*String nome = "autor1";
		if (autores.containsValue(autores.get(nome))) {
            System.out.println("Found " + autores.get(nome));
        }*/

		/*Emprestimo emprestimo  = new Emprestimo(Harry_Potter,user,1);
		Emprestimo emprestimo2 = new Emprestimo(oIluminado,user2,0);
		Emprestimo emprestimo3 = new Emprestimo(independencia,user3,0);*/



		//System.out.println(autores.get("autor2").toString());
		//System.out.println(autor2.toString());
		//System.out.println(autor3.toString());

		//System.out.println("+++++++++++");
		//livro.mostraAutor("J.K.Rolling");
    }
}

//Augustfreitas
//marianarusig
//EricMarques