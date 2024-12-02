package Ejercicios;

public class Ejercicio3b {
	public static void main(String[] args) {
		long[] t = { 1800, 1200, 2000, 1200, 900 };

		for (int i = 0; i < t.length; i++) {
			t[i] = Math.round(t[i] * 1.10);

		}

		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
}
