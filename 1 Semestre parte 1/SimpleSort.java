import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SimpleSort {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        
        int num1, num2, num3;
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        
        if (num1 < num2 && num2 < num3)
        {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println();
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            
        }
        
        else if (num1 < num3 && num3 < num2)
        {
         System.out.println(num1);
         System.out.println(num3);
         System.out.println(num2);
         System.out.println();
         System.out.println(num1);
         System.out.println(num2);
         System.out.println(num3);
        }
       
        else if (num2 < num1 && num1 < num3){
      System.out.println(num2);
      System.out.println(num1);
      System.out.println(num3);
      System.out.println();
      System.out.println(num1);
      System.out.println(num2);
      System.out.println(num3);
         }else if (num3 < num2 && num2 < num1){
	  System.out.println(num3);
      System.out.println(num2);
      System.out.println(num1);
      System.out.println();
      System.out.println(num1);
      System.out.println(num2);
	  System.out.println(num3); 
	  }else if (num2 < num3 && num3 < num1){
	System.out.println(num2);
      System.out.println(num3);
      System.out.println(num1);
      System.out.println();
      System.out.println(num1);
      System.out.println(num2);
	  System.out.println(num3); 
	  }else if (num3 < num1 && num1 < num2){
	  System.out.println(num3);
      System.out.println(num1);
      System.out.println(num2);
      System.out.println();
      System.out.println(num1);
      System.out.println(num2);
	  System.out.println(num3); 
	  }
	  
    }
 //231 312
}
