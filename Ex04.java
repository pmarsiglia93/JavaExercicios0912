package br.com.generation.ex0912;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite um valor: ");
		valor = leia.nextDouble();
		
		if (valor%2 == 0 ) {
			System.out.println("Esse Valor � Par");
			System.out.println("Raiz Quadrada: " + Math.sqrt(valor));
		} else if (valor%2 == 1) {
			System.out.println("Esse valor � Impar");
			System.out.println("Elevado ao Quadrado: " + Math.pow(valor, 2));
		}
		
		leia.close();

	}

}
