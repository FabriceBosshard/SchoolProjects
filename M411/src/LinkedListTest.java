import java.util.*;
public class LinkedListTest {

    public static void main(String[] args){
        fLinkedList babo = new fLinkedList();
        System.out.println("Bitte geben sie etwas ein: ");
        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();
        String[] parts = userInput.split(" ");

        for(String i : parts){
            babo.add(i);
        }

        babo.changeOrder(babo);




    }
}
