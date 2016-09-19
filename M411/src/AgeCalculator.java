import java.util.Scanner;
import java.util.Calendar;

public class AgeCalculator {
    public void tellAge(){
        Scanner s = new Scanner(System.in);
        System.out.println("Geben sie ihren namen ein:");
        String a = s.next();
        System.out.println("Geben sIe noch ihren Jahrgang ein:");
        int b = s.nextInt();
        System.out.println("Hallo, "+ a +". Sie sind " + (Calendar.getInstance().get(Calendar.YEAR)- b)+" alt.");
    }
    public static void main(String[] args){
        AgeCalculator Bro = new AgeCalculator();
        Bro.tellAge();
    }
}
