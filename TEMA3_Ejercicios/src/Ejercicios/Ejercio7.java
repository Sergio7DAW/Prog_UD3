package Ejercicios;

import java.util.Scanner;

public class Ejercio7 {
	public static void main(String[] args) {
		int[] lista = { 1, 3, 5, 1, 9, 0 };

		arrayMayor(lista);

	}

	public static void arrayMayor(int[] lista) {
		int max = 0;

		for (int i = 0; i < lista.length; i++) {
			
			max = (lista[i] > max) ? lista[i] : max;
		}
		System.out.println(max);
	}
}
