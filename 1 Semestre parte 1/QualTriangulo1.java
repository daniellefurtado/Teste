import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class QualTriangulo1 {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        
		int lado1, lado2, lado3, aux;
        lado1 = teclado.nextInt();
        lado2 = teclado.nextInt();
        lado3 = teclado.nextInt();
		  
		if(Math.abs(lado2 - lado3) >= lado1 || lado2 + lado3 <= lado1 || 
		   Math.abs(lado1 - lado3) >= lado2 || lado1 + lado3 <= lado2 || 
		   Math.abs(lado1 - lado2) >= lado3 || lado1 + lado2 <= lado3){
		  System.out.println("Invalido");
		}
		else{
		  //verificando qual tipo de triangulo
		  if (lado1 == lado2 && lado2 == lado3){
			System.out.println("Valido-Equilatero");
		  }
          else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("Valido-Escaleno");
		  }
		  else {
            System.out.println("Valido-Isoceles");
		  }
		  
		  if(lado1 * lado1 + lado2 * lado2 == lado3 * lado3 ||
		     lado1 * lado1 + lado3 * lado3 == lado2 * lado2 ||
			 lado2 * lado2 + lado3 * lado3 == lado1 * lado1)
			System.out.println("Retangulo: S");
		   else
			System.out.println("Retangulo: N");
		}
			
			
		}
	}
