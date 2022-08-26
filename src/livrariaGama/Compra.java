package livrariaGama;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Compra {
   
	double idCompra;
    double valor;
	LocalDate dataCompra;
    LocalDate data = LocalDate.now();
    LocalDate dataDeEntrega;

	Estoque estoque = new Estoque();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    public Compra(Double idcompra, LocalDate DataCompra, double Valor) {
        this.idCompra = idcompra;
        this.dataCompra = DataCompra;
        this.valor = Valor;
    }
    
    public Compra() {
		
	}


	public double getIdCompra() {
		return idCompra;
	}


	public void setIdCompra() {
		this.idCompra = Math.random();
	}


	public LocalDate getDataCompra() {
		return dataCompra;
	}


	public void setDataCompra() {
		this.dataCompra  = data;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	public String setDataEntrega() {
		LocalDate dataDeEntrega = data.plusDays(3);
		this.dataDeEntrega = dataDeEntrega;
		return dataDeEntrega.format(formatter);
	}
	
	public void realizarCompra(Livro titulo, int qntd) {
		Scanner input = new Scanner(System.in);
		setIdCompra();
		int Estoque = estoque.setQntd();
		if (Estoque > 0) {
			System.out.println(
					"Livro: " + titulo.getTitulo()+
					"\nEdição: "+ titulo.getEdicao()+
					"\nDigite 1 para confimar a compra ou 2 para cancelar."
					);
			int opcao = input.nextInt();
			switch (opcao) {
			case 1: {
				System.out.println(
						"Valor da compra: R$"+titulo.getValor()*qntd+
						"\nLivro: " + titulo.getTitulo()+
						"\nEdição: "+ titulo.getEdicao()+
						"\nCompra realizada com sucesso!"+
						"\nData prevista para a entrega: "+ setDataEntrega()
						);
				break;
			} 
			case 2: {
				System.out.println(
						"Compra cancelada!"
						);
				break;
			} 
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
			
		} else {
			System.out.println("Livro fora de estoque.");
		}
		
		
		
		
		input.close();
	}
	


    

}
