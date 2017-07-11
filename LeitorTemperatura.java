public class LeitorTemperatura{
	private LeituraValidada leitorDados;
	private int dia;
	private int mes;
	private int ano;
	private String cidade;
	private double [] temperaturas = new double[3];	
	double soma = 0.0;
	//variavelCaso refere-se aos dados recolhidos naquele caso
	public LeitorTemperatura(String cidadeCaso, int diaCaso, int mesCaso, int anoCaso){
		leitorDados = new LeituraValidada();
		cidade = cidadeCaso;
		dia = diaCaso;
		mes = mesCaso;
		ano = anoCaso;
	}
	
	public void lerTemperatura(int periodo){
		temperaturas[periodo] = leitorDados.leDoubleIntervalo("Por favor, digite a temperatura: ", -100, 70);
	
	for(int i = 0; i < temperaturas.length; i++)
		soma += temperaturas[periodo];
	}
	public double imprimeTemperatura(){
	}
	
	public double mediaTemperatura(){
		System.out.printf("A média das temperaturas na cidade de %s é: ", soma/3);
	}
}