package livrariaGama;

import java.util.Random;

public class Estoque {

	private int codigo;
	private int qntd;
	private int lote;

	public Estoque(int codigo, int qntd, int lote) {
		this.codigo = codigo;
		this.qntd = qntd;
		this.lote = lote;
	}
	
	public Estoque() {
		
	}

	

	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public int getQntd() {
		return qntd;
	}



	public int setQntd() {
		Random Qntd = new Random();
		qntd = Qntd.nextInt(20);
		return qntd;
	}


	public int getLote() {
		return lote;
	}



	public void setLote(int lote) {
		this.lote = lote;
	}



	@Override
	public String toString() {
		return 	"Codigo = " + getCodigo() +
				"\nQuantidade = " + getQntd() +
				"\nEmprestada = " + getLote();
	}

}