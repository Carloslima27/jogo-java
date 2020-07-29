package modelo.entidades;

import modelo.excessoes.DominioDeExcessoes;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque)  {
		

		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	public void deposito(Double deposito) {
		this.saldo += deposito;
	}
	public void saque(Double saque) throws DominioDeExcessoes {
		if(saque > limiteSaque) {
			throw new DominioDeExcessoes("valor do saque excedeu o limite!");
		}
		if(saque > saldo) {
			throw new DominioDeExcessoes("Saldo Insuficiente!");
		}
		saldo-= saque;
	}
	public String toString() {
		
		return String.format("Saldo: %.2f", getSaldo());
	}
	
	
}
