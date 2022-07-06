package Campus.Collections;
class MusicThread extends Thread{
    //상속 . 생성자. 오버라이딩 - 음악듣는중입니다 3번 출력
    MusicThread(String music) {
    }

    @Override
    public void run() {
        for (int a = 0; a < 3; a++) {
            System.out.println("music thread");
        }
    }
}

class DownloadThread extends Thread{
    //상속 . 생성자. 오버라이딩  - 다운로드중입니다 10번 출력

    DownloadThread(String down) {
    }

    @Override
    public void run() {
        for (int a = 0; a < 10; a++) {
            System.out.println("down thread");
        }
    }
}

class NewsThread extends Thread{
    //상속 . 생성자. 오버라이딩  - 뉴스보는 중입니다 5번 출력

    NewsThread(String news) {
    }

    @Override
    public void run() {
        for (int a = 0; a < 5; a++) {

            System.out.println("new thread");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread arr[] = new Thread[3]; //class A extends Thread
        arr[0] = new MusicThread("음악");
        arr[1] = new NewsThread("뉴스");
        arr[2] = new DownloadThread("다운로드");

        /*3개 스레드 실행 시작 메소드 호출 */

        arr[0].start();
        arr[1].start();
        arr[2].start();
        System.out.println("main 종료");




        /* 음악듣는중입니다
         * 음악듣는중입니다
         * 음악듣는중입니다
         * 다운로드중입니다
         * 뉴스보는 중입니다
         * 음악듣는중입니다
         * 음악듣는중입니다
         * ....
         *
         *   */


    }

}










