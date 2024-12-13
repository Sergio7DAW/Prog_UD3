package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] lista =  {1,3,4,5};
		
	
		System.out.println("Dime un número dentro del array");
		int dime = sc.nextInt();
		System.out.println(buscador(lista,dime));
		
	}
	
	public static int buscador(int[] a, int clave) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]==clave) {
				return i;
			}
		}
		
		return -1;
	}

}
