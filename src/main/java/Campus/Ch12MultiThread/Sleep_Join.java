package Campus.Ch12MultiThread;

class C extends Thread{
    int data = 10;
    public void run(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        data = data * 2;
        System.out.println("data : " + data);
    }
}
public class Sleep_Join {
    public static void main(String[] args) {
        System.out.println("main 시작");
        C c1 = new C();     // 멀티스레드 객체 생성한것 (상속하고있으니까)
                            // 지금의 c1.data = 10; run 을 아직 안돌린 거니까

        c1.start(); //run 호출. 실행준비 // (run 준비까지만 하지 즉각실행 X  // 번호표 뽑고 기다리는 중 => 아직 c1.data = 10; )
                    //근데 메인스레드가 먼저 실행되고 있었으니까, 메인스레드 마저 실행하는게 우선순위임.
                    //main이 끝나고 나서야 => run 이 실행되는것. 그래서 run 마지막에 data 뽑아보면 20 나옴
                    // main 에서 찍히는 data 는 10일수밖에 없고, 끝나고 run에서 직접 찍어본 data는 드디어 20이 나옴

        try {
            c1.join();  // 메인스레드실행중인데, c1스레드 조인함. c1한테 양보하세요! => run부터 실행됨
        }catch (InterruptedException e){ }
                        // 메인이 중단되고 run 실행 -> run 실행되고 sleep 2초-> main 마저 실행


        System.out.println(c1.data);
        System.out.println("main 종료");

    }
}
