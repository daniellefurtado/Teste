public class Prova{
	private LeituraValidada leitorDados;
	private String nomeAluno;
	private int rgaAluno;
	private double notaAluno;
	
	public Prova(String nome, int rga){
		leitorDados = new LeituraValidada();
		nomeAluno = nome;
		rgaAluno = rga;
		notaAluno = 0;
	}
	public double getNota(){
		return notaAluno;
	}
	public int getRga(){
		return rgaAluno;
	}
	public String getNome(){
		return nomeAluno;
	}
	public void setNota(){
		notaAluno = leitorDados.leDoubleIntervalo("Por favor, digite a nota do aluno " + nomeAluno, 0, 10);
	}
}