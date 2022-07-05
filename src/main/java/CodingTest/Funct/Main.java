package CodingTest.Funct;


import CodingTest.Hashset;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Test{

    void d(){

        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashSet<Integer> hashSet2 = new HashSet<Integer>();

        for (int a = 1; a<=100; a++) {

            //123
            String b = Integer.toString(a);
            int sum = 0;
            for (int i = 0; i<b.length(); i++){

                sum += Integer.parseInt(String.valueOf(b.charAt(i)));
            }
            hashSet.add(a);
            hashSet2.add((a + sum));

            hashSet.removeAll(hashSet2);
        }

//        ArrayList<List>


        for (Integer result: hashSet
        ) {
            System.out.println(result);
        }

    }



    }




public class Main {
    public static void main(String[] args) {


        Test t1 = new Test();

        t1.d();



    }
}
