package br.com.martinsbrn.estudos.hackerrank.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	static int simpleArraySum(int n, int[] ar) {
		int total = 0;
		for (int valor : ar) {
			total += valor;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = simpleArraySum(n, ar);
		System.out.println(result);
		in.close();
	}

}
