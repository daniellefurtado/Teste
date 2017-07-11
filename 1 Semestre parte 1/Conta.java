import java.util.Scanner;
public class Conta{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int casosDeTeste, valor = 0;
		casosDeTeste = teclado.nextInt();
		
		for(int cont = 1; cont <= casosDeTeste; cont++){
			valor = teclado.nextInt();
			if(valor % 2 == 0)
				System.out.println("0");
			if(valor % 2 != 0)
				System.out.println("1");
		}
	}
}
