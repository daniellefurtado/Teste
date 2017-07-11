import java.util.Scanner;
public class Abas{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		String acoes;
		int abas, qtdAcoes;
		abas = teclado.nextInt();
		qtdAcoes = teclado.nextInt();
		
		for(int cont = 0; cont < qtdAcoes; cont++){
			acoes = teclado.next();
			switch(acoes){
				case "clicou":
					abas--;
					break;
				case "fechou":
					abas++;
					break;
			}
		}
		System.out.println(abas);
	}
}