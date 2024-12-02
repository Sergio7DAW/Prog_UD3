
public class ejercicio1 {

	public static void main(String[] args) {
		//ctrl shift l -> shortcuts
				int[] tabla1 = new int[10];
				int tabla2[]= new int [10];
				int tabla3[]= new int [10];
				tabla3[0]=20;
				tabla2= tabla3;
				tabla1= tabla2;
				
				System.out.println(tabla1[0]);	
				System.out.println(tabla2[0]);	
				System.out.println(tabla3[0]);	
				System.out.println();
				//Sysout ctrl space + enter
				// recolector de basura??otio
				System.out.println();
				tabla1[2] = 13;
				tabla2=null;
				System.out.println(tabla1);
				System.out.println(tabla3);
				metodo(tabla1);
	
	}
	
	public static void metodo(int [] x) {
		//same as tabla1=x
		System.out.println(x);
		x[0]=33;
	}

}
