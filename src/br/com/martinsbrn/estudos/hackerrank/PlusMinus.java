package br.com.martinsbrn.estudos.hackerrank;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt();

		scanner.nextLine();

		int qtdPositivos = 0;
		int qtdNeutros = 0;
		int qtdNegativos = 0;

		String[] numeros = scanner.nextLine().split(" ");

		for (String numero : numeros) {
			int v = Integer.parseInt(numero);
			if (v > 0) {
				++qtdPositivos;
			} else if (v < 0) {
				++qtdNegativos;
			} else {
				++qtdNeutros;
			}
		}

		System.out.println(1.0 * qtdPositivos / qtd);
		System.out.println(1.0 * qtdNegativos / qtd);
		System.out.println(1.0 * qtdNeutros / qtd);
		
		scanner.close();
	}
}