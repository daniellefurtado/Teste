import java.util.Scanner;
public class FrequenciaDeNumeros {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		//solução fácil
		int tamanho = teclado.nextInt(), numAtual;
		int [] vetor = new int[2001];
		//pro 2000 caber no vetor, o vetor tem que ter 2001 posições
		
		for(int i = 0; i < vetor.length; i++){
			numAtual = teclado.nextInt();
			vetor[numAtual]++;
		}
		for(int i = 1; i < vetor.length; i++){
			if(vetor[i] != 0)
				System.out.printf("%d aparece %d vez(es)\n", i, vetor[i]);
		}
	}
}

