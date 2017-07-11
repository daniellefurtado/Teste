import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Fatorial {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        
        int numero, cont = 1, fatorial = 1;
        numero = teclado.nextInt();
       
	   for (cont = 1; cont <= numero; cont++){
				fatorial = fatorial * cont; 
		}
            System.out.println(fatorial);
		
    }
 
}
