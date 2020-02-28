import java.util.Scanner;
public class factorial{

public static void main (String[]args){
Scanner lector= new Scanner(System.in);
System.out.println ("Digite el numero");
int num = lector.nextInt();
int resultado=factorial.calcularFactorial(num);
System.out.println("Es resultado es " +resultado);

}

public static int calcularFactorial(int num){
	int factorial=1;
	if (num>=1 && num<=20){
	for (int i=1; i<=num; i++)
		factorial = factorial*i;
	}
	return factorial;
}

}