package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		float nota1 = 0f, nota2 = 0f, nota3 = 0f, nota4 = 0f; 
		Scanner scan; //declarando um objeto
		
		try {
			
			scan = new Scanner(System.in);// instanciando o objeto 
			System.out.println("Digite 4 Notas");
			
			nota1 = scan.nextFloat();
			nota2 = scan.nextFloat();
			nota3 = scan.nextFloat();
			nota4 = scan.nextFloat();

			float media = (nota1 + nota2 + nota3 + nota4)/4;
			
			System.out.println("Prova 1: " + nota1 + "\nProva 2: " + nota2 + "\nProva 3: " + nota3 + "\nProva 4: " + nota4);
			System.out.println("Média das notas : " +  media);
			
			
		} catch (Exception e) {
			System.out.println("Formato incorreto !");
		}
	}

}
