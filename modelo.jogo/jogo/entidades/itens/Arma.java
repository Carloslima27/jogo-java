package jogo.entidades.itens;

public class Arma extends Itens{
	private Double forca;
	
	public Arma() {
		super();
	}

	public Arma(String nome, Double forca, Double preco) {
		super(nome, preco);
		this.forca = forca;
		
	}

	public Double getForca() {
		return forca;
	}

	public void setForca(Double forca) {
		this.forca = forca;
	}
	
	
	

}
