package Day06;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        System.out.println(Arrays.toString(copyOf(arr, 3)));
    }
    public static int[] copyOf(int[] arr, int newLength){
        int[] brr = new int[newLength];
        for (int i = 0;i<newLength;i++){
            brr[i] =arr[i] ;
        }

        return brr ;
    }
}
