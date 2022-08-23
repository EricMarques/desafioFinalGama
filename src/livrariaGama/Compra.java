package livrariaGama;

import java.sql.Date;

public class Compra {
   
	int idCompra;
    Date dataCompra;
    double valor;


    public Compra(int idcompra, Date DataCompra, double Valor) {
        this.idCompra = idcompra;
        this.dataCompra = DataCompra;
        this.valor = Valor;
    }
    
    public Compra() {
		
	}


	public int getIdCompra() {
		return idCompra;
	}


	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}


	public Date getDataCompra() {
		return dataCompra;
	}


	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

    

}
