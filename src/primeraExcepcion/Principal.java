package primeraExcepcion;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int numer = 0, denom = 0;
		double resultado = 0.0;
		/*
		if (denom == 0){
			System.out.println("No se puede dividir por 0");
		}else {
		resultado = numer / denom;
		System.out.println(resultado);
		}
		*/
		do {
			try {
				System.out.println("¿Numerador?");
				numer = Leer.datoInt();
				
				System.out.println("¿Denominador?");
				denom = Leer.datoInt();
				
				resultado = numer / denom;
				System.out.printf("El resultado es: %.2f\n",resultado);
				
			} catch(ArithmeticException ae) {
				
				System.out.println("Error en la división");
				
			}catch(NumberFormatException n) {
				
				System.out.println("Has metido una letra");
			}
		}while (denom != 0);
	}
}


