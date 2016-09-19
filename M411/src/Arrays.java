import java.util.*;

public class Arrays {
    private static int minMax(int[] a, int flag) {

        if (flag == 0) {
            int var = 100000;
            for (int i = 0; i < a.length; i++) {
                if (var > a[i]) {
                    var = a[i];
                }
            }
            return var;
        }
        if (flag == 1) {
            int var = 0;
                for (int i = 0; i < a.length; i++) {
                    if (var < a[i]) {
                        var = a[i];
                    }
            }
            return var;
        }
        else{
            return 0;
        }
    }

    private static void sort(){
        Scanner s = new Scanner(System.in);
        System.out.println("Geben sie ihre Ziffern ein:");
        String input = s.next();

        String[] array = new String[input.length()];

        int a = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toString(input.charAt(array.length - a));
            a++;
        }
        for(String e : array){
            System.out.print(e + ", ");
        }

    }

    private static void bubblesort(int[] a){
        int var;

        for (int i = 1; i < a.length; i++){
            for (int j = 0; j < a.length - i; j++) {
                if(a[j] > a[j + 1]){
                    var = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = var;
                }
            }
        }
        for(int f : a){
            System.out.print(f + ", ");
        }
    }

    private static void selectionsort(int[] a){
    }

    public static void main(String[] args){

        System.out.println("1:sort() ; 2:MIN / Max ; 3:Bubblesort");
        Scanner s = new Scanner(System.in);

        int flag = s.nextInt();
        int[] a = {1000000,20,3,34,5,100,36,7,48,1000,234,2,234234,222,4,5,454,2346,45455,555,444546,225,89};

        switch(flag){
            case 1:{
                sort();
                break;
            }
            case 2:{
                System.out.println("Die höchste Zahl in dem Array ist: " + minMax(a , 1) + " und die kleinest Zahl ist: " + minMax(a , 0));
                break;
            }
            case 3:{
                bubblesort(a);
                break;
            }
            case 4:{
                selectionsort(a);
                break;
            }
        }
    }
}
