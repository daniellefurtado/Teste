import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Resto2 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        
        int numN, i;
        numN = teclado.nextInt();
        
        for (int cont=1; cont<=10000; cont++)
			
        {
            if (cont % numN == 2) 
            {
                System.out.println(cont);
            }
        }
    }
}