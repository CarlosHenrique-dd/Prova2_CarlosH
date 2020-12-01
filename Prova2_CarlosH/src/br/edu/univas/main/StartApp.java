package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Cadastro;

public class StartApp {
	static Scanner sc = new Scanner(System.in);
	static Cadastro []contas = new Cadastro[100];
	static int i =0;
	public static void main(String[]args) {
		
		{
			int menu = 0;
			float saldo = 0;
			do {
				System.out.println("1.Cadastro de conta  2.Ver saldo  3.Sair");
				menu = sc.nextInt();
		
				if(menu==1) {
					Cadastro cad = new Cadastro();
					System.out.println("Qual a descriçao ?");
					cad.Desc = sc.next();
					System.out.println("Qual o tipo ?");
					cad.tipo = sc.next();
					System.out.println("qual o valor ?");
					cad.valor = sc.nextFloat();
					System.out.println("Qual a data de vecimento ?");
					cad.dataVenci = sc.next();
					contas[i] = cad;
					i++;
					if(cad.tipo.contains("Despesa")) {
						saldo = saldo - cad.valor;}
					if(cad.tipo.contains("Receita")) {
						saldo = saldo + cad.valor;}
				}
				if(menu==2) {
					System.out.println("Saldo de R$: "+saldo);
				}
				
			}while(menu!=9);
			
			
		}
	
	
	}
}
