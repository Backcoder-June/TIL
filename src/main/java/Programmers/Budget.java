package Programmers;


import java.util.ArrayList;
import java.util.Collections;

public class Budget {
    public static void main(String[] args) {

        int answer = 0 ;
        int[] d = {2,1,3,4,5,2};
        int budget = 1;

        ArrayList list = new ArrayList();

        for (int eachd: d
             ) {
            list.add(eachd);
        }

        Collections.sort(list);

        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += (int)list.get(i);

            if (budget < sum) {
                break;
            }else {answer++;}
        }

        System.out.println(answer);






    }
}
