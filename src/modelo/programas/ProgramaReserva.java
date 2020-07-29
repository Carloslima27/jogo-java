package modelo.programas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Reserva;
import modelo.excessoes.DominioDeExcessoes;

public class ProgramaReserva {

	public static void main(String[] args)   {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		System.out.print("Numero do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de entrada: ");
		Date entrada = d.parse(sc.next());

		if(Integer.parseInt(d.format(entrada).substring(6, 8)) == 00) {
			System.out.println("Ano deve ter quatro digitos!");
		}

		System.out.print("Data de saida: ");
		Date saida = d.parse(sc.next());
		Reserva r = new Reserva(numero, entrada, saida);
		System.out.println(r);

		System.out.println();
		System.out.println("Entre com a data para atualizar reseva");
		System.out.print("Data de entrada: ");
		entrada = d.parse(sc.next());
		System.out.print("Data de saida: ");
		saida = d.parse(sc.next());

		r.atualizarData(entrada, saida);
		System.out.println(r);
		}catch(ParseException e){
			System.out.println("Formato de data Invalido!");
		}catch(DominioDeExcessoes e) {
			System.out.println("Erro na reserva: "+e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("error Inesperado!");
		}
		sc.close();
	}

}
