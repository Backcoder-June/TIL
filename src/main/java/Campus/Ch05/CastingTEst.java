package Campus.Ch05;

class Parent{

    int su = 10;
    public void me(){
        System.out.println(su);
    }

    public void p_method(){
        System.out.println("Parent클래스");
    }
}

class Child extends Parent{

    int su = 20 ;
    public void me(){
        System.out.println(su);
    }

    public void c_method(){
        System.out.println("Child 클래스");
    }
}




public class CastingTEst {

    public static void main(String[] args) {

        System.out.println("부모");
        Parent p1 = new Parent();
        System.out.println(p1.su);

        p1.me();

        p1.p_method();

        System.out.println("자식");
        Child c1 = new Child();
        System.out.println(c1.su);

        c1.me();

        c1.c_method();
        c1.p_method();

        System.out.println("자식 부모행세");
        Parent p2 = new Child();
        System.out.println(p2.su);

        p2.me();

        p2.p_method();

         Child c5 = (Child) p2;
         c5.c_method();


         ((Child) p2).c_method();         //그냥 이렇게 바로 쓴다
                                            // .도 연산자라서, 형변환 부분 겉에 괄호로 먼저하라고 해줘야 제대로 된다.

//        (Child)p2.c_method();            <= 오류




     //
    }

}
