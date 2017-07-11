import java.util.Scanner;
public class Temperatura{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		String nomeCidade;
		int nDia, nMes, nAno;
		LeitorTemperatura leitor;
		
		nomeCidade = teclado.nextLine();
		nDia = teclado.nextInt();
		nMes = teclado.nextInt();
		nAno = teclado.nextInt();
		
		leitor = new LeitorTemperatura(nomeCidade, nDia, nMes, nAno);
		leitor.leTemperaturas(0);
		leitor.leTemperaturas(1);
		leitor.leTemperaturas(2);	
		
		public double imprimeTemperatura(){
		for(int i = 0; i < temperaturas.length; i++)
		System.out.printf("Temperatura da manhã: %.2f\n", temperaturas[periodo]);
		}
	}
}