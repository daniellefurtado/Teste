import java.util.Scanner;
public class MacPronalts{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int qtdProdutos, item, qtdItem;
		double valor = 0;
		qtdProdutos = teclado.nextInt();
		
		for(int cont = 1; cont <= qtdProdutos; cont++){
			item = teclado.nextInt();
			qtdItem = teclado.nextInt();
			if(item == 1001)
				valor += 1.50 * qtdItem;
			else if(item == 1002)
				valor += 2.50 * qtdItem;
			else if(item == 1003)
				valor += 3.50 * qtdItem;
			else if (item == 1004)
				valor += 4.50 * qtdItem;
			else if (item == 1005)
				valor += 5.50 * qtdItem;
			
		}
			System.out.printf("%.2f\n", valor);
	}
}