import java.util.Scanner;
public class LeituraValidada{
	private Scanner teclado;
	
	//Construtor da classe
	public LeituraValidada(){
		teclado = new Scanner(System.in);
	}
	//lê um valor inteiro e verifica se o mesmo está em um intervalo predefinido
	//Mensagem se refere à mensagem a ser exibida ao usuário quando da requisição da entrada
	public int leIntIntervalo(String mensagem, int minimo, int maximo){
		int valor;
		System.out.println(mensagem);
		valor = teclado.nextInt();
		
		while(valor < minimo || valor > maximo){
				System.out.printf("O valor digitado deve estar entre %d e %d." + " Por favor, digite novamente: ", minimo, maximo);
				valor = teclado.nextInt();
		}
		return valor;
	}
	//lê um valor double e verifica se o mesmo está em um intervalo predefinido
	//Mensagem se refere à mensagem a ser exibida ao usuário quando da requisição da entrada
	public double leDoubleIntervalo(String mensagem, double minimo, double maximo){
		double valor;
		System.out.println(mensagem);
		valor = teclado.nextDouble();
		
		while(valor < minimo || valor > maximo){
				System.out.printf("O valor digitado deve estar entre %.2f e %.2f." + " Por favor, digite novamente: ", minimo, maximo);
				valor = teclado.nextDouble();
		}
	return valor;
	}
}