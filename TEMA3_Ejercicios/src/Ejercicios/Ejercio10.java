package Ejercicios;

import java.util.Arrays;

public class Ejercio10 {
	public static void main(String[] args) {
		int [] lista =  new int [7];
		Arrays.fill(lista, 7);
		System.out.println(Arrays.toString(lista));
		//Arrays.fill(lista, 5,8,3);
		Arrays.fill(lista, 2, 4, 3);
		System.out.println(Arrays.toString(lista));
	}

}
