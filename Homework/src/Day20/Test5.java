package Day20;


import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //JDK7
        Calendar instance = Calendar.getInstance();
        instance.set(2004, 2,1);
        instance.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        //JDK8
        LocalDate ld = LocalDate.of(2004, 3, 1);
        ld=ld.minusDays(1);
        System.out.println(ld.getDayOfMonth());
    }
}
