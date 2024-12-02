package Ejercicios;

import java.util.Scanner;

public class Ejercicio4c {
	public static void main(String[] args) {
		// ctrl shift o
		// ctrl shit f
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] t = new int[num];
		for (int i = 0; i < t.length; i++) {
			t[i] = i + 1;
		}

		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		int sum = 0;
		for (int i : t) {
			sum += i;

		}
		// int t[]= {1,2,3,4,5}
		System.out.println("suma = " + sum);
	}
}
