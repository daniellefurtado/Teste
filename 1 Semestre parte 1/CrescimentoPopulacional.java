import java.util.Scanner;
public class CrescimentoPopulacional{
	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);
		
		int numeroDeCasos, populacaoA = 0, populacaoB = 0, anos = 0;
		double crescimentoA = 0, crescimentoB = 0;
		
		numeroDeCasos = teclado.nextInt();
		
		for(int cont = 1; cont <= numeroDeCasos; cont++){
			populacaoA = teclado.nextInt();
			populacaoB = teclado.nextInt();
			crescimentoA = teclado.nextDouble();
			crescimentoB = teclado.nextDouble();
		
			if(crescimentoA <= crescimentoB)
		{
			System.out.println("Mais de 1 seculo.");
		}
			else
		{
			for(anos = 0; populacaoA <= populacaoB && anos <= 100; anos++)
		{
			populacaoA = (int)(populacaoA * ((crescimentoA / 100) + 1));
			populacaoB = (int)(populacaoB * ((crescimentoB / 100) + 1));
		} 
			if (anos > 100)
				System.out.println("Mais de 1 seculo.");
			else
				System.out.println(anos + " anos.");
		}
		}
		}
	}
	
/*
C:\Users\Danielle\Desktop\College Stuff\CODE>javac CrescimentoPopulacional.java
CrescimentoPopulacional.java:17: error: incompatible types: possible lossy conversion from float to int
                        populacaoA = (populacaoA * (crescimentoA/100));
                                                 ^
CrescimentoPopulacional.java:18: error: incompatible types: possible lossy conversion from float to int
                        populacaoB = (populacaoB * (crescimentoB/100));
                                                 ^
2 errors
*/
		