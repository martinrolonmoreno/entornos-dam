package ejemplo1;

/*Programa Java que compruebe si el sueldo de una persona es superior a
3000€ y muestre un mensaje por pantalla indicando que debe abonar
impuestos*/

public class Sueldo {

	public static void main(String[] args) {
		//ZONA DE DATOS: Declaración e inicialización de constantes y variables
		//Datos de entrada
		int sueldo=0;
		boolean impuesto=false;
		
		//Datos de salida
		
		
		//ZONA DE INSTRUCCIONES
		//Simulamos leer dato de entrada
		sueldo=3000;
		
		if(sueldo>3000) {
			impuesto=true;
		}
		
		if(impuesto) {
			System.out.println("Debes abonar impuestos");
		}
		
		System.out.println("bye");
	}

}