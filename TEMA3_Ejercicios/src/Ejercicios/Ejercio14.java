package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercio14 {
	public static void main(String[] args) {
		
		int [] lista =  {1,3,4,5};
		int [] copia = new int [lista.length];
		
		for (int i = 0; i < copia.length; i++) {
			copia[i]=lista[i];
		}
		
		System.out.println(Arrays.toString(copia));
		System.out.println("\u2661");
		System.out.println("hello \"there\" \r");
		
		int i = 65;
		char c = (char)i;
		
		char d = 'X';
		// byte 2 caracteres, y int 4, 
		//seria un casting implicito
		//no se puerde info
		int j = (int) d;
		System.out.println(c);
		System.out.println(j);
		
		String cad = String.valueOf(12345);
		System.out.println(cad);
		
		String a = "hola";
		String b = "hola";
		String w = "hola1";
		//
		int comparacion= "hola".compareTo(b);
		if (comparacion == 0) { 
			System.out.println("iguales");
		}
		else if (comparacion < 0) { 
			System.out.println("1 menor");
			
		} else  { 
			System.out.println("1 mayor");
			
		}
		
		System.out.println("Hola 124".indexOf("2"));
		System.out.println("dicksucker".isEmpty());
		System.out.println("dicksucker".contains("0"));
		System.out.println("dicksucker".replace("i","x"));
		
		
		
		
		
		
		
	}
	
	

}
