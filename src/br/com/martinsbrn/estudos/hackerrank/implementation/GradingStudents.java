package br.com.martinsbrn.estudos.hackerrank.implementation;

import java.util.Scanner;

public class GradingStudents {

	static int[] solve(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			int n = grades[i];
			if (n >= 38 && roundUp(n) - n < 3) {
				grades[i] = roundUp(n);
			}
		}

		return grades;
	}

	static int roundUp(int n) {
		return (n + 4) / 5 * 5;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
		in.close();
	}

}
