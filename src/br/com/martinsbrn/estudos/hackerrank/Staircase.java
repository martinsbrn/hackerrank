package br.com.martinsbrn.estudos.hackerrank;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt();

		for (int i = 0; i < qtd; i++) {
			for (int j = 1; j <= qtd; j++) {
				System.out.print(j < qtd - i ? " " : "#");
			}
			System.out.println("");
		}
		
		scanner.close();
	}
}
