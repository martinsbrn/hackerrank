package br.com.martinsbrn.estudos.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
		in.close();
	}

	static int birthdayCakeCandles(int n, int[] ar) {
		Arrays.sort(ar);

		int total = 0;
		int maior = ar[ar.length - 1];
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] == maior) {
				total++;
			}
		}

		return total;
	}

}
