import java.util.Scanner;
public class seguimiento5 {
	
	public static void main (String args[]){
	Scanner lector = new Scanner(System.in);
	String[]nombres = new String[8];
	int[]salarios = new int[8];
	String nombre;
	int salario;
	for(int i=0;i<nombres.length;i++){
		System.out.println("Ingrese el nombre de la posicion "+(i+1));
		nombre=lector.nextLine();
		nombres[i]=nombre;
		}
	for(int i=0;i<salarios.length;i++){
		System.out.println("Ingrese el salario de la posicion "+(i+1));
		salario=lector.nextInt();
		salarios[i]=salario;
		}
	int mayors=seguimiento5.mayorSalario(salarios);	
	System.out.println("El mayor salario es "+mayors);	
	}
public static int mayorSalario(int[]salarios) {
    int posicion; 
	int mayor = salarios[0];
    for (int i=0; i<salarios.length;i++) {
        if (salarios[i] > mayor) {
            mayor = salarios[i];
			posicion = i;
		}
		
	}
    return posicion;	
			
}


}

