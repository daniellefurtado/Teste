import java.util.Scanner;
public class CrescenteDecrescente{
	public static void main(String [] args){
	Scanner teclado = new Scanner(System.in);
	
	int numX, numY;
	numX = teclado.nextInt();
	numY = teclado.nextInt();
	
	do{
		if(numX < numY){
		System.out.println("Crescente");
	}else if(numX > numY){
		System.out.println("Decrescente");
		}
		numX = teclado.nextInt();
		numY = teclado.nextInt();
	}while(numX != numY);
	
	}
}
//compiladoooo