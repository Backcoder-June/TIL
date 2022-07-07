package Campus.Collections;

import java.util.HashMap;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {

        HashMap map = new HashMap();

        A e1 = new A(13, "ewon", 10);

        map.put(1, new A(10, "luna", 300));
        map.put(2, new A(11, "tera", 400));
        map.put(3, new A(12, "penta", 500));
        map.put(4, e1);
        map.put(5, e1);

        //수정 재할당
        map.put(2,new A(11, "teran", 800) );

        System.out.println(map.size());

        System.out.println(map.get(2));



        for (Object o : map.values()
             ) {
            System.out.println( o );
        }




        Set keySet = map.keySet();   // key값들 뽑아보고 싶을 때

        for (Object ob : keySet
             ) {
            System.out.println("key : " +ob+ ", value : "+ map.get(ob));
        }




        /*// Generic 이 설정되어있지 않을 때, 형변환해서 사용하기
        Object o = map.get(4);
        if (map.get(4) instanceof A) {
            System.out.println(((A)o).name); }

*/


    }
}
