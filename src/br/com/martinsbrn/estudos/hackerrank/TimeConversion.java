package br.com.martinsbrn.estudos.hackerrank;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String s) {
		try {
			SimpleDateFormat formato12horas = new SimpleDateFormat("hh:mm:ssa");
			SimpleDateFormat formato24horas = new SimpleDateFormat("HH:mm:ss");
			return formato24horas.format(formato12horas.parse(s));
		} catch (Exception e) {
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
		in.close();
	}

}