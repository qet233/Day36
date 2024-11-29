package Day17;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Test2 {
    public static void main(String[] args) {
        BigInteger bd1 =BigInteger.valueOf(16);
        BigInteger bd2 =BigInteger.valueOf(16);
        BigInteger  bd3 =new BigInteger("12345699999999999");
        System.out.println(bd1.equals(bd2));
        System.out.println(bd1==bd2);
        bd1 = bd1.add(bd2);
        System.out.println(bd1.intValue());
        BigDecimal bd4 = new BigDecimal("0.9");
        BigDecimal bd5 = new BigDecimal("0.1");
        System.out.println(bd4.add(bd5));
//        BigDecimal bd6 = new BigDecimal(0.9);
//        BigDecimal bd7 = new BigDecimal(0.1);
//        System.out.println(bd6.add(bd7));
        BigDecimal bd8 = BigDecimal.valueOf(0.1);
        System.out.println(bd8);
        System.out.println(bd4.divide(bd5, 2, RoundingMode.HALF_UP));

    }
}
