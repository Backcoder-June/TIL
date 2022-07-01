package Campus.Ch09;




class A {

    interface I  {
        void m1();
        void m2();  }

//    I i1 = new I();  이건 객체생성

    //원래는 구현할 class B 같은 거 하난 만들어서 구현하고 그 B를 객체생성해서 그걸로 인터페이스 사용하는데
    //그걸 간결하게 해주는 문법


    //익명의클래스타입 객체 생성
    // i1 무명의 객체     // 1. I 를 상속하는 class B 를 하나 정의하고 구현하는거고, + 2. B 의 객체까지 동시에 만들어버리는것
    I i1 = new I(){              //인터페이스 I 상속받아 익명(Anonymous) 클래스 정의 동시에 객체 생성 / 안드로이드 앱 만들때 많이쓰임
        @Override               //클래스 객체 설명을 하면서 동시에 객채를 진짜 생성까지
        public void m1() {
            System.out.println("g");
        }
        @Override
        public void m2() {
            System.out.println("d");
        }
    };   //세미클론 위치!



    }


public class InnerClass {
    public static void main(String[] args) {


        A a1 = new A();
        a1.i1.m1();
        a1.i1.m2();

        //내부 인터페이스니까 마찬가지로 뽑을 때는, 저 내부에요 표시해줘야함
    }



}
