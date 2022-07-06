package Campus.Ch12MultiThread;

class Data {
    int value;
    public void saveValue(int value){
        this.value = value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { }
        System.out.println(Thread.currentThread().getName() +" : " + this.value);
    }
}

class DataThread1 extends Thread{

    Data d;
    DataThread1(String name, Data d){
        super(name);
        this.d = d;
    }
    @Override
    public void run() {

        d.saveValue(10);

    }
}


class DataThread2 extends Thread{

    Data d;
    DataThread2(String name, Data d){
        super(name);
        this.d = d;
    }
    @Override
    public void run() {

        d.saveValue(20);

    }
}




public class Synchonized_Key {
    public static void main(String[] args) {

        Data d = new Data();

        DataThread1 t1 = new DataThread1("스레드1", d);
        DataThread2 t2 = new DataThread2("스레드2", d);
        /*if (t1.d == t1.d) {
            System.out.println("SAME");   // 스레드 t1, t2 가 같은 객체 Data d 를 공유하고 있다.
        }
*/
        t1.start();
        t2.start();
    }
}
