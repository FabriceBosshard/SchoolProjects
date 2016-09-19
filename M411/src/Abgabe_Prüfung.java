import java.util.*;

public class Abgabe_Prüfung {

    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char[] charArray = a.toCharArray();

        Stack list = new Stack();

        for (char b:charArray){
            list.push(b);
        }
        list.showElements();

    }

}
