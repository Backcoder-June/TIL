package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine().toLowerCase();

        int[] countlist = new int[26];

        for (int j = 0; j < S.length(); j++) {


            for (int i = 97; i < 123; i++) {
                if (S.charAt(j) == (char) i) {

                    countlist[i - 97]++;
                }
            }
        }


        int max = -1;
        char same = 0;
        for (int i = 0; i < 26; i++) {
            if (countlist[i] > max){
                max = countlist[i];
                same = (char) (i + 65);
            }else if( countlist[i] == max ){
                same = '?';
            }
        }
        System.out.println(same);
    }}
//
//        int check = 0;
//        int target = 0;
//        while ( check < 26 ){
//            if (countlist[check]> max){
//                max = countlist[check];}
//            check++;}
//        System.out.println((String.valueOf((char)(check + 97))).toUpperCase());
//
//    }
//}
//


        //
//
//        for (int b = 0; b < 26; b++) {
//            if (countlist[b] > max) {
//                max = countlist[b];
//                System.out.println((String.valueOf((char)(b + 97))).toUpperCase());
//            }
//            else if( countlist[b] == max ){
//                      System.out.println("?"); }
//        }

