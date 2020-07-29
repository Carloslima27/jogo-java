package jogo.entidade.mercador;

import java.util.ArrayList;
import java.util.List;

import jogo.entidades.itens.Arma;
import jogo.entidades.itens.Colete;
import jogo.entidades.itens.Itens;

public class Mercador {
	private List<Itens> itens = new ArrayList<>();
	
	
	public List<Itens> getItens() {
		return itens;
	}

	public void setItens(List<Itens> itens) {
		this.itens = itens;
	}

	public void addItem() {
		itens.add(new Arma("TMP", 5.5,1000.00));
		itens.add(new Arma("ShotGun", 10.0,3500.00));
		itens.add(new Arma("Pistola", 4.2,500.0));
		itens.add(new Colete("JMX", 4.5,600.0));
		itens.add(new Colete("ARMADURA DE PEDRA", 2.0,300.0));
		itens.add(new Colete("ARMADURA CRYSTAL", 9.0,1500.00));
	}
	public Arma venderArma(String opcao) {
		return (Arma) itens.stream().filter(x -> x.getNome().equals(opcao)).findFirst().orElse(null);
		
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
		sb.append("Nome: "+itens.get(i).getNome()+" Preco: "+itens.get(i).getPreco()+"\n");
		}
		return sb.toString();
	}
	
	
	
	
}
