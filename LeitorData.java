/*
	DATA 
- VETOR: int[12]
-DIA: int
-MES-int
-ANO-int
<<CONSTRUTOR>>+DATA(dia: int, mes: int, ano: int)
+ get dataHoje()
+ get dataAmanha()
+ get dataOntem()
+ imprimeSaida()
*/



public class LeitorData {

    private int dia;
    private int mes;
    private int ano;
    //private int vetor [] = new int [12];

    public LeitorData(int diaA, int mesA, int anoA) {

        this.dia = diaA;
        this.mes = mesA;
        this.ano = anoA;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int diaA) {
        this.dia = diaA;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mesA) {
        this.mes = mesA;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int anoA) {
        this.ano = anoA;
    }

    public void imprimeData() {
        System.out.printf("Hoje: " + getDia() + "/" + getMes() + "/" + getAno());
        System.out.printf("Amanhã: " + (getDia() + 1) + "/" + getMes() + "/" + getAno());
        System.out.printf("Ontem: " + (getDia() - 1) + "/" + getMes() + "/" + getAno());
    }

}
