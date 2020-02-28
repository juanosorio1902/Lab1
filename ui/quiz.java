import java.util.Scanner;
public class quiz{
	public static void main (String args[]){
    Scanner lector = new Scanner(System.in);
	int semestre;
	double pago;
	double horas;	
	System.out.println ("Escriba el semestre al cual pertenece");
	System.out.println ("Escriba el numero de horas que trabajo en el semestre");
	if (semestre<=3){
		pago = horas*4500;
		System.out.println ("Su pago es "+pago);
	}	
		else if (semestre<=6)
		{	
		pago = horas*6200;
		System.out.println ("Su pago es "+pago);
		}
		else if (semestre<=10)
		{
		pago = horas*9400;
		System.out.println ("Su pago es "+pago);		
		} 
	}
}