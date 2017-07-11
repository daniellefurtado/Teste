import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class MediasPonderadas {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        
        int numN;
        double num1, num2, num3, media1, media2, media3, media;
        numN = teclado.nextInt();
 
        
       for (int i = 0; i < numN; i++){
               num1 = teclado.nextDouble();
				num2 = teclado.nextDouble();
				num3 = teclado.nextDouble();
			 media1 = num1 * 2;
             media2 = num2 * 3;
             media3 = num3 * 5;
             media = (media1 + media2 + media3)/ 10; 
             System.out.printf("%.1f\n", media);
        }
	}
    }