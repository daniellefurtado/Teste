import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Multiplos {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2;
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
		
        if (num1 % num2 == 0 || num2 % num1 == 0)
            System.out.println("Sao Multiplos");
		
        else 
            System.out.println("Nao sao Multiplos");
 
    }
 
}