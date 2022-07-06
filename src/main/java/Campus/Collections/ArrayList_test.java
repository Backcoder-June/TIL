package Campus.Collections;

import java.util.ArrayList;

class SameSentence {
    public ArrayList compare(ArrayList l1, ArrayList l2) {

        ArrayList rest = new ArrayList();
        if (l1.size() == l2.size()) {
            for (int i = 0; i < l1.size(); i++) {

                if ((l1.get(i).toString()).length() == (l2.get(i).toString()).length()) {

                    if ((l1.get(i).toString()).equals((l2.get(i).toString()))) {

                        rest.add(l1.get(i).toString());
                    }
                }
            }
            }
        else {
            rest.add(l1.size());
            rest.add(l2.size());
            }
        return rest;
    }
}

public class ArrayList_test {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("자바는 객체지향 언어입니다");
        list1.add("우리는 멀티캠퍼스에서 자바를 배우는 중입니다");
        list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
        list1.add("내일은 입출력과 네트워크를 배울 예정입니다 ");

        ArrayList list2 = new ArrayList();
        list2.add("자바는 객체지향 언어입니다");
        list2.add("우리는 MULTI에서 자바를 배우는 중입니다");
        list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
        list2.add("내일은 입출력과 네트워크를 배울 예정입니다 ");

        ArrayList list3 = new ArrayList();
        list3.add("자바는 객체지향 언어입니다");
        list3.add("우리는 kitri에서 자바를 배우는 중입니다");
        list3.add("오늘은 콜렉션 프레임워크를 배우죠! ");

        SameSentence ss = new SameSentence();
        ArrayList result1 = ss.compare(list1, list2);

        //result1에는 list1, list2의 문자열 갯수 같은 인덱스의 문자열을 비교하여 같은 문자열만 저장 ArrayList 리턴, 출력
        //구현할 것

        ArrayList result2 = ss.compare(list1, list3);
        //result2 list1, list3의 문자열 갯수 같지 않을 때
        //list1의 갯수, list3 갯수 출력 구현할 것

        for (int i = 0; i < result1.size(); i++) {
            System.out.println(result1.get(i));
        }
        for (int j = 0; j < result2.size(); j++) {
            System.out.println(result2.get(j));
        }

    }
}