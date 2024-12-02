package Ejercicios;

import java.util.Scanner;

public class Ejercicio4e {
	public static void main(String[] args) {
		int[] t = new int[5];
		// no se puede inicializar array con el for each;

		for (int i : t) {
			t[i] = i + 1;
			i++;
		}

		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
}
