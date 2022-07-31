package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ReportResult {
    public static void main(String[] args) {

        String[] id_list = {"a", "b", "c", "d"};
        String[] report = {"a b", "b a", "c b", "b a", "d a", "b c", "d b" };

        HashSet<String> reportSet = new HashSet<>();

        for (int a =0; a< report.length; a++){
            reportSet.add(report[a]);
        }

        int k = 2;

        int[] answer= new int[id_list.length];

        ArrayList<String> attacked = new ArrayList<>();

        for (String rep: reportSet
             ) {
            attacked.add(rep.split(" ")[1]);
        }

        //b d b d a
        Collections.sort(attacked);
// a b b d d

        HashSet<String> ban  = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < attacked.size(); j++) {
            sb.append(attacked.get(j));
        }
// abbbbdddd

        for (int i = 0; i < id_list.length; i++) {
            StringBuilder count = new StringBuilder();

            for (int j = 0; j < k; j++) {
                count.append(id_list[i]);
            }


            // 11 222 3
            // june juney tom lun
            // june june juney juney juney tom
            // junejune / juneyjuney /
            // june june junejune junejune

            if (String.valueOf(sb).contains(String.valueOf(count))) {
                ban.add(id_list[i]);
            }
        }

        // ban : b d
        ArrayList<String> attacker = new ArrayList<>();


        for (String a: reportSet
             ) {

            if(
            ban.contains(a.split(" ")[1]))
            {
                attacker.add(a.split(" ")[0]);
            }
        }

// attacker : 벤당한 사람을 신고한 사람 :  a c a  d a
        // 5

        for (int i = 0; i < id_list.length; i++) {
            int emailcount = 0;
            for (int j = 0; j < attacker.size(); j++) {
                if (attacker.get(j).equalsIgnoreCase(id_list[i])){
                    emailcount++;
                }
            }
            answer[i] = emailcount;
        }

        for (int an :answer
             ) {
            System.out.println(an);
        }

    }
}