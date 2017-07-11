import java.util.Scanner;
public class FibonacciEmVetor{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		
		int casosDeTeste; 
		casosDeTeste = teclado.nextInt();
		
		int [] valor = new int[casosDeTeste];
		long [] vetor = new long[61];
	
		vetor[0] = 0;
		vetor[1] = 1; 
		for(int j = 2; j <= 60; j++){
			vetor[j] = vetor[j -1]+vetor[j - 2];
		}
		for(int i = 0; i < casosDeTeste; i++){
			valor[i] = teclado.nextInt();
			
			System.out.println("Fib("+valor[i]+") = " + vetor[valor[i]]); 
		}
	}
}