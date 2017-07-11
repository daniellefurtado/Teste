import java.util.Scanner;
public class TrocaEmVetor {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		int [] vetor = new int [20];
		int aux;
		
		for(int i = 0; i < vetor.length; i++){
			vetor[i] = teclado.nextInt();
		} 
		for(int i = 0; i < vetor.length / 2; i++){
			aux = vetor[i];
			vetor[i] = vetor[vetor.length - 1 - i];
			vetor[vetor.length - 1 - i] = aux;
		}
		for(int i = 0; i < vetor.length; i++){
			System.out.printf("N[%d] = %d\n", i, vetor[i]);
		}
		
	}
}