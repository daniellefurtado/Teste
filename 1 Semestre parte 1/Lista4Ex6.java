import java.util.Scanner;
public class Lista4Ex6{
	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);
		
		int [] vetor = new int [10];
		int aux;
		
		for(int i = 0; i < 10; i++){
			vetor[i] = teclado.nextInt();
		}
		for(int i = 0; i < vetor.length/2; i++){
			aux = vetor[i];
			vetor [i] = vetor[vetor.length - 1 - i];
			vetor[vetor.length - 1 - i] = aux;
		}
		for(int i = 0; i < vetor.length; i++){
			System.out.println(vetor[i]);
		}
	}
}