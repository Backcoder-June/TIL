package Campus.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FileReader_Scanner {
    public static void main(String[] args) throws IOException {


        FileReader fr = new FileReader("b.txt");

        Scanner sc = new Scanner(fr);
        String name = sc.next();
        int id = sc.nextInt();
        double pay = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("#,###.00");

        String line = name + "사원의 사번은 " + id + "이고, 연봉은 " + df.format(pay*12) + "원 입니다.";

        System.out.println(line);

        FileWriter fw = new FileWriter("b.txt",true);

        fw.write("\n"+ line);
        fw.close();
        fr.close();
        sc.close();

    }
}
