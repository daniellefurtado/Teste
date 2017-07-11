import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1143 {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int linhas;
        linhas = teclado.nextInt();
        
        for(int cont = 1; cont < linhas; cont*2){
            System.out.println("%d %d %d\n", cont + cont * 2 + ((cont * 2) *2));
        }
 
    }
 
}