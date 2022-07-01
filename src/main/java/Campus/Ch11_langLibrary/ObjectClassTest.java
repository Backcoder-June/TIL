package Campus.Ch11_langLibrary;

class MyObject {

    String msg;

    MyObject(String msg) {
        this.msg = msg;
    }


    @Override
    public String toString() {
        return "MyObject{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof MyObject) {
            return this.msg.equals(((MyObject) obj).msg);   //obj 들어온걸 형변환해서 msg 꺼내서 비교 (여기서 equals 는 기본 문자열 비교)
            //equals 다형성 - 지금 오버라이딩은 객체비교 equals
        } else {
            return false;
        }


    }

}

public class ObjectClassTest {




    public static void main(String[] args) {



        MyObject o1 = new MyObject("MyObject");
        MyObject o2 = new MyObject("MyObject");
        System.out.println(o1);
        System.out.println(o1.toString());
        System.out.println(o2);
        System.out.println(o2.toString());

        if(o1==o2){
            System.out.println("o1=o2");
        }

        if (o1.equals(o2)) {
            System.out.println("o1 equals o2 ");
        }


    }
}
