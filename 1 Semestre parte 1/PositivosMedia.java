import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class PositivosMedia {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        
        float valor, media = 0;
        int count, positivos = 0;
     for (count = 0; count < 6; count++)
		 
		 {	 
		    valor = teclado.nextFloat();
		    if (valor >= 0)
			positivos++;
			media += valor;  
          }
		   System.out.println(count + " valores positivos\n");
           System.out.printf("%.1f\n", media/positivos);
    }
 
}