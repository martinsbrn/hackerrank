package br.com.martinsbrn.estudos.hackerrank.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt();
		int[][] constante = new int[qtd][qtd];

		scanner.nextLine();

		for (int coluna = 0; coluna < qtd; coluna++) {
			String[] numeros = scanner.nextLine().split(" ");
			for (int linha = 0; linha < qtd; linha++) {
				constante[coluna][linha] = Integer.valueOf(numeros[linha]);
			}
		}

		int totalSoma = 0;
		int j = qtd - 1;
		for (int i = 0; i < qtd; i++) {
			totalSoma += (constante[i][i] - constante[j][i]);
			j--;
		}

		System.out.println(Math.abs(totalSoma));
		scanner.close();
	}

	// public static void main(String[] args) {
	//
	// Scanner scan = new Scanner(System.in);
	// int n = Integer.parseInt(scan.nextLine());
	// int s1 = 0;
	// int s2 = 0;
	//
	// for (int i = 0, j = n - 1; i < n; i++, j--) {
	//
	// String[] inputLine = scan.nextLine().split(" ");
	//
	// s1 = s1 + Integer.parseInt(inputLine[i]);
	// s2 = s2 + Integer.parseInt(inputLine[j]);
	// }
	//
	// System.out.println(Math.abs(s1 - s2));
	// }

//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		// Get size of matrix
//		final int N = Integer.parseInt(br.readLine());
//
//		// Get matrix
//		final int[][] matrix = new int[N][N];
//		for (int y = 0; y < N; ++y) {
//			String[] row = br.readLine().split(" ");
//			for (int x = 0; x < N; ++x) {
//				matrix[y][x] = Integer.parseInt(row[x]);
//			}
//		}
//
//		// Initialize difference
//		long diff = 0;
//
//		// Get difference of sum of diagonals
//		for (int y = 0, x = N; y < N; ++y) {
//			diff += matrix[y][y] - matrix[y][--x];
//		}
//
//		// Convert to absolute difference
//		diff = (diff < 0) ? -diff : diff;
//
//		// Print absolute difference
//		System.out.print(diff);
//	}
}