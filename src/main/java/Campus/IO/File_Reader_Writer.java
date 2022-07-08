package Campus.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Reader_Writer {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = null;
        FileWriter fw = null;
        String inputfile = "a.txt";
        String outputfile = "d.txt";

        try {
            fr = new FileReader(inputfile);
            fw = new FileWriter(outputfile, true);

            Scanner sc = new Scanner(fr);
            int i = 1;
                while (sc.hasNextLine()){
                    fw.write("라인" + i + " : ");
                    fw.write(sc.nextLine()+"\n");
                    i++; }

                /*int result = fr.read();
            if (result == -1) {break;}
                fw.write((char)result);
*/
        } catch (IOException e) {e.printStackTrace(); }

        finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {}
        }



    }
}
