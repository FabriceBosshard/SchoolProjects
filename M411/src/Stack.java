public class Stack {
    //reference to the first element in stack (=last added element)
    private Node first;
    //counter
    private int listCount;

    public Stack(){
        listCount = 0;
    }
    public void push(Object value){

        //the new element is the last in the list:
        Node current = first;
        first = new Node(value);
        first.setNext(current);
        listCount++;
    }
    public Object pop(){

        Object value = first.getData();
        first = first.getNext(); //now next element is the first
        listCount--;
        return value;
    }
    public void peek(){
        Object value = first.getData();
        System.out.println(value + ", ");
    }
    public void showElements(){
        while(first != null){
            Object value = first.getData();
            System.out.print(value);
            if(first.getNext() == null){
                break;
            }
            else{
                first = first.getNext();
            }

        }
    }
    public boolean isEmpty(){
        if(first == null){
            return false;
        }
        else{
            return true;
        }
    }
}
