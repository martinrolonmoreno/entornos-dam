package ejemplo2;

/*Programa Java que compruebe de dos números enteros distintos cual es el
mayor y lo muestre por pantalla.*/


public class ComprobarMayor {

	public static void main(String[] args) {
		//ZONA DE DATOS:Declaración e Incialización de constantes y variables
		//Datos de entrada
		
		int num1,num2=0;
		
		
		//Datos de salida
		
		
		//ZONA DE INSTRUCCIONES
		//Simulamos leer datos de entrada
		num1=-7;
		num2=-7;
		
		//Condicion
		if(num1>num2) {
			System.out.println(num1 + " es mayor que "+ num2);
		}
		else if(num1==num2){
			System.out.println("El primer número ("+num1 +")"+ " es igual al segundo "+"("+num2+")");
		}
		else {
			System.out.println(num2 + " es mayor que "+ num1);
		}

	}

}


