package Programmers;

import java.util.HashMap;

public class SumPlusMinus {

    public static void main(String[] args) {
        int[] absolutes = {12,1000,1,50};
        boolean[] signs = {false,true,false,true};

        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        System.out.println(answer);
    }
}
