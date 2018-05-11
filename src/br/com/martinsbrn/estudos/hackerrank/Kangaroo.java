package br.com.martinsbrn.estudos.hackerrank;

import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		long total_A = x1;
		long total_B = x2;

		for (int i = 0; i < 4; i++) {
			total_A += v1;
			total_B += v2;
		}
		
		System.out.println(total_A);
		System.out.println(total_B);

		return total_A == total_B ? "YES" : "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		
		in.close();
	}

}