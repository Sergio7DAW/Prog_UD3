package Examen_UD3;

import java.util.*;
import java.util.Scanner;

//Este ejercicio hace los siguiente:
// crea un Scanner sc y despues unn for
//en el bucle compara hasta encontrar la primera iteración del n mayor

public class ex_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el tamaño n de la tabla");
		int tamano = sc.nextInt();

		int[] tabla = new int[tamano];
		System.out.println("Introduce los valores de la tabla");

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce el valor de tabla [" + i + "]");
			int num = sc.nextInt();
			tabla[i] = num;

		}
		System.out.println(Arrays.toString(tabla));
		System.out.println("EL número mayor de la tabla está en el indice " + esMayor(tabla));
	}

	public static int esMayor(int[] array) {
		int mayor = array[0];

		for (int i = 0; i < array.length; i++) {
			if (mayor < array[i]) {
				mayor = i;
			} 
		}

		return mayor;
	}

}