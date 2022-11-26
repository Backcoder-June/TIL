package Programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateTest {
    public static void main(String[] args) throws ParseException {

        String s = "2022:12:06:23:09:30";
        String t = "01:20:00";

        String year = s.substring(0, 4);
        String month = s.substring(5, 7);
        String day = s.substring(8, 10);

        SimpleDateFormat smf = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");

        Date date = smf.parse(s);
        Date date2 = smf.parse(year+":" + month + ":" + day + ":" + t);

        System.out.println(date);
        System.out.println(date2);

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        calendar.add(Calendar.HOUR, date2.getHours());
        calendar.add(Calendar.MINUTE, date2.getMinutes());
        calendar.add(Calendar.SECOND, date2.getSeconds());

        System.out.println(smf.format(calendar.getTime()));






    }
}
