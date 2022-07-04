package Campus.Ch11_langLibrary.ObjTest;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class MySum {

    int first;
    int second;


    MySum(int first, int second){
        this.first = first;
        this.second = second;}


    @Override
    public String toString() {
        return String.valueOf(first + second);
    }

    public boolean equals(Object obj) {
        if (obj instanceof MySum) {
            return (String.valueOf(this.first+this.second)).equals(obj.toString());
        } else {
            return false;
        }

    }

        public String createTime(){
            LocalDateTime current = LocalDateTime.now();

            DecimalFormat df = new DecimalFormat("00");
            String month = df.format(current.getMonthValue());
            String day = df.format(current.getDayOfMonth());

            return current.getYear()+"년도 "+month+"월 " + day+"일 "
            + current.getHour()+"시 "+ current.getMinute()+"분 " + current.getSecond()+"초";
        }



    }

    /* 조건1 - toString */


    /* 조건2 - equals  */

    /* 조건3 - createTime */


/*

조건1: main 메소드에서 MySum 객체를 출력하면
        객체 생성시에 전달한 두 정수의
        덧셈 결과를 출력하도록 toString 메소드를 오버라이딩합니다.

        예)
        MySum ms1 = new MySum(i, j);
        System.out.println(ms1);//30

        호출시에 출력값은 i와 j의 산술 연산 덧셈 결과입니다.
        (참고 :
        String.valueOf 메소드는 int를 String으로 변경합니다)

        조건2: main 메소드에서 MySum 클래스의
        equals 메소드 호출시
        전달하는 매개변수가 MySum 객체를 참조하고
        현재 객체의 toString 메소드와
        전달 객체의 toString 메소드
        내용이 동일하면 true를 리턴하고
        나머지 경우에는 false 를 리턴하도록
        equals 메소드를 오버라이딩합니다.

        예)
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(j, i);
        String s1 = new String("30");

        ms1.equals(ms2); //true
        ms1.equals(s1)://false

        조건3 :
        MySum 타입의 객체 출력시 시각 정보를 생성하여 String 타입으로 리턴합니다.

        예)
        ms1.createTime(); //2022년도 07월 04일 13시 25분 56초

*/


