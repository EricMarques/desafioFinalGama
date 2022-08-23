package livrariaGama;

public class Usuario extends Pessoa {

	int idUsuario;
	String usuario;
	String senha;

    public Usuario(int idUsuario, String usuario, String senha) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.senha = senha;
	}
    
    public  Usuario() {
		
	}

	public int getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public void mostrarUsuario() {
        System.out.printf("Nome: %s\nCPF/CNPJ: %d\nTelefone: %s\n" + "Id: %s\n", nome, cpfCnpj, telefone, idUsuario);
    }

    @Override
    public String toString() {
        return "Nome = " + getUsuario() +
                "\nID = " + getIdUsuario() +
                "\nTelefone = " + getTelefone();
    }

}