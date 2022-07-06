package Campus.Ch12MultiThread;

class A extends Thread {
    String name;

    A(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "스레드 : "  + i);
        }
    }
}


public class MultiThread {
    public static void main(String[] args) {

        A a1 = new A("one");
        A a2 = new A("two");

        a1.start();
        a2.start();

        System.out.println("끝나면 메인종료");



    }
}
