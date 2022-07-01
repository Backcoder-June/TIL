package Campus.Ch10Exceptioin;

import java.io.FileReader;
import java.io.IOException;

class A{
    void m1(int i) throws ArithmeticException, IOException {
        FileReader fr = new FileReader("a.txt");
        System.out.println(100/i);
    }

    void m2() throws ArithmeticException, IOException{
        m1(0);
    }


}



public class ThrowsTest2 {
    public static void main(String[] args){

        A a1 = new A();
try { a1.m2(); }
//catch (ArithmeticException e){e.printStackTrace();}  //runtime  exception
catch (IOException e){e.printStackTrace();}


        //
    }
}
