import java.util.Scanner;
public class PreenchimentoDeVetorIV{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int [] vetorPar = new int[5];
		int [] vetorImpar = new int [5];
		int [] vetorPrincipal = new int[15];
		int entrada, indiceImpar = 0, indicePar = 0;
		
		entrada = teclado.nextInt();
		
		for(int i = 0; i < vetorPrincipal.length; i++){
			entrada = teclado.nextInt();
			
			if(entrada % 2 == 0){
				indicePar++;
				else
					indiceImpar++;
				}
				
	}
}