public class ProvaTeste{
	public static void main(String [] args){
		Prova p1, p2;
		p1 = new Prova("Huguinho", 1234);
		p2 = new Prova("Zezinho", 3456);
		
		p1.setNota();
		p2.setNota();
		
		System.out.printf("A nota do aluno %s é %.2f.\n", p1.getNome(), p1.getNota());
		System.out.printf("A nota do aluno %s é %.2f.\n", p2.getNome(), p2.getNota());
	}
}