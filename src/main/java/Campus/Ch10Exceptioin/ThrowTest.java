package Campus.Ch10Exceptioin;

class B {
    void m1(int i) {
        if (i == -1) {
            throw new ArithmeticException("throw 는 예외 메세지를 줄 수 있다"); }
        else { System.out.println(100 / i);}
    }
}


public class ThrowTest {
    public static void main(String[] args) {

        B b1 = new B();

try { b1.m1(-1);}
catch (ArithmeticException e){

    System.out.println(e.getMessage());
}





    }
}
