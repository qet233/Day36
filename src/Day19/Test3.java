package Day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        String startstr = "2023年11月11日 0:0:0";
        String endstr = "2023年11月11日 0:10:0";
        String orderstr = "2023年11月11日 0:10:00";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf1.parse(startstr);
        Date endDate = sdf1.parse(endstr);
        Date orderDate = sdf1.parse(orderstr);
        if (startDate.getTime()<=orderDate.getTime()&&orderDate.getTime()<=endDate.getTime()){
            System.out.println("赶上了");
        } else {
            System.out.println("没赶上");
        }
    }
}
