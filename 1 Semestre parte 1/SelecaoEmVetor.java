import java.util.Scanner;
public class SelecaoEmVetor{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int [] vetor = new int[100];
		double valor;
		
		for(int i = 0; i < vetor.length; i++){
			valor = teclado.nextDouble();
			
			if(valor <= 10){
				System.out.printf("A[%d] = %.1f\n", i, valor);
			}
		}
	}
}