import java.util.Scanner;
public class PreenchimentoDeVetorIII{
	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);
		
		int [] vetor = new int [100];
		double entrada;
		entrada = teclado.nextDouble();
		
		for(int i = 0; i < 100; i++){
			System.out.printf("N[%d] = %.4f\n", i, entrada);
			entrada = entrada / 2;
		}
	}
}