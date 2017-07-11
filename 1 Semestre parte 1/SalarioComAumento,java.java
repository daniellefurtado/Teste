import java.util.Scanner;
public class SalarioComAumento{
	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);
		float salario = 1000, percentualAumento = 0.015;
		int ano;
		salario += salario * percentualAumento;
		
		System.out.println("por favor, digite o valor do ano desejado");
		ano = teclado.nextInt();
		
		for (int cont = 2007; cont <= ano; cont++){
			percentualAumento *= 2;
			salario += salario * percentualAumento;
		}
		
		System.out.printf("Em %d, o salário será de R$%.2f.\n", ano, salario);
	}
}