	/**
	 * 1 - Declara dos variables num�ricas (con el valor que desees), muestra por consola la suma, 
	 * resta, multiplicaci�n, divisi�n y m�dulo (resto de la divisi�n).
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
public class Ejercicio1App {

	public static void main(String[] args) {
		int a=5;
		int b=9;
		double result=0;
		
		//Suma de a+b
		result=a+b;
		System.out.println(a+" + "+b+" = "+result);
		
		//Resta de a-b
		result=a-b;
		System.out.println(a+" - "+b+" = "+result);
		
		//Multiplicacion de a*b
		result=a*b;
		System.out.println(a+" * "+b+" = "+result);
		
		//Division de a/b
		result=a/b;
		System.out.println(a+" / "+b+" = "+result);
		
		//Resto de la division de a/b
		result=a%b;
		System.out.println("El resto de "+a+" / "+b+" = "+result);

	}

}
