package Campus.Ch05;

class Implementing implements Student, Worker {

    String name = "전역네임";

    @Override
    public void study() {
        System.out.println(Student.name + "은 공부한다." + this.name);
    }

    @Override
    public void work() {
        System.out.println(Worker.name + "은 일한다.");
    }

    @Override
    public void lunch() {
        System.out.println("사람은 점심 먹는다");
    }
}

public class ImplementsTest{
    public static void main(String[] args) {

        Implementing sw = new Implementing();
        sw.study();
        sw.lunch();
        sw.work();

        // Interface 객체 형변환
        Student sw2 = new Implementing();  // Student 인터페이스의 메소드 중, 오버라이딩 한 것들을 사용가능 ㅡ
        sw2.lunch();                            // 부모에 없는건 당연히 못쓴다.
        sw2.study();

        Worker sw3 = new Implementing();
        sw3.lunch();
        sw3.work();










        //
    }
}
