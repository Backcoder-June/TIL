package Campus.Ch11_langLibrary.ObjTest;

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






    }
}
