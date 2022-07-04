package Campus.Ch11_langLibrary;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class System_In_Test {
    public static void main(String[] args) throws IOException {

        try {
            System.out.println((char)(System.in.read()));  // 키보드 1개 값 , 문자 유니코르 숫자로 줌
        }
        catch (IOException e ){ e.printStackTrace();}


        /*Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
*/
/*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());

        bw.write(a + b + "");
        bw.flush();
        bw.close();
        br.close();

*/




    }
}
