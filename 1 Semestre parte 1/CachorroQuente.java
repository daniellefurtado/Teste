import java.util.Scanner;

public class CachorroQuente {
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		   
		int totalCachorro, totalParticipante;
        float media;
        
        totalCachorro = teclado.nextInt();
        totalParticipante = teclado.nextInt();
        
        media = ((float)totalCachorro) / ((float) totalParticipante); 
        
        System.out.printf("%.2f", media);
	}
}
// compilado com sucessooooo