package br.com.martinsbrn.estudos.hackerrank;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();

		int[] apples = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apples[apple_i] = in.nextInt();
		}

		int[] oranges = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			oranges[orange_i] = in.nextInt();
		}

		int qtdApple = 0;
		for (int apple : apples) {
			int valor = a + apple;
			if (!(valor < s || valor > t)) {
				qtdApple++;
			}
		}

		int qtdOrange = 0;
		for (int orange : oranges) {
			int valor = b + orange;

			if (!(valor < s || valor > t)) {
				qtdOrange++;
			}

		}

		System.out.println(qtdApple);
		System.out.println(qtdOrange);
		
		in.close();
	}
}