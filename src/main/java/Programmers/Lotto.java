package Programmers;

import java.util.HashSet;

public class Lotto {
    public static void main(String[] args) {


        int[] lottos = {44, 1, 0, 0, 31, 25};

        int[] win_nums = {31, 10, 45, 1, 6, 19};



        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet();
        for (int i = 0; i < 6; i++) {
            set1.add(lottos[i]);
            set2.add(win_nums[i]);
        }

        int zero = 6 - set1.size();

        set1.






    }
}
