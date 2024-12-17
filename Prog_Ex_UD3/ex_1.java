package Examen_UD3;

import java.util.Arrays;
import java.util.Scanner;

// Ene este ejercicio creo un arr int
// Después le meto un for para 
// comprobar si miArr[i] es inpar
//después lo sumo con el contador sumar

public class ex_1 {
	public static void main(String[] args) {

		int[] miArr = { 1, 2, 3, 4, 5, 6 };

		System.out.println(miArr);
		System.out.println(Arrays.toString(miArr));

		int sumar = 0;
		for (int i = 0; i < miArr.length; i++) {
			if (miArr[i] % 2 != 0) {
				sumar = sumar + miArr[i];
			}
		}
		System.out.println("El resultado de la suma de impares es " + sumar);

	}

}