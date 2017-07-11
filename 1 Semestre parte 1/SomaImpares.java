import java.util.Scanner;
public class SomaImpares {
	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);
		
		int casosTeste, numX, numY;
		
		casosTeste = teclado.nextInt();
		
		for(int cont = 1; cont <= casosTeste; cont++){
			int soma = 0;
			int quantidade = 0;
			numX = teclado.nextInt();
			numY = teclado.nextInt();
		
			while(quantidade < numY){
			if(numX % 2 != 0){
				quantidade++;
				soma += numX;
			}
			numX++;
		}
		System.out.println(soma); 
}
}
}