package jogo.entidade.personagens;

import java.util.ArrayList;
import java.util.List;

import jogo.entidades.itens.Arma;
import jogo.entidades.itens.Colete;
import jogo.entidades.itens.Itens;

public class Bolsa {
	private Equipe equipe;
	private List<Itens> itensBolsa = new ArrayList<>();

	public List<Itens> getItensBolsa() {
		return itensBolsa;
	}

	public void setItensBolsa(List<Itens> itensBolsa) {
		this.itensBolsa = itensBolsa;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public void addItem(Itens bolsa) {
		itensBolsa.add(bolsa);
	}

	public void equiparArma(String arma) {
		equipe.setSlotArma((Arma) itensBolsa.stream().filter(x -> x.getNome().equals(arma)).findFirst().orElse(null));
		equipe.atualizarStatus();
	}

	public void equiparColete(String colete) {
		equipe.setSlotColete(
				(Colete) itensBolsa.stream().filter(x -> x.getNome().equals(colete)).findFirst().orElse(null));
		equipe.atualizarStatus();
	}

	public void removerEquipe(String opcao) {
		if (opcao == "Arma") {
			equipe.setSlotArma(null);
		} else {
			equipe.setSlotColete(null);
		}

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Itens x : itensBolsa) {
			sb.append("Bolsa:\n" + x.getNome() + "\n" + x.getForca() + "\n" + x.getPreco() + "\n");
		}
		return sb.toString();
	}

}
