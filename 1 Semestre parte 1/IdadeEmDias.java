import java.util.Scanner;
public class IdadeEmDias{
 
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        
        int ageDays, years, months, days;
        ageDays = teclado.nextInt();
        
		years = ageDays /365;
        months = (ageDays%365)/30;
        days = (ageDays % 365) % 30;
        
       System.out.println(years + " ano (s)");
       System.out.println(months + " mes (es)");
       System.out.println(days + " dia (s)");
 
    }
 
}
//compilado com sucessooooo (passar pro URI)