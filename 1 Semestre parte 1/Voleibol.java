import java.util.Scanner;
public class Voleibol {
	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);
		
		int jogadores, tentativaSaque = 0, tentativaBloqueio = 0, tentativaAtaque = 0, sucessoSaque = 0, sucessoBloqueio = 0, sucessoAtaque = 0;
		int totalSaque = 0, totalBloqueio = 0, totalAtaque = 0, acertoSaque = 0, acertoBloqueio = 0, acertoAtaque = 0;
		double perAtaque = 0, perBloqueio = 0, perSaque = 0;
		String nome;
		jogadores = teclado.nextInt();
		
		for(int cont = 0; cont < jogadores; cont++){
			nome = teclado.next();
			tentativaSaque = teclado.nextInt();
			tentativaBloqueio = teclado.nextInt();
			tentativaAtaque = teclado.nextInt();
			sucessoSaque = teclado.nextInt();
			sucessoBloqueio = teclado.nextInt();
			sucessoAtaque = teclado.nextInt();
			acertoSaque += sucessoSaque;
			acertoBloqueio += sucessoBloqueio;
			acertoAtaque += sucessoAtaque;
			totalSaque += tentativaSaque;
			totalBloqueio += tentativaBloqueio;
			totalAtaque += tentativaAtaque;
		}
		perSaque = (acertoSaque * 100.00)/totalSaque * 1.0;
		perBloqueio = (acertoBloqueio * 100.00)/totalBloqueio * 1.0;
		perAtaque = (acertoAtaque * 100.00)/totalAtaque * 1.0;
		
		System.out.printf("Pontos de Saque: %.2f %%.\n", perSaque);
		System.out.printf("Pontos de Bloqueio: %.2f %%.\n", perBloqueio);
		System.out.printf("Pontos de Ataque: %.2f %%.\n", perAtaque);
	}
}