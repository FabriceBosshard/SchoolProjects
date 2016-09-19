import java.util.*;

/**
 * Created by Fabrice on 05.09.2016.
 */
public class LLFoolaround {
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<>();

        System.out.println("Bitte geben sie etwas ein: ");
        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();
        String[] parts = userInput.split(" ");

        for(String i : parts){
            cars.add(i);
        }

        for (int i = cars.size() - 1; i >= 0 ; i--) {
            System.out.print("[" + cars.get(i) + "]");
        }

    }

}
