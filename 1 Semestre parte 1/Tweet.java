import java.util.Scanner;
public class Tweet{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		
		String entrada;
		entrada = teclado.nextLine(); 
		int caracteres = entrada.length();

		if(caracteres <= 140){
			System.out.println("TWEET");
		}else{
			System.out.println("MUTE");
		}
	}
}
//compilado


