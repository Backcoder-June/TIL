package Campus.Lambda;

interface I1{
    void m1();
}

interface I2{
    void m1(int x);
}
interface I3{
    void m1(int x, int y);
}

interface I4{
    int m1(int a, int b);
}

// 인터페이스여야하고 + 1개 메소드만 정의할때 => Functional interface 일때

public class LambdaTest {
    public static void main(String[] args) {

        I1 i1 = () -> {System.out.println("First Lambda");};

        i1.m1();

        I2 i2 = (int x)->{System.out.println(x);};

        i2.m1(100);

        I3 i3 = (int x, int y)->{System.out.println(x+y);};

        i3.m1(2,3);

        // 모든 매개변수에 type 생략가능 => 어짜피 오버라이딩 할 메소드 1개기 때문에 알아서 인식함

        I2 i23 =  (x)->{System.out.println(x);};
        I3 i32 = (x, y) -> {System.out.println(x*y);};

        // 매개변수 하나일 때, 매개변수 괄호도 생략할 수 있다

        I2 i24 = x -> System.out.println(x);

        // 실행문장이 딱 한문장만 있을 땐, { } 도 생략할 수 있다.
        // 두문장 이상일 땐 { } 필수
        I2 i25 = x -> {System.out.println(x);
        System.out.println(x+x);};

        i25.m1(200);

        // 리턴타입 있는 메소드는 바로 return 만 써주면 된다.
        // 리턴타입 문장이 하나만 있을 땐, return 키워드도 생략 가능/단 괄호도 같이 생략해야함
        I4 i4 = (a, b) -> { return a+b;};

        I4 i5 = (a,b) -> a+b;

        int result = i4.m1(100, 200);
        System.out.println(result);











//
    }
}
