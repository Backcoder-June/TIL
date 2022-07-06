package Campus.Ch12MultiThread;


public class Runnable02 {
    public static void main(String[] args) {
                                                                       //메인메소드 안의 내부 인터페이스
        java.lang.Runnable r1 = new java.lang.Runnable() {             //익명객체사용 main 메소드 안에서
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("스레드 : " + i);
                }
            }
        };

        Thread tr1 = new Thread(r1);          //쓰레스 생성하면서 마찬가지로 runnable 가진 익명객체 넣어줌 (사실이게 ar1 인거지 )
        tr1.start();
        System.out.println("끝나면 메인종료");



    }
}

