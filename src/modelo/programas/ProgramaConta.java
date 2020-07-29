package modelo.programas;

import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Conta;
import modelo.excessoes.DominioDeExcessoes;

public class ProgramaConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta c = null;
		try {
		System.out.println("Entre com a conta: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limite = sc.nextDouble();
		 c = new Conta(numero, nome, saldo, limite);
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		c.saque(saque);
		System.out.printf("Saldo: %.2f",c.getSaldo());
		}catch(DominioDeExcessoes e) {
			System.out.println("Saque Error: "+e);
		}catch(RuntimeException e) {
			System.out.println("Error");
		}
		
		
		
		sc.close();
	}

}
