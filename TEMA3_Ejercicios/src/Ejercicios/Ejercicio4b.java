package Ejercicios;

public class Ejercicio4b {
	public static void main(String[] args) {
		//ctrl shift l -> shortcuts
				int [][] enteros = new int [5][2];
				enteros[0][0]=1;
				enteros[0][1]=2;
				
				//System.out.println(enteros[0][0]);
				
				for(int i = 0; i<enteros.length; i++) {
					for (int j = 0; j<enteros[i].length;j++) {
						System.out.print(enteros[i][j]+" ");
					}
					System.out.println();
				}
	}
}
