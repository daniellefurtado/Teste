import java.io.IOException;
import java.util.Scanner;
public class Experiencias {
 
    public static void main(String [] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
		
		String tipo;
		int numeroTestes, totalCobaias, quantiaCoelhos = 0, quantiaSapos = 0, quantiaRatos = 0;
		double perRatos, perSapos, perCoelhos;
		numeroTestes = teclado.nextInt();
		
		for(int cont = 1; cont <= numeroTestes; cont++){
			int numero = teclado.nextInt();
			
			tipo = teclado.next();
			if(tipo.equalsIgnoreCase("C")){
				quantiaCoelhos += numero; 
			}
			else if(tipo.equalsIgnoreCase("R")){
				quantiaRatos += numero;
			}
			else if(tipo.equalsIgnoreCase("S")){
				quantiaSapos += numero;
			}
		}
		
		totalCobaias = quantiaCoelhos + quantiaRatos + quantiaSapos;
		perRatos = ((quantiaRatos*100.00)/totalCobaias * 1.0);
		perCoelhos = ((quantiaCoelhos*100.00)/totalCobaias * 1.0);
		perSapos = ((quantiaSapos*100.00)/totalCobaias * 1.0);

		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + quantiaCoelhos);
		System.out.println("Total de ratos: " + quantiaRatos);
		System.out.println("Total de sapos: " + quantiaSapos);
		
		System.out.printf("Percentual de coelhos: %.2f", perCoelhos);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", perRatos);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", perSapos);
		System.out.print(" %\n");
	}
}