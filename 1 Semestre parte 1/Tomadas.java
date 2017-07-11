import java.util.Scanner;
public class Tomadas{
	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);
		
		int T1, T2, T3, T4, total;
		T1 = teclado.nextInt();
		T2 = teclado.nextInt();
		T3 = teclado.nextInt();
		T4 = teclado.nextInt();
		total = T1 + T2 + T3 + T4;
		
		System.out.println(total - 3);
			
	}
}
//compiladoooooo