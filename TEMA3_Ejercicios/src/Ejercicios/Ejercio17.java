package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			


	String pswrd2 ="hola";
	
	String intentos2 = "hybx";
	


		System.out.println(comparadorMio(pswrd2,intentos2));
		
		



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
