package Programmers;

import java.util.HashSet;
public class Lotto {
    public static void main(String[] args) {

        int[] lottos = {0, 0, 0, 0, 5, 17};

        int[] win_nums = {31, 10, 45, 1, 6, 19};

        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet();
        for (int i = 0; i < 6; i++) {
            set1.add(lottos[i]);
            set2.add(win_nums[i]); }

        int zero = 0;
        if (set1.contains(0)) {
            zero = 6 - set1.size() + 1; }

//        set2.removeAll(set1);

        set2.retainAll(set1);

        int b = set2.size();

        System.out.println(b);

        int max = 7;
        int min = 7;

        for (int i = 6; i >=0; i--) {
            if ( b == i) {
                max = max - i - zero;
                min = min - i;
                break;}
        }

        if ( max>6){max = 6;}
        if ( min>6){min = 6;}

        int[] answer = {max, min};
        System.out.println(answer[0] + " " +answer[1]);
    }
}