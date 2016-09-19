/**
 * Created by Fabrice on 22.08.2016.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;

import static java.lang.Integer.*;

public class BufferReader {

    public boolean convert(String a) {
        try {
            parseInt(a);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Fabrice\\Documents\\Module TBZ\\M411\\FileReader.txt";
        BufferReader s = new BufferReader();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    String[] msg = line.split(";");

                    for (int i = 0; i < msg.length; i++) {
                        if (s.convert(msg[i])) {
                            int a = parseInt(msg[i]);
                            System.out.println(msg[i] + " " + (2016 - a));
                        } else {
                            System.out.println(msg[i]);
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}