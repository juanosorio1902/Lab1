import java.util.Scanner;
import java.io.IOException;
public class lab {
	public static void main (String args[]){
	Scanner lector = new Scanner(System.in);
	int inicio = 0;
	do{
	int opcion;
	System.out.println ("MENU \nPlease enter the number of the option you want \n1.Enter three words\n2.Enter two numbers\n3.Enter three arrays ");
	opcion = lector.nextInt();

	switch (opcion)
	{
		case 1: 
		String cadena1;
		String cadena2;
		String cadena3;
		int opcion1;
		int numero;
		System.out.println ("Enter the first word");
		lector.nextLine();
		cadena1 = lector.nextLine();
		System.out.println ("Enter the second word");
		cadena2 = lector.nextLine();
		System.out.println ("Enter the third word");
		cadena3 = lector.nextLine();
		System.out.println ("Please enter the number of the option you want to use with words \n1.Show the words length \n2.Concatenate the words \n3.Show the character that you want");
		opcion1 = lector.nextInt();
		switch (opcion1)
		{
			case 1:
				System.out.println ("The length of the first word is " +cadena1.length());
				System.out.println ("The length of the second word is " +cadena2.length());
				System.out.println ("The length of the third word is " +cadena3.length());
			break;
			case 2:
				String concatenar = cadena1 + cadena2 + cadena3;
				System.out.println ("The concatenation of the chains is " +concatenar);
			break;
			case 3:
				System.out.println ("Insert the number of the character of the chains that you want");
				numero = lector.nextInt();
			if (numero <= cadena1.length())
			{	char car1 = cadena1.charAt(numero-1);
				System.out.println ("The character #"+numero+" of the first word is "+car1);
			}
			else
				System.out.println("Error, the first word does not have this character");
			if (numero <= cadena2.length())
			{	char car2 = cadena2.charAt(numero-1);
				System.out.println ("The character #"+numero+" of the second word is "+car2);
			}
			else
				System.out.println("Error, the second word does not have this character");
			if (numero <= cadena3.length())
			{	char car3 = cadena3.charAt(numero-1);
				System.out.println ("The character #"+numero+" of the third word is "+car3);
			}
			else
				System.out.println("Error, the third word does not have this character");			
 			
			break;
						
		}		
		break;	
		case 2:
		double num1;
		double num2;
		double div;
		double mod;
		int opcion2;
		boolean flag = true;
		do {
			System.out.println ("Insert two positives numbers");
			num1 = lector.nextInt();
			num2 = lector.nextInt();
			if (num1 <= 0 || num2 <= 0)
			{
				System.out.println ("Error");
				flag = false;
			}
		}
		while (flag == false);		
		div = num1/num2;
		mod = num1%num2;
		System.out.println("Enter the number of the option that you want\n1.Show the division of the numbers\n2.Show the division and the residue of the numbers");
		opcion2 = lector.nextInt();
		switch (opcion2)
		{
		
			case 1:
			System.out.println("The division of the numbers is " +div);
			break;
			case 2:
			System.out.println("The division of the numbers is " +div+ "and the residue is " +mod);
			break;			
		}
		
						
		break;
		case 3:
		int tam;
		System.out.println ("Enter the length of the first array");
		tam = lector.nextInt();
		int[]arreglo1 = new int[tam];
		arreglo1=lab.solicitarArreglo(tam);
		System.out.println ("Enter the length of the second array");
		tam = lector.nextInt();
		int[]arreglo2 = new int[tam];
		arreglo2=lab.solicitarArreglo(tam);
		System.out.println ("Enter the length of the third array");
		tam = lector.nextInt();
		int[]arreglo3 = new int[tam];
		arreglo3=lab.solicitarArreglo(tam);
		
			
		
	}
	System.out.println("MENU: 0 \nClose the the program: 1");
	inicio = lector.nextInt();
	
		
	}while (inicio == 0);
	
	}
		
	public static int[] solicitarArreglo(int tam){
	
		int[]arreglo = new int[tam];
		int n;
		Scanner lector = new Scanner(System.in);
		for (int i=1; i<tam; i++){
			System.out.println ("Ingrese el numero " +i);
			n=lector.nextInt();
			arreglo[i]= n;
		}
		return arreglo;
			
			
			
	
	}
	
	
	}
	
	
	
	