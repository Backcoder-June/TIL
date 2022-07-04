package Campus.Ch11_langLibrary.ObjTest;

import java.util.StringTokenizer;

public class OverridingTest {
    public static void main(String[] args) {

        int i = 10;
        int j = 20;

        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(j, i);


        System.out.println(ms1);//30
        System.out.println(ms2);//30

        if(ms1.equals(ms2)) {

            System.out.println("ms1과 ms2의 합계는 동일합니다.");
        }

        String s1 = new String("30");
        if(ms1.equals(s1)) {
            System.out.println("ms1과 s1은  동일합니다.");
        }

        System.out.println("ms1 객체를 출력한 시각은 " + ms1.createTime() + " 입니다.");

        int b= 3323;
        String a = "a-fd,afa sdf";
        String[] split = a.split("(,|-| |[+])");

        double num = 40;

        System.out.println(num);
        System.out.println(split[0]+" /// "+split[1] +"//"+ split[2] + "//" + split[3]);

        String[] phone = {"010-2939-tP42", "011-N-142212214214"};

        System.out.println( phone[0].matches("(010|011)-[0-9]{3,4}-[A-z0-9]{4}"));
        System.out.println(phone[1].matches("(010|011)-(Y|N){1}-\\d{4,}"));

        StringTokenizer tk = new StringTokenizer(a," -,:");

        while (tk.hasMoreTokens()){
        String s = tk.nextToken();
            System.out.println(s);}


    }
}
