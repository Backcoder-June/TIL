package Campus.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set_Lotto {
    public static void main(String[] args) {

        HashSet<Integer> lotto = new HashSet();

        while (lotto.size() != 6) {
            int number = (int)(Math.random()*45+1);

            lotto.add(number);
        }



        TreeSet<Integer> sorted_number = new TreeSet();
        sorted_number.addAll(lotto);




        System.out.print("제 로또번호는 [ ");
        for (Integer n: lotto
             ) {
            System.out.print( n+" " );}
        System.out.print("] 입니다!\n");

        System.out.println("======sorting=========");
        // 중복 때문에 6개 개수 함부로 주면 안됨
        System.out.print("제 로또번호는 [ ");
        Iterator<Integer> iterator = sorted_number.iterator();
        while (iterator.hasNext()){
            System.out.print( iterator.next() +" " );}
        System.out.print("] 입니다!\n");





    }



}
