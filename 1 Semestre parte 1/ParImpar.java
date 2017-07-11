import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ParImpar {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        
        int valor, contPar, contImpar, contPositivo, contNegativo; 
		contPar = 0;
        contImpar = 0;
        contPositivo = 0;
        contNegativo = 0;
      for(int cont = 1; cont <= 5; cont++){
          valor = teclado.nextInt();
          if(valor % 2==0)
            contPar++;
            if (valor % 2 != 0)
            contImpar++;
            if (valor > 0)
            contPositivo++;
            if (valor < 0)
            contNegativo++;
      }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivo + " valor(es) positivo(s)");
        System.out.println(contNegativo + " valor(es) negativo(s)");
    }
 
}
//compilado com sucesso