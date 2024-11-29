package Day21;

import java.math.BigInteger;

public class Test1 {
    public static void main(String[] args) {

        BigInteger getsum =getsum(1000);
        System.out.println(getsum);
    }

    private static BigInteger getsum(int i) {
        if (i==1){
            return BigInteger.valueOf(1);
        }
        System.out.println(i);
        return BigInteger.valueOf(i).multiply(getsum(i-1));
    }
}
