import java.util.Scanner;
public class Grenais{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int golInter, golGremio, vitoriaInter = 0, vitoriaGremio = 0, empate = 0, grenais =0;
		
		do{
			golInter = teclado.nextInt();
			golGremio = teclado.nextInt();
			
			if(golGremio > golInter){
				vitoriaGremio++;
			}
			else if(golGremio < golInter) {
				vitoriaInter++;
			}
			else
				empate++;
			
			grenais++;
			System.out.println("Novo grenal (1-sim 2-nao)");
		}while(teclado.nextInt() != 2);
		
		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + vitoriaInter);
		System.out.println("Gremio:" + vitoriaGremio);
		System.out.println("Empates:" + empate);
		
		if(golInter > golGremio) {
			System.out.println("Inter venceu mais");
		}
			else if(golInter < golGremio) {
				System.out.println("Gremio venceu mais");
			}
		}
	}