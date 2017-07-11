import java.util.Scanner;
public class PreenchimentoDeVetorII{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		int [] vetor = new int [1000];
		valor = teclado.nextInt();
		
		for(int i = 0; i < vetor.length; i++){
			vetor[i] = i % valor;
		}
			for(int i = 0; i < vetor.length; i++){
				System.out.println("N[" + i + "] = " + vetor[i]);
			}
	}
}