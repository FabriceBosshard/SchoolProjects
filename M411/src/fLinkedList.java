/**
 * Created by Fabrice on 05.09.2016.
 */
public class fLinkedList {

    private Node head;
    private static int counter;

    public fLinkedList(){

    }

    public void add(Object data) {

        // Initialize Node only incase of 1st element
        if (head == null) {
            head = new Node(data);
        }

        Node crunchifyTemp = new Node(data);
        Node crunchifyCurrent = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (crunchifyCurrent != null) {

            // starting at the head node, crawl to the end of the list and then add element after last node
            while (crunchifyCurrent.getNext() != null) {
                crunchifyCurrent = crunchifyCurrent.getNext();
            }

            // the last node's "next" reference set to our new node
            crunchifyCurrent.setNext(crunchifyTemp);
        }

        // increment the number of elements variable
        incrementCounter();
    }
    private static int getCounter() {
        return counter;
    }
    private static void incrementCounter() {
        counter++;
    }
    private void decrementCounter() {
        counter--;
    }

    public void add(Object data, int index) {
        Node crunchifyTemp = new Node(data);
        Node crunchifyCurrent = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (crunchifyCurrent != null) {
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index && crunchifyCurrent.getNext() != null; i++) {
                crunchifyCurrent = crunchifyCurrent.getNext();
            }
        }

        // set the new node's next-node reference to this node's next-node reference
        crunchifyTemp.setNext(crunchifyCurrent.getNext());

        // now set this node's next-node reference to the new node
        crunchifyCurrent.setNext(crunchifyTemp);

        // increment the number of elements variable
        incrementCounter();
    }

    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";

        if (head != null) {
            Node crunchifyCurrent = head.getNext();
            while (crunchifyCurrent != null) {
                output += "[" + crunchifyCurrent.getData().toString() + "]";
                crunchifyCurrent = crunchifyCurrent.getNext();
            }

        }
        return output;
    }
    public boolean remove(int index) {

        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;

        Node crunchifyCurrent = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (crunchifyCurrent.getNext() == null)
                    return false;

                crunchifyCurrent = crunchifyCurrent.getNext();
            }
            crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());

            // decrement the number of elements variable
            decrementCounter();
            return true;

        }
        return false;
    }

    public Object get(int index)
    {
        if (index <= 0)
            return null;
        Node crunchifyCurrent = null;
        if (head != null) {
            crunchifyCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (crunchifyCurrent.getNext() == null)
                    return null;

                crunchifyCurrent = crunchifyCurrent.getNext();
            }
            return crunchifyCurrent.getData();
        }
        return crunchifyCurrent;

    }
    public fLinkedList changeOrder(fLinkedList input) {

        for (int i = input.size() - 1; i >= 0; i--) {
            System.out.println(input.get(i));
        }

        return input;
    }
}
