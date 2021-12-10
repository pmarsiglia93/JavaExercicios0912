package br.com.generation.ex0912;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite N1: ");
		n1 = leia.nextInt();
		System.out.println("Digite N2: ");
		n2 = leia.nextInt();
		System.out.println("Digite N3: ");
		n3 = leia.nextInt();
		
		if (n1>=n2 && n1>=n3) {
			System.out.println("O maior valor é: " + n1);
		} else if (n2>=n1 && n2>=n3) {
			System.out.println("O maior valor é: " + n2);
		} else if (n3>=n1 && n3>=n2) {
			System.out.println("O maior valor é: " + n3);
		}				
		
		leia.close();
		
	}

}
