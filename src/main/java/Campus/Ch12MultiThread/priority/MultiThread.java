package Campus.Ch12MultiThread.priority;

class A extends Thread {

    A(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(getName() +"의 우선순위 : " + getPriority());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) { }
            System.out.println(getName() + "스레드 : "  + i);
        }
    }
}


public class MultiThread {
    public static void main(String[] args) {

        A a1 = new A("one");
        A a2 = new A("two");

//        a1.setPriority(Thread.MIN_PRIORITY);
//        a2.setPriority(Thread.MAX_PRIORITY);

        a1.start();
        a2.start();

        System.out.println("끝나면 메인종료");



    }
}
