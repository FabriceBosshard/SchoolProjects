import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;

public class BufferedReader2 {

    public static void main(String[] args){
        String fileName= "C:\\Users\\Fabrice\\Documents\\Module TBZ\\M411\\FileReader.txt";
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            try{
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
