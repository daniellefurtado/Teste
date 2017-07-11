import java.util.Scanner;
public class NumerosInteiros{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		
		int numero, numeroAtual;
		System.out.println("por favor, digite numeros inteiros");
		numero = teclado.nextInt();
		numeroAtual = teclado.nextInt();
		for(int count = 1; count <= numero; count++){
		    numeroAtual = teclado.nextInt();
			while (numero > 0){
				numero++;
			System.out.println("Total de numeros digitados: ", numero++);
			}
			System.out.println(numero);
			System.out.println();
		}		
	}
}