package Ejercicios;

import java.util.Scanner;

public class Ejercio5 {
	public static void main(String[] args) {
		double [] lista = new double [5];
		
		Scanner sc = new Scanner(System.in);
		
		arrayOrden(lista);
		
	}
	
	public static void arrayOrden (double [] lista) {
		double n;
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<lista.length;i++) {
			
			System.out.println("Dime un número");
			n = sc.nextDouble();
			lista[i]=n;
		}
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}

}
