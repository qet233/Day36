package Day25;

public class Test_1 {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }
    public static int getSum(int... a){
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
