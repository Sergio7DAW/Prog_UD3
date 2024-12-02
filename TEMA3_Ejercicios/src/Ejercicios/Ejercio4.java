package Ejercicios;

import java.util.Scanner;

public class Ejercio4 {
	public static void main(String[] args) {
		int [] t = new int [10];

		int suma = 0;
		for (int i = 0; i < t.length; i++) {
			t[i] = (int) Math.round(Math.random()*100) ;
			suma += t[i];
			System.out.println(t[i]);
		}
		System.out.println("");
		System.out.println("La suma de los componentes array t es: "+suma);
	}
}
