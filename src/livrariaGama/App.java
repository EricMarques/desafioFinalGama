package livrariaGama;

import static livrariaGama.Usuario.numeroMatricula;

import java.text.ParseException;

public class App {
    public static void main(String[] args) throws ParseException {
        Usuario user = new Usuario("Rodrigo", 111_111_111-11, "61 99999-9999", numeroMatricula());
		user.mostrarUsuario();
		System.out.println();
		Usuario user2 = new Usuario("Eric", 222_222_222-22, "61 99999-9999", numeroMatricula());
		user2.mostrarUsuario();
		System.out.println();
		Usuario user3 = new Usuario("Joao", 333_333_333-33, "61 99999-9999", numeroMatricula());
		user3.mostrarUsuario();

		Autor autor1 = new Autor("J.K.Rolling", "Brasileira", 32, "f");
		Autor autor2 = new Autor("D. Pedro I", "Portugûes", 122, "M");
		Autor autor3 = new Autor("Patati", "Tangamandapiano", 35, "M");

		Livro Harry_Potter = new Livro("Harry Potter", autor1,"22/07/2018",5,"Calice","");
		Livro oIluminado = new Livro("O Aluno Iluminado", autor3,"01/04/2022",4, "Patatá","ABC12344");
		Livro independencia = new Livro("Independencia ou Brasil", autor2,"01/07/1980",1,"Atlas","EWRT32432");
		Livro livro = new Livro();

		Emprestimo emprestimo  = new Emprestimo(Harry_Potter,user,1);
		Emprestimo emprestimo2 = new Emprestimo(oIluminado,user2,0);
		Emprestimo emprestimo3 = new Emprestimo(independencia,user3,0);

		
		System.out.println(emprestimo.toString());
		emprestimo2.toString();
		emprestimo3.toString();


		System.out.println(autor1.toString());
		System.out.println(autor2.toString());
		System.out.println(autor3.toString());

		System.out.println("+++++++++++");
		livro.mostraAutor("J.K.Rolling");
    }
}

//Augustfreitas
//marianarusig
//EricMarques