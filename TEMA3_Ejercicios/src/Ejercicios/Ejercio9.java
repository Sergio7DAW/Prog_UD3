package Ejercicios;

import java.util.Arrays;

public class Ejercio9 {
	public static void main(String[] args) {
		// String[][] lista = { { "A", "B", "C" }, { "D", "E", "F" }, { "G", "H", "I" }
		// };
		char[][] lista2 = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };

		for (int i = 0; i < lista2.length; i++) {

			for (int j = 0; j < lista2[i].length; j++) {
				System.out.print(lista2[i][j] + " ");
			}

		}

		System.out.println();

		for (int i = 0; i < lista2.length; i++) {
			System.out.print(Arrays.toString(lista2[i]));

		}
		
		int[] nums = {2,3,4,1,6,7};
		System.out.println();
		System.out.println(Arrays.toString(nums));
		

	}

}
