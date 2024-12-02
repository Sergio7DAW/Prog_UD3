package Ejercicios;

import java.util.Scanner;

public class Ejercicio4d {
	public static void main(String[] args) {

		int[][] t = new int[3][3];
		int contador = 1;
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {

				t[i][j] = contador;
				contador++;
			}
		}

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {

				System.out.println(t[i][j] + " ");
			}
		}

		int sum = 0;
		for (int[] i : t) {
			for (int j : i) {

				sum += j;
			}
		}

		System.out.println("suma = " + sum);
	}
}
