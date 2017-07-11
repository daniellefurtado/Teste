import java.util.Scanner;
public class OEscolhido{
	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);
		
		int alunos, matricula, matMaiorNota = 0;
		float nota, maiorNota = 0;
		alunos = teclado.nextInt();
		
		for(int cont = alunos; cont >= 1; cont--){
			matricula = teclado.nextInt();
			nota = teclado.nextFloat();
			if(nota > maiorNota){
				maiorNota = nota;
				matMaiorNota = matricula;
			}
		}
		if(nota >= 8){
			System.out.println(matMaiorNota);
		}else 
			System.out.println("Minimum note not reached");
	}
}
