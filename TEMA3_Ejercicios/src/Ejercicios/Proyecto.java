package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Proyecto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] prueba = { "Camiseta:19.99", "Pantalón:39.99", "Zapatos:59.99", "Chaqueta:79.99", "Gorra:9.99" };
		System.out.println("Qué quieres eliminar?");
		String prod = sc.nextLine();
		String[] resultado = ordenarLista(prueba, prod);
		System.out.println("La nueva lista es " + Arrays.toString(resultado));

	}

	static public String[] ordenarLista(String[] array, String producto) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (!array[i].equals(producto)) {
				contador++;
			}

		}

		int indice = 0;
		String[] arrayNuevo = new String[contador];

		for (int i = 0; i < array.length; i++) {
			if (!array[i].equals(producto)) {
				arrayNuevo[indice++] = array[i];
			}
		}
		return arrayNuevo;
	}

}