package Examen_UD3;

import java.util.*;
import java.util.Scanner;

// este ejercicio lee un array
// despuúes lo ordeno con una mezcla de
//Array.split, una copy del string original y un for

public class ex_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce una frase");
		String frase = sc.nextLine();
		//String frase = "Donde esta el fin de Austin";

		String[] fraseSplit = frase.split(" ");

		Arrays.sort(fraseSplit);

		String[] copy = new String[fraseSplit.length];

		System.out.println(Arrays.toString(fraseSplit));

		int index = 0;
		for (int i = fraseSplit.length - 1; i > -1; i--) {
			copy[index++] = fraseSplit[i];

		}

		System.out.println(Arrays.toString(copy));

//		Arrays.sort(fraseSplit, (frase1, frase2) -> {
//			return frase1.compareTo(frase2);
//		});
//		
//		System.out.println(Arrays.toString(fraseSplit));

	}

}