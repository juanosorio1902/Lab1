import java.util.Scanner;
public class seguimiento3{
	public static void main (String args[]){
    Scanner lector = new Scanner(System.in);
	String palabra;
	int inicio = 0;
	
	boolean error = false;
	System.out.println("Ingrese la palabra que desea evaluar");
	palabra = lector.next();
	int fin = palabra.length()-1;
	while ((inicio<fin) && (!error)){
			
	if (palabra.charAt(inicio)== palabra.charAt(fin)){				
		inicio++;
		fin--;
	} else {
		error = true;
	}
}
if (!error)
	System.out.println(palabra + " Es un palindromo");
else
	System.out.println(palabra + " No es un palindromo");
	
				
	}
}