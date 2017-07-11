import java.util.Scanner;
public class Salario{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		int number, horas;
		double valorHoras, salario;
		number = teclado.nextInt();
		horas = teclado.nextInt();
		valorHoras = teclado.nextDouble();
		salario = horas * valorHoras;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f\n", salario);

	}
}
