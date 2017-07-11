import java.util.Scanner;
public class QuadradoCubo{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int numLinhas = teclado.nextInt();

		for(int cont = 1; cont <= numLinhas; cont++){
			System.out.println((cont) + " "+ (cont * cont) + " " + (cont * cont * cont));
		}
	}
} 
//compilado