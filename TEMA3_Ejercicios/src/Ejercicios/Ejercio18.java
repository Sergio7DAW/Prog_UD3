package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pswrd2 = "hola juna coomo te llamas";

		System.out.println(comparadorEsp(pswrd2));

	}

	public static int comparadorEsp(String A) {

		String resultado = "";
		char[] charArrayA = A.toCharArray();
		int cuenta = 0;


		for (int i = 0; i < charArrayA.length; i++) {
			if (charArrayA[i] == ' ') {

				cuenta = cuenta + 1;

		}
			return cuenta;

	
	}

}
}