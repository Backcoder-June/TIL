package Campus.Collections;

import java.util.HashMap;
import java.util.Set;

public class Map_Phone {

    public static void main(String[] args) {

        String names[] = {"우리엄마", "내친구", "회사동료", "내동생"};
        String phon1[] = {"010-1234-5678", "02-111-222", "umma@multi.com"};
        String phon2[] = {"010-9876-5432", "02-123-4567", "031-3333-44444", "myfriend@multi.com"};
        String phon3[] = {"010-1212-4444", "02-6775-5656", "company@multi.com"};
        String phon4[] = {"010-1111-5678"};
        //names배열문자열 - key
        //names[0] value = phone1 배열값들
        HashMap<String, String[]> phone = new HashMap();


        phone.put(names[0], phon1);
        phone.put(names[1], phon2);
        phone.put(names[2], phon3);
        phone.put(names[3], phon4);


        for (String[] ss: phone.values()
             ) {
            System.out.println(ss);
        }

        Set<String> key_name = phone.keySet();


//        for (int i = 0; i < names.length; i++) {
//            if (names[i].contains(args[0])) {                 //phone.containsKey(args[0])

            if (phone.containsKey(args[0])){
                   String[] list2 = phone.get(args[0]);

                System.out.print(args[0] + " - " );

                for (String s : list2
                ) {
                    System.out.print(s+" " );
                }
            }else {
                System.out.println("해당정보는 없습니다.");
            }

        System.out.println("\n"+"===================");





            for (String info: key_name
                 ) {
                String[] list = phone.get(info);
                System.out.print(info +" - ");
                for (String aa: list
                     ) {
                    System.out.print(aa + ", ");
                }

                System.out.println();
            }



            //phone 모든값 출력
            //우리엄마 - "010-1234-5678", "02-111-222", "umma@multi.com"
            //내친구 - "010-9876-5432", "02-123-4567", "031-3333-44444", "myfriend@multi.com"
            //....


        }

    }



