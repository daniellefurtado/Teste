import java.util.Scanner;
public class AndandoNoTempo{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		
		if(num1 == num2 || num2 == num3 || num3 == num1){
			System.out.println("S");
		}else if(num1 + num2 == num3 || num1 + num3 == num2 || num3 + num2 == num1)
			System.out.println("S");
		else 
			System.out.println("N");
}
}