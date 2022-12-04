package Programmers;

import java.util.*;

public class numberMatching {
    public static void main(String[] args) {
        String X = "100";
        String Y = "2345";





/*
        Set<String> set = new HashSet<>();
        for (int i = 0; i < X.length(); i++) {
            if (!set.contains(String.valueOf(X.charAt(i)))) {

                set.add(String.valueOf(X.charAt(i)));
            } else {
                set.add(String.valueOf(X.charAt(i) + i));
            }
        }
*/

        String[] sX = X.split("");
        String[] sY = Y.split("");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < sX.length; i++) {
            for (int j = 0; j < sY.length; j++) {
                if (sX[i].equals(sY[j])) {
                    list.add(sX[i]);
                    sY[j] = "*";
                    break;
                }
            }
        }

        Collections.sort(list);
        Collections.reverse(list);

        String answer = "";
        for (String a:list
             ) {
            answer += a;
        }

        if (answer.equals("")) {
            answer = "-1";
        }

        if (Integer.parseInt(answer) == 0) {
            answer = "0";
        }

        System.out.println(answer);



   /*     List<String> ylist = new ArrayList<>();
        for (int i = 0; i < sY.length; i++) {
            ylist.add(sY[i]);
        }


        List<String> matching = new ArrayList<>();
        for (int i = 0; i < X.length(); i++) {
            if (ylist.contains(sX[i])) {
                matching.add(sX[i]);

            }

        }*/

    }
}
