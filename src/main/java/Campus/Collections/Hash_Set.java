package Campus.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        set.add(100);
        set.add(3.14);
        set.add("settest");
        set.add(new A(10, "jake", 3.14));

        System.out.println(set.size());
        set.remove(100);
        set.remove(1);   // 없는건 그냥 무시

        System.out.println("비었습니까? : " + set.isEmpty());
        System.out.println("이거 존재합니까? : " + set.contains(3.14));
        System.out.println(set.size());


        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("이터레이터로 뽑기 : " + iterator.next());
        }

        for (Object A : set
        ) {
            System.out.println("foreach 로 뽑기 : "+A);
        }




    }
}