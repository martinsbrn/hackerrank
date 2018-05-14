package br.com.martinsbrn.estudos.hackerrank.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		Arrays.sort(arr);

		long min = 0, max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			min += arr[i];
		}

		for (int j = 1; j < arr.length; j++) {
			max += arr[j];
		}

		System.out.print(min + " " + max);
		
		in.close();
	}
}

