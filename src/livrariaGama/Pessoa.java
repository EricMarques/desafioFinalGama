package livrariaGama;

public class Pessoa {

	String nome;
	String email;
	static Boolean pfOuPj;
	String telefone;
	String cpfCnpj;
	String rg;
	String endereco;
	
	public Pessoa(String nome, String email, Boolean pfOuPj, String telefone, String cpfCnpj, String rg,
			String endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.pfOuPj = pfOuPj;
		this.telefone = telefone;
		this.cpfCnpj = cpfCnpj;
		this.rg = rg;
		this.endereco = endereco;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getPfOuPj() {
		return pfOuPj;
	}

	public void setPfOuPj(Boolean pfOuPj) {
		this.pfOuPj = pfOuPj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
