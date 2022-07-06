package Campus.Ch12MultiThread;

class B implements java.lang.Runnable {
    String name;

    B(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "스레드 : "  + i);
        }
    }
}


public class Runnable {
    public static void main(String[] args) {

        B a1 = new B("one");
        B a2 = new B("two");

        Thread ta1 = new Thread(a1);
        Thread ta2 = new Thread(a2);

        ta1.start();
        ta2.start();



        System.out.println("끝나면 메인종료");



    }
}

