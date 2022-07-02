package CodingTest;

import java.io.*;
import java.util.StringTokenizer;

public class Buffered {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int a = 0; a<T; a++){
            StringTokenizer tk = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(tk.nextToken());
            int B = Integer.parseInt(tk.nextToken());

            bufferedWriter.write((A+B) +"\n");      }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}






//            String AA = bufferedReader.readLine();
//            String BB = bufferedReader.readLine();
//
//            StringTokenizer stringTokenizer = new StringTokenizer(AA);
//            int A = Integer.parseInt(stringTokenizer.nextToken());
////            int B = Integer.parseInt(stringTokenizer.nextToken());


//            int A = Integer.parseInt(bufferedReader.readLine());
//            int B = Integer.parseInt(bufferedReader.readLine());
//
//
//
//            bufferedWriter.write(A+B);
//            bufferedWriter.flush();
//            bufferedWriter.close();

