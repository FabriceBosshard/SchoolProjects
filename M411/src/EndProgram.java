/**
 * Created by Fabrice on 22.08.2016.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.util.Scanner;

import static java.lang.Integer.*;

public class EndProgram {
    public static void main(String[] args){
        String fileName= "C:\\Users\\Fabrice\\Documents\\_TBZ\\Module TBZ\\M411\\FileReader.txt";
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;

            Scanner r = new Scanner(System.in);
            System.out.println("Bitte geben sie einen Namen ein:");
            String f = r.next();

            try{
                while((line = br.readLine()) != null){
                    String[] msg = line.split(";");
                    for(int i = 0; i < msg.length; i++) {
                        if (msg[i].equalsIgnoreCase(f)) {
                            int a = Integer.parseInt(msg[i + 2]);
                            System.out.println("Hallo " + msg[i] + " " + msg[i + 1] + ". Sie sind im Jahr " + msg[i + 2] + " geboren und sie sind " + (2016 - a) + " Jahre alt.");
                        }
                    }
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