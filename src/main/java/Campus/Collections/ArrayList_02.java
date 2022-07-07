package Campus.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_02 {
    public static void main(String[] args) {

        String[] arr = {"java", "db", "client", "WAS", "ai"};
        arr[4] = "Spring";        // 수정 / 재할당

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String a : arr
             ) {
            System.out.println("foreach로뽑기 : " + a);

        }

        class Employee {
        }


        ArrayList list = new ArrayList();

        list.add("java");
        list.add("db");
        list.add("client");
        list.add("WAS");
        list.add("ai");
        list.add(142);
        list.add(new Employee());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println( list.get(i));
//        }

        for (Object s : list
             ) {
            System.out.println("object 로 뽑기" + s.toString());
        }
//        for (String s : list) {
//            System.out.println(s);
//        }

/*

        Object t = 234;
        Object y = "sadg";

        System.out.println(t + " : " + y);
*/





    }
}
