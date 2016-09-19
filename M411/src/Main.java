
public class Main {
    public String name1;
    public String name2;

    public Main(String name1, String name2){
        setName(name1,name2);
    }
    public void setName(String name1,String name2){
        this.name1 = name1;
        this.name2 = name2;
    }
    public void msg(){
        System.out.println("Die namen sind: " + name1 + " und " + name2);
    }
    public static void main (String[] args){
        Main main = new Main("Hans","Müller");
        main.msg();

   }
}
