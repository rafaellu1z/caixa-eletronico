package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Nota;
import entities.Saque;

public class Program {
 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Nota nota100 = new Nota(1,100,9999);
		Nota nota50 = new Nota(2,50,9999);
		Nota nota20 = new Nota(3,20,9999);
		Nota nota10 = new Nota(4,10,9999);
		Nota nota5 = new Nota(5,5,9999);
		
		List<Nota> notas = new ArrayList<>();
		notas.add(nota100);
		notas.add(nota50);
		notas.add(nota20);
		notas.add(nota10);
		notas.add(nota5);
		
		int valorDaNota;
		int QuantidadeDeNotas;
		
		List<Saque> lista = new ArrayList<>();
		
		while (true) {
			System.out.println("Selecione a operação: ");
			System.out.print("Realizar Saque = s | Ver Transações = t (s/t): ");
			char response = sc.next().charAt(0);
			if(response == 's') {
				System.out.println("Notas Disponíveis: ");
				System.out.println(nota100 
						+ " | " +  nota50 
						+ " | " +  nota20 
						+ " | " + nota10 
						+ " | " + nota5);		
				System.out.print("Digite o valor do saque: R$ ");
				double valorSolicitado = sc.nextDouble();
				int valorDeSaque = (int) valorSolicitado;
				if((valorDeSaque < 5) || (valorDeSaque % 5 != 0) || (valorSolicitado % 5 != 0)) {
					System.out.println("Saque invalido");
				} else {
					Saque saque = new Saque(1, new Date(), (int) valorSolicitado);
					for (Nota nota : notas) {
						if((valorDeSaque - nota.getValor() > 0) || (valorDeSaque % nota.getValor() == 0)) {
							int qtd = 0;
							while((valorDeSaque - nota.getValor()) >= 0) {
								valorDeSaque -= nota.getValor();
								qtd += 1;
								nota.setQuantidade(nota.getQuantidade() - 1);
								saque.adicionarNota(new Nota(nota.getIdDaNota(), nota.getValor(), qtd));
							}
						}	
					}
					lista.add(saque);
					System.out.println("Saque realizado com sucesso !!!");
				}
			} else {
				System.out.println();
				System.out.println("Transações: " + lista.size());
				for (Saque transacao : lista) {
					System.out.println(transacao);
				}
				System.out.println();
			}
		}
	}
}
