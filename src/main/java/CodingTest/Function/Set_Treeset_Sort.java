package CodingTest.Function;

import java.util.*;

public class Set_Treeset_Sort {
    public static void main(String[] args) {

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
        LinkedHashSet<Integer> hashSet2 = new LinkedHashSet<Integer>();
        for (int a = 1; a<=10000; a++) {
            String b = Integer.toString(a);
            int sum = 0;
            for (int i = 0; i<b.length(); i++){
                sum += Integer.parseInt(String.valueOf(b.charAt(i)));}
            hashSet.add(a);
            hashSet2.add((a + sum));
            hashSet.removeAll(hashSet2);}


        for (Integer list: hashSet
        ) {
            System.out.println(list);}
    }
}

// TreeSet 으로 sort 하기
//        TreeSet<Integer> sorting = new TreeSet();
//        sorting.addAll(hashSet);
// ArrayList 로 sort 하기 ( Collections.sort( ) )
//        List<Integer> sorted = new ArrayList<>(hashSet);
//
//        Collections.sort(sorted);



//        for (Integer result: sorting) {
//            System.out.println(result);}
