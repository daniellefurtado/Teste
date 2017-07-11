import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class QualTriangulo {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        int lado1, lado2, lado3, maior, menor;
        lado1 = teclado.nextInt();
        lado2 = teclado.nextInt();
        lado3 = teclado.nextInt();
        
        if (lado1 == lado2 && lado2 == lado3){
           System.out.println("Valido-Equilatero");
           if (lado1 * lado1 + lado2 * lado2 == lado3 * lado3){
           System.out.println("Retangulo:S");
                else if{
                    System.out.println("Retangulo:N");
           }
          }
		}
        if (lado1 != lado2 && lado2 != lado3){
            System.out.println("Valido-Escaleno");
            if (lado1 * lado1 + lado2 * lado2 == lado3 * lado3){
           System.out.println("Retangulo:S");
                else if{
                    System.out.println("Retangulo:N");
				}
        }
        }
        if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("Valido-Isosceles");
            if (lado1 * lado1 + lado2 * lado2 == lado3 * lado3){
           System.out.println("Retangulo:S");
                else if{
                    System.out.println("Retangulo:N");
				}
            }
			}
    }
}