import java.util.Scanner;
public class lab1{
	public static void main (String args[]){
    Scanner lector = new Scanner(System.in);
	int opcion = lector.nextInt();
	System.out.print ("MENU DE OPCIONES \nIngrese la opcion que desee: \n1.Ingrese palabras \n2.Ingrese dos numeros positivos");
		switch (opcion){
		 case 1:
		 System.out.print ("Ingrese máximo 3 palabras");
		 string palabra1;
		 string palabra2;
		 string palabra3;
		 palabra1 = lector.nextString;
		 palabra2 = lector.nextString;
		 palabra3 = lector.nextString;
		 
		 break;
		 case 2:
		 System.out.print ("Ingrese dos numeros positivos");
		 int num1;
		 int num2;
		 num1 = lector.nextString;
		 num2 = lector.nextString;		 
		 double div = num1/num2;
		 System.out.print ("La division de ambos numeros es "+div);
		 int mod = num1%num2;
		 System.out.print ("El residuo de la division es "+mod);
		 break;
		 
		 
		
	}
	
	String palabra1;
	String palabra2;
	
[primera clase del lab] Entregar el menú de opciones
[primera clase del lab] Ingresar tres cadenas de caracteres
[primera clase del lab] Desplegar la longitud de cada una de las cadenas
[primera clase del lab] Concatenar las tres cadenas y mostrar en pantalla
[primera clase del lab] Mostrar en pantalla el carácter ubicado en una posición de la cadena según el usuario ingrese. Mostrar los tres caracteres de cada una de las tres cadenas. En caso que no sea una posición válida, informele al usuario.
[primera clase del lab] Ingresar dos números reales mayores a cero
[primera clase del lab] Mostrar la división  de ambos números
[primera clase del lab] Mostrar la división y el residuo de la parte entera de ambos números

}

}