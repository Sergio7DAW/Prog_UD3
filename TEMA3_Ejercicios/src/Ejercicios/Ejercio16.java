package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Juego #1");
//		System.out.println(" ");
//		System.out.println("p1, introduce una contraseña");
//		String pswrd = sc.nextLine();
//		System.out.println("p1, introduce una contraseña");
//		System.out.println("¿Cuál es la contraseña");
//		String intentos = sc.nextLine();
//		
////	int z = "holaXCV".compareTo("Hola");
//	System.out.println(z);
//		
//		do {
//			
//			if (pswrd.length() == intentos.length()) {
//				System.out.println("corrector, entrando");
//			} else {
//				int z = pswrd.compareTo(intentos);
//				if (z > 0) {
//					System.out.println("tu password en mayor alfabéticamente");
//				} else if (z < 0) {
//					
//					System.out.println("tu password en menor alfabéticamente");
//				
//				} else { 
//					System.out.println("tu password en igual alfabéticamente");
//				}
//				
//				System.out.println("error, intentelo de nuevo");
//				intentos = sc.next();
//			}
//				
//			
//		}while(pswrd.length()!=intentos.length());
//		
		

	System.out.println("Juego #2");
	System.out.println(" ");System.out.println("p1, introduce una contraseña");
	String pswrd2 = sc.next();
	System.out.println("p1, introduce una contraseña");
	System.out.println("¿Cuál es la contraseña");
	String intentos2 = sc.next();
	
	do {

		if (pswrd2 == intentos2) {
			System.out.println("corrector, entrando");
		} else {
			
			System.out.println("La contraseña tiene: "+pswrd2.length()+" dígitos");
			System.out.println(comparadorMio(pswrd2,intentos2));
			System.out.println("error, intentelo de nuevo");
			intentos2 = sc.next();
		}

	}while(pswrd2!=intentos2);

}
	
	public static String comparadorMio (String A, String B) { 
		
		String resultado = "";
		char[] charArrayA = A.toCharArray();
		char[] charArrayB = B.toCharArray();
		//System.out.println(Arrays.toString(charArrayA));
		//System.out.println(Arrays.toString(charArrayB));
		char [] Prueba = new char [charArrayA.length];
		
		for (int i = 0; i < charArrayA.length; i++) {
			if (charArrayA[i] == charArrayB[i]) {
				
				Prueba[i]=charArrayA[i];
				
			} else { 
					
				Prueba[i]='*';
			}
			
			
		}
		
		//System.out.println(Arrays.toString(charArrayB));
		String pruebaString = Arrays.toString(Prueba);
		String pruebaString2 = new String (Prueba);
		System.out.println(pruebaString2);
		return resultado = pruebaString;
		//return resultado;
	}
	
	

}
