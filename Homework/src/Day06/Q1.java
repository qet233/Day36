package Day06;

public class Q1 {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1.22;
        System.out.println(getMin(a,b));
    }
    public static double getMin(double a , double b){
        double max = a>b?a:b;
        return max;
    }
}
