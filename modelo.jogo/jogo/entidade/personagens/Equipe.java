package jogo.entidade.personagens;

import jogo.entidades.itens.Arma;
import jogo.entidades.itens.Colete;

public class Equipe {
	private Arma slotArma;
	private Colete slotColete;
	private Status status;
	
	

	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	public Arma getSlotArma() {
		return slotArma;
	}
	public void setSlotArma(Arma slotArma) {
		this.slotArma = slotArma;
	}
	public Colete getSlotColete() {
		return slotColete;
	}
	public void setSlotColete(Colete slotColete) {
		this.slotColete = slotColete;
	}
	public void atualizarStatus() {
		status.setForca(getSlotArma().getForca());
		status.setVida(getSlotColete().getDefesa());
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(getSlotArma() != null) {
		sb.append("Arma: "+getSlotArma()+"\n");
		}else {
			sb.append("Arma: Sem Arma!\n");
		}
		if(getSlotColete() != null) {
		sb.append("Colete: "+getSlotColete());
		}else {
			sb.append("Colete: Sem Colete");
		}
		return sb.toString();
		
	}
	
	
}
