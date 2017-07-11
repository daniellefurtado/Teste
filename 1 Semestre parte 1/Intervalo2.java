import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Intervalo2 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        
        int positivosN, valoresX, in = 0, out = 0;
        positivosN = teclado.nextInt(); 
        
        for (int count = 0; count < positivosN; count++){
            valoresX = teclado.nextInt();
            if ((valoresX >= 10) && (valoresX <= 20)){
				in++;
            }else {
				out++;
			}
			
			
        }
         System.out.println(in + " in");
		 System.out.println(out + " out");
        }
    }    

        
 
    
 
