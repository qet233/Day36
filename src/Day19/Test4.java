package Day19;

import java.util.Calendar;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date();
//        c.setTime(d);
        c.set(Calendar.YEAR,2000);
        c.add(Calendar.YEAR,1);
        int year = c.get(Calendar.YEAR);
        System.out.println(c);
        System.out.println(year);
        //月份 0-11 星期天（1）
    }
}
