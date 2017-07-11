import java.util.Scanner;
public class PreenchimentoDeVetor{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int [] valor = new int[10];
		int numero;
		numero = teclado.nextInt();
		
		for(int i = 0; i < valor.length; i++){
		
		System.out.println("N[" + i + "] = " + numero);
		numero *= 2;
		
		}
	}
}