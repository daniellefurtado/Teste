import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Animais {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        
        String entrada; 
        entrada = teclado.next();
        
        if(entrada.equalsIgnoreCase("vertebrado")){
                entrada = teclado.next();
                   if(entrada.equalsIgnoreCase("ave"))
					    entrada = teclado.next();
							if(entrada.equalsIgnoreCase("carnivoro")){
								System.out.println("aguia");
							}else if(entrada.equalsIgnoreCase("onivoro"))
								System.out.println("pomba");
					if(entrada.equalsIgnoreCase("mamifero")){
						entrada = teclado.next();
						if(entrada.equalsIgnoreCase("onivoro")){
							System.out.println("homem");
						}else if (entrada.equalsIgnoreCase("herbivoro"))
							System.out.println("vaca");
					}
		}
		if(entrada.equalsIgnoreCase("invertebrado")){
				entrada = teclado.next();
				  if(entrada.equalsIgnoreCase("inseto"))
					  entrada = teclado.next();
						if(entrada.equalsIgnoreCase("hematofago")){
							System.out.println("pulga");
						}else if(entrada.equalsIgnoreCase("herbivoro"))
							System.out.println("lagarta");
				  if(entrada.equalsIgnoreCase("anelideo")){
					  entrada = teclado.next();
					  if(entrada.equalsIgnoreCase("hematofago")){
						  System.out.println("sanguessuga");
					  }else if(entrada.equalsIgnoreCase("onivoro"))
						  System.out.println("minhoca");
					  
				  }
			}
	}
}
//compilado
                                
    