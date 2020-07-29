package jogo.programas;

import java.util.Locale;
import java.util.Scanner;

import jogo.entidade.mercador.Mercador;
import jogo.entidade.personagens.Bolsa;
import jogo.entidades.itens.Arma;
import jogo.entidades.itens.Itens;

public class ProgramaJogo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Mercador m = new Mercador();
		
		m.addItem();
		Bolsa b = new Bolsa();
		System.out.print("[1]Compra [2]Vender [3]Sair");
		int opcao1 = sc.nextInt();
		switch(opcao1) {
		case 1:
			System.out.print("[Arma] ou [Colete] | [Sair]");
			int  opcao2 = sc.nextInt();
		switch(opcao2) {
		case  1:
			System.out.println(m);
			
			}
			String arma = sc.next();
		b.addItem((m.venderArma(arma)));}
		
		
		sc.close();
		System.out.println(b);
	}

}
