package CodingTest.IO_If_For_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxIndex {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];

        int index = 0;
        int Max = 0;
        for (int i = 0; i<9 ; i++){
            array[i] = Integer.parseInt(br.readLine());

        if (array[i]>Max){
            Max = array[i];
            index =i+1;
        }
        }
        br.close();
        System.out.println(Max + " " + index);
    }
}
