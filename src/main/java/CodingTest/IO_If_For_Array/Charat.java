package CodingTest.IO_If_For_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Charat {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String target = Integer.toString(A*B*C) ;
        //17037325
        br.close();


        for (int i = 0; i<=9; i++){
            int count = 0;
            for (int j = 0; j< target.length(); j++ ){

                if ( (target.charAt(j)) - '0' == i ){
                    count++;
                }

            }

            System.out.println(count);
        }





    }
}
