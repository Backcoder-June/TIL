package CodingTest.IO_If_For_Array;

import java.io.*;
import java.util.StringTokenizer;

public class AB5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            StringTokenizer tk = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(tk.nextToken());
            int B = Integer.parseInt(tk.nextToken());


            if (A == 0 && B == 0 ){ break;}
            else { bw.write(A+B + "\n"); }

            bw.flush();
        }

        bw.close();
        br.close();

    }
}
