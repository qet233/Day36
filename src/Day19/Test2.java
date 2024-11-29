package Day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        //解析
        Date d = sdf.parse(str);
        //格式化
        System.out.println(sdf1.format(d));

    }
}
