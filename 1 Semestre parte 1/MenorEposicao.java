import java.util.Scanner;
public class MenorEposicao{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int entrada, indice = 0, i, menor = Integer.MAX_VALUE;
		entrada = teclado.nextInt();
		int [] vetor = new int[entrada];
		
		for(i = 0; i < vetor.length; i++){
			vetor[i] = teclado.nextInt();
			if(vetor [i] < menor){
				menor = vetor[i];
				indice = i; 
			}
		}
			System.out.println("Menor valor: " + menor);
			System.out.printf("Posicao: %d\n", indice);
	}
}