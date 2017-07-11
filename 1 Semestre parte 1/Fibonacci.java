import java.util.Scanner;
public class Fibonacci{
	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);
		double numN, fibonacci; 
		numN = teclado.nextDouble();
		
		fibonacci = (Math.pow(((1 + Math.sqrt(5))/2), numN) - Math.pow(((1 - Math.sqrt(5))/2), numN))/Math.sqrt(5);
		
		System.out.printf("%.1f\n", fibonacci);
	}
}
//compilado