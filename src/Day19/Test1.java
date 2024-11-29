package Day19;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        long time = System.currentTimeMillis();
        System.out.println(new Date(time));
        System.out.println(time);

        String str = "2004年7月22日 12时59分50秒";
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(df.format(d));
        Date d1 = df.parse(str);
        System.out.println(df.format(d1));


    }
}
