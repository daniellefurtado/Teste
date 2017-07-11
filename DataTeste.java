public class DataTeste {

    public static void main(String[] args) {
        int diaA = 11;
        int mesA = 07;
        int anoA = 2017;
        LeitorData leitor = new LeitorData(diaA, mesA, anoA);
         
        leitor.imprimeData();
    }
}

