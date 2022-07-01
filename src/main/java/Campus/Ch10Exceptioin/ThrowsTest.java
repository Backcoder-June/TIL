package Campus.Ch10Exceptioin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Test{
    void m1(int i) {
        //throws => m1 메소드에서 이 예외 발생할거야.
        if (i == 0){ throw new ArithmeticException("g"); }
        System.out.println(100/i);                          //근데 난 처리안하고 던질게. 뒤에서 나 쓰는데서 받아라
    }
    void m2(){
        m1(0);
//            System.out.println(" 5번에서 생긴 예외 던진거 제가 받았습니다.");
        }


    void m3(){
        try {
            m1(0);}
        catch (ArithmeticException e ){
            m1(100);
        }

        }

    void m4(){
        try {
            FileReader fr = new FileReader("a.txt"); }
//        catch (IOException e){e.printStackTrace();}
        catch (IOException e){e.printStackTrace();}
    }


}



public class ThrowsTest {
    public static void main(String[] args) {

        Test t1 = new Test();

        t1.m2();

        t1.m3();

        t1.m4();


        //
    }
}
