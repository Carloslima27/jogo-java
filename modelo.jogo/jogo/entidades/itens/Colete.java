package jogo.entidades.itens;

public class Colete extends Itens{
	private Double defesa;
	
	public Colete() {
		super();
	}

	public Colete(String nome, Double defesa, Double preco) {
		super(nome, preco);
		this.defesa = defesa;
		
	}

	public Double getDefesa() {
		return defesa;
	}

	public void setDefesa(Double defesa) {
		this.defesa = defesa;
	}
	

}
