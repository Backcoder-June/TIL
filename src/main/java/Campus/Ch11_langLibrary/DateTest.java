package Campus.Ch11_langLibrary;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {


        LocalDate current = LocalDate.now();


        System.out.println(current);


        System.out.println(current.getYear());
        System.out.println(current.getMonth());
        System.out.println(current.getDayOfMonth()); //
        LocalDateTime ct = LocalDateTime.now();

        System.out.println(ct);
        System.out.println(ct.getHour());
        System.out.println(ct.getMinute());
        System.out.println(ct.getSecond());


        System.out.println("--local--");





        Calendar cal = Calendar.getInstance();

        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);


        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");





        System.out.println("포멧과 캘린더조합 : "+dateFormat.format(cal));



//        long mill = System.currentTimeMillis();


//        Date now = new Date();

//        Date now2 = new Date(mill);            // currentTimeMillis 도 현재시간을 나누고나눠서 초로 만들어논거라 그거 가져다 Date 로 만들수도있음
                                                // 들어갈 수 있는건 long 타입. 그래서 mill 가능



//        System.out.println(now);

//        System.out.println(now2);




    }
}
