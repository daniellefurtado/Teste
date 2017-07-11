import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class FelizNatal {
public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        
        int num, i;
        num = teclado.nextInt();
        i = 0;
        System.out.print("Feliz nat");
        
        for(i = 1; i <= num; i++){
            System.out.print("a");
        }
        
        System.out.println("l!");
 
    }
 
}