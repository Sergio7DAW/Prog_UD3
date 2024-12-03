package Ejercicios;

import java.util.Scanner;

public class Ejercio8 {
	public static void main(String[] args) {
		double[] lista = new double[5];

		Scanner sc = new Scanner(System.in);

		arrayOrden(lista);
		arrayPrint(lista);

	}

	public static void arrayOrden(double[] lista) {
		double n;
		Scanner sc = new Scanner(System.in);
		for (int i = lista.length-1; i > -1; i--) {

			System.out.println("Dime un número");
			n = sc.nextDouble();
			lista[i] = n;
		}
	}

	public static void arrayPrint(double[] lista) {
		System.out.print("{");

		for (int i = 0; i < lista.length - 1; i++) {
			System.out.print(lista[i] + ", ");
		}
		System.out.print(lista[lista.length - 1]);
		System.out.print("}");
	}

}
