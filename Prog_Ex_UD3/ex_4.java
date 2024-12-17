package Examen_UD3;

import java.util.*;

//Este ejercicio tiene varias funciones, para llamar a la lista
//por los elemntos del arr nió regula y cuidad
//la ultima funcion los ordena alfabeticamente

public class ex_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] listPapa = { { "Ana", "Bici", "Ubrique" }, { "Luis", "Lego", "El Bosque" },
				{ "Miguel", "Pelota", "Ubrique" } };
		System.out.println(Arrays.deepToString(listPapa));
		System.out.println((listPapa[0][0]));
		

		 printLista(listPapa);

		System.out.println("Dime una cuidad y te digo los regalos");
		String cuidad = sc.nextLine();
		
		ciudadRegalo(listPapa, cuidad);

		System.out.println("Dime el nombre de un niño/a");
		String nino = sc.nextLine();

	ninoNombre(listPapa, nino);

	
		
		
		
		System.out.println(Arrays.deepToString(listPapa));

	}

	public static void printLista(String[][] array) {
		System.out.println("Lista de regalos");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j == 0) {
					System.out.print(array[i][0]);

				} else if (j == 1) {
					System.out.print(" (" + array[i][j] + ")");
				} else {
					System.out.print(": " + array[i][j]);
				}

			}
			System.out.println(" ");
		}

	}

	public static void ciudadRegalo(String[][] array, String cuidad) {
//		if (cuidad.length()>array[0][2].length() || cuidad.length()>array[1][2].length() || cuidad.length()>array[2][2].length()) { 
//			System.out.println("No hay regalos en "+cuidad);	
//		} 

		if (array[0][2].contains(cuidad) || array[1][2].contains(cuidad) || array[3][2].contains(cuidad)) {
			System.out.print("Los regalos de " + cuidad + "son : - ");

			for (int i = 0; i < array.length; i++) {
				if (array[i][2].equals(cuidad)) {
					System.out.print(array[i][0] + ":" + array[i][1] + ", ");
				}

			}
		} else {

			System.out.println("No hay regalos en " + cuidad);
		}
	}

	public static void ninoNombre(String[][] array, String nino) {

		if (array[0][0].contains(nino) || array[1][0].contains(nino) || array[3][0].contains(nino)) {
			for (int i = 0; i < array.length; i++) {
				if (array[i][0].equals(nino)) {
					System.out.println(array[i][0] + " Esta en" + array[i][2] + " y recibirá un/a " + array[i][1]);
				}

			}
		} else {

			System.out.println(nino + " no esta en la lista");
		}

	}
	
	public static String[][] ordenar(String[][] array) {
		String [][] finalArr = array;
		
		Arrays.sort(array, (part1, part2) -> {
			String nombre1 = array[0][0];
			String nombre2 = array[1][0];
			return nombre1.compareTo(nombre2);
		});
		
	
		return finalArr;
	}

}