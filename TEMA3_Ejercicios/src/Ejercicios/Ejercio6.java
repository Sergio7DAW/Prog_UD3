package Ejercicios;


public class Ejercio6 {
	public static void main(String[] args) {
		
		int[] t = { 2, 3, 8, 9, 15, 17 };

		System.out.println(sumaArray(t));

	}

	public static int sumaArray(int[] a) {
		int suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];

		}
		return suma;
	}
}
