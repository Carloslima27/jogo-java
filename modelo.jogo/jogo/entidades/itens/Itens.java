package jogo.entidades.itens;

public abstract class Itens {
	private String nome;
	private Double preco;
	private Double forca;
	private Double defesa;
	
	
	public Itens() {
		
	}
	
	
	public Itens(String nome, Double preco) {
		this.nome = nome;
		
		this.preco = preco;
	}


	


	public Double getForca() {
		return forca;
	}


	public void setForca(Double forca) {
		this.forca = forca;
	}


	public Double getDefesa() {
		return defesa;
	}


	public void setDefesa(Double defesa) {
		this.defesa = defesa;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
