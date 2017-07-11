import java.util.Scanner; 
public class TodosPrimos{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		int numero;
		
		System.out.println("Por favor, digite um número inteiro maior que 1: ");
		numero = teclado.nextInt();
		boolen ehPrimo = true;
		
		while(numero <= 1){
			System.out.println("Valor inválido");
			System.out.println("Por favor, digite um número inteiro maior que 1: ");
			numero = teclado.nextInt();
		}
		for(int numeroAtual = numero; numeroAtual > 1; numeroAtual--){
		ehPrimo == true;
		for(int cont = numeroAtual -1; cont > 1 && ehPrimo == true; cont--){
			if (numero % cont == 0)
				ehPrimo = false;
		}
		if(ehPrimo == true)
			System.out.printf("O numero %d é primo\n", numeroAtual);
			else 
			System.out.printf("O numero %d não é primo!\n", numeroAtual);
	}
	}
}