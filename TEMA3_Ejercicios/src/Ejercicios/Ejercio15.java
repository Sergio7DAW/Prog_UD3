package Ejercicios;

public class Ejercio15 {
	public static void main(String[] args) {

		String fraseA = "Buenos Dias";
		String fraseB = "¿Cual es mi nombre?";

		if (fraseA.length() == fraseB.length()) {
			System.out.println("son iguales");
		} else if (fraseA.length() > fraseB.length()) {
			System.out.println("frase A es mayor");

		} else {

			System.out.println("frase B es mayor");
		}

	}

}
